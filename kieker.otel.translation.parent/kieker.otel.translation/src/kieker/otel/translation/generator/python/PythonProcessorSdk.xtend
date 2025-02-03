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
	_«attr.getName» = 0
	«ENDFOR»
	«FOR attr : globalDefaults»
	_«attr.getParamName» = 0
	«ENDFOR»
	class IncrementAttributeSpanProcessor(SpanProcessor):
		_lock = threading.Lock()

		def __init__(self):
			pass
	
		def on_start(self, span: Span, parent_context):
			global span_registry
			span_id = span.get_span_context().span_id
			span_registry[span_id] = span
			«handleGlobalModifiers()»
			
			«handleParentModifiers()»
	
	
		def on_end(self, span: Span):
			pass
	'''
	}
	
	
	def updateParentValue(SpanAttribute attr){
		switch(attr.getAnnotation.getLiteral){
			case "inc": '''IncrementAttributeSpanProcessor._«attr.getName»+=«attr.getValue»'''
			case "dec":'''IncrementAttributeSpanProcessor._«attr.getName»-=«attr.getValue»'''
			case "mult":'''IncrementAttributeSpanProcessor._«attr.getName»*=«attr.getValue»'''
			case "divide":'''IncrementAttributeSpanProcessor._«attr.getName»/=«attr.getValue»'''
			default: throw new Exception("Invalid Annotation")
		}
	}
	
		def updatePGlobalValue(SpanAttribute attr){
		switch(attr.getAnnotation.getLiteral){
			case "inc": '''«attr.getName»+=«attr.value»'''
			case "dec":'''«attr.getName»-=«attr.value»'''
			case "mult":'''«attr.getName»*=«attr.value»'''
			case "divide":'''«attr.getName»/=«attr.value»'''
			default: throw new Exception("Invalid Annotation")
		}
	}
	
	private def handleGlobalModifiers() {
		'''«IF !this.globalyModifiedAttributes.empty || !this.globalDefaults.empty»
			with self.__class__._lock:
				
				«FOR attr: this.globalyModifiedAttributes»
				global _«attr.getName»
				«updatePGlobalValue(attr)»
				span.set_attribute("«attr.getName»",IncrementAttributeSpanProcessor._«attr.getName»)
				«ENDFOR»
				«FOR attr : globalDefaults»
				global _«attr.getParamName»
				_«attr.getParamName»+=«attr.getAnnotation.getValue»
				span.set_attribute("«attr.getParamName»",_«attr.getParamName»)
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
	
	
	
	
}