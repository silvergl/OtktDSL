package kieker.otel.translation.generator.python



import java.util.List
import kieker.otel.translation.otkt.SpanAttribute

class PythonProcessorSdk {
	
	
	
	// customly named span attributes
	List<SpanAttribute> globalyModifiedAttributes 
	List<SpanAttribute> parentlyModifiedAttributes
	
	//default named span attributes
	List<mappingModel.SpanParam>globalDefaults
	List<mappingModel.SpanParam>parentDefaults
	

	new(List<SpanAttribute> globals,List<SpanAttribute> parents, List<mappingModel.SpanParam> globalDefaults, List<mappingModel.SpanParam> parentDefaults ) {
		this.globalyModifiedAttributes = globals
		this.parentlyModifiedAttributes = parents
		this.globalDefaults = globalDefaults
		this.parentDefaults = parentDefaults
		
	}
	
	
	
	def generate(){
	'''
	from opentelemetry.sdk.trace import SpanProcessor
	from opentelemetry import trace
	from opentelemetry.trace import Span
	import threading
	
	span_registry = {}
	
	«FOR attr: this.globalyModifiedAttributes»
	_«attr.getName»_trace_registry = {}
	«ENDFOR»
	«FOR attr : globalDefaults»
	_«attr.getParamName»_trace_registry = {}
	«ENDFOR»
	class IncrementAttributeSpanProcessor(SpanProcessor):
		_lock = threading.Lock()

		def __init__(self):
			pass
	
		def on_start(self, span: Span, parent_context):
			global span_registry
			«initTraceRegistries»
			span_id = span.get_span_context().span_id
			trace_id = span.get_span_context().trace_id
			span_registry[span_id] = span
			
			«updateRegistries»
			
			«handleGlobalModifiers()»
			
			«handleParentModifiers()»
	
	
		def on_end(self, span: Span):
			pass
	'''
	}
	
	
	private def updateParentValue(SpanAttribute attr) {
		switch (attr.getAnnotation.getLiteral) {
			case "inc": '''IncrementAttributeSpanProcessor._«attr.getName»+=«attr.getValue»'''
			case "dec": '''IncrementAttributeSpanProcessor._«attr.getName»-=«attr.getValue»'''
			case "mult": '''IncrementAttributeSpanProcessor._«attr.getName»*=«attr.getValue»'''
			case "divide": '''IncrementAttributeSpanProcessor._«attr.getName»/=«attr.getValue»'''
			default:
				throw new Exception("Invalid Annotation")
		}
	}

	private def updatePGlobalValue(SpanAttribute attr) {
		switch (attr.getAnnotation.getLiteral) {
			case "inc": '''_«attr.getName»_trace_registry[trace_id]+=«attr.value»'''
			case "dec": '''_«attr.getName»_trace_registry[trace_id]-=«attr.value»'''
			case "mult": '''_«attr.getName»_trace_registry[trace_id]*=«attr.value»'''
			case "divide": '''_«attr.getName»_trace_registry[trace_id]/=«attr.value»'''
			default:
				throw new Exception("Invalid Annotation")
		}
	}
	
	private def handleGlobalModifiers() {
		'''«IF !this.globalyModifiedAttributes.empty || !this.globalDefaults.empty»
			with self.__class__._lock:
				
				«FOR attr: this.globalyModifiedAttributes»
				global _«attr.getName»
				span.set_attribute("«attr.getName»", _«attr.getName»_trace_registry[trace_id])
				«updatePGlobalValue(attr)»
				«ENDFOR»
				«FOR attr : globalDefaults»
				global _«attr.getParamName»
				span.set_attribute("«attr.getParamName»",_«attr.getParamName»_trace_registry[trace_id])
				_«attr.getParamName»_trace_registry[trace_id]+=«attr.getAnnotation.getValue»
				«ENDFOR»
	        «ENDIF»
	'''
	}
	
	
	private def handleParentModifiers(){
		'''«IF !this.parentlyModifiedAttributes.empty || !this.parentDefaults.empty»
					parent_span_context = span.parent
					if parent_span_context is not None:
						# Get the attribute value from the parent span
						parent_span = span_registry[parent_span_context.span_id]
						«FOR attr :this.parentlyModifiedAttributes»
						
						current_value_«attr.getName» = parent_span.attributes["«attr.getName»"]
						# Get the current value of the attribute in the current span
						current_value_«attr.getName» = current_value_«attr.getName»
						# Increment the current span's attribute value
						span.set_attribute("«attr.getName»", current_value_«attr.getName»)
						«ENDFOR»
						«FOR attr :this.parentDefaults»
						current_value_«attr.getParamName» = parent_span.attributes["«attr.getParamName»"]
						# Get the current value of the attribute in the current span
						current_value_«attr.getParamName» = current_value_«attr.getParamName»+«attr.getAnnotation.getValue»
						# Increment the current span's attribute value
						span.set_attribute("«attr.getParamName»",current_value_«attr.getParamName»)
						«ENDFOR»
					else:
						pass
			        «ENDIF»
		'''
	}
	
	
	private def initTraceRegistries() {
		'''
			«IF !this.globalyModifiedAttributes.empty»
			global «FOR attr : this.globalyModifiedAttributes SEPARATOR ","»_«attr.getName»_trace_registry«ENDFOR»
			«ENDIF»
			«IF !this.globalDefaults.empty»
			global «FOR attr : globalDefaults SEPARATOR ","»_«attr.getParamName»_trace_registry«ENDFOR»
			«ENDIF»
		'''
	}
	
	private def updateRegistries() {
		'''
			«IF !this.globalyModifiedAttributes.empty»
				if trace_id not in _«this.globalyModifiedAttributes.get(0).getName»_trace_registry:
					«FOR attr : this.globalyModifiedAttributes»
						«attr.getName»_trace_registry[span.get_span_context().trace_id] = 0
					«ENDFOR»
			«ENDIF»
				
			«IF !this.globalDefaults.empty»
				if trace_id not in _«this.globalDefaults.get(0).getParamName»_trace_registry:
					«FOR attr : this.globalDefaults»
					_«attr.getParamName»_trace_registry[span.get_span_context().trace_id] = 0
					«ENDFOR»
				«ENDIF»
		'''
	}
	
}