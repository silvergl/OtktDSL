package kieker.otel.translation.generator.python

import kieker.otel.translation.otkt.OtelSpan
import java.util.List
import mappingModel.Mapping

class PythonDefaultMappingGenerator implements IPythonGenerator {
	
	List<Mapping> defaultMappings 
	new(List<OtelSpan> otelspan, List<Mapping> defaultMappings) {
		this.defaultMappings = defaultMappings
	}
	
	override generate() {
		var x = 0
		'''
		«FOR mapping : defaultMappings»
		def send_default_«x++»(self, span: Span):
			#fetch record name
			lock.acquire()
			record_class_name = "«mapping.getRecordFQClassName»"
			self.writer_registry.register(record_class_name)
			self.serializer.put_string(record_class_name)
			self.serializer.put_long(time.get_time())
			«FOR rule : mapping.getMappingRules»
			«this.serializePutStatementDefault(rule.getFrom)»
			«ENDFOR»
			lock.release()
			binarized_record = self.serializer.pack()
			# try to send
			try:
				self.list_bytes.append(binarized_record)
			except Exception as e:
				# TODO: Better exception handling for tcp
				print(repr(e))
									
		«ENDFOR»
		'''
	}
	
		private def serializePutStatementDefault(mappingModel.SpanParam span){
		if(span.getParamType.getLiteral.equals("Standard")){
			switch span.getParamName{
				case "start_time": '''self.serializer.put_long(int(span.start_time))'''
				case "end_time":'''self.serializer.put_long(int(span.end_time))'''
				case "trace_id":'''self.serializer.put_long(self.get_trace_id(span.get_span_context().trace_id))'''
				case "span_id":'''self.serializer.put_long(span.get_span_context().span_id)'''
				case "parent": '''parent_span_id = span.parent if span.parent else 0
self.serializer.put_long(parent_span_id)'''
				default: throw new Exception("Invalid Parameter Name for standard span parameter")
			}
		}else{
			switch span.getType.getLiteral{
				case "STRING": '''self.serializer.put_string(span.attributes["«span.getParamName()»"])'''
				case "INT": '''self.serializer.put_int(span.attributes["«span.getParamName()»"])'''
				case "LONG": '''self.serializer.put_long(span.attributes["«span.getParamName()»"])'''
				case "BOOL": '''self.serializer.put_bool(span.attributes["«span.getParamName()»"])'''
				case "FLOAT":'''self.serializer.put_float(span.attributes["«span.getParamName()»"])'''
				case "DOUBLE":'''self.serializer.put_double(span.attributes["«span.getParamName()»"])'''
				default:
						throw new Exception("Invalid Parameter type!")
			}
		}
	}
	
}