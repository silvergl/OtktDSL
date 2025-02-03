package kieker.otel.translation.generator.python

import java.util.List
import kieker.otel.translation.otkt.NewRecord
import kieker.otel.translation.otkt.Mapping
import kieker.otel.translation.otkt.OtelSpan

class PythonNewRecordGenerator extends CustomMappingExporter implements IPythonGenerator {
	List<NewRecord> newRecords 
	
	
	
	
	 new(List<NewRecord> newRecords, List<OtelSpan> otelspan, List<Mapping> mappings){
		super(otelspan, mappings)
		this.newRecords = newRecords
		
	}
	
	override generate() {
		'''
		«FOR span :this.otelspans»
		«FOR record : this.newRecords»
			«FOR mapping:this.getMappings(record)»
			«IF mapping.getFrom.getName.equals(span.getName)»
			def send_«record.getName»_«span.getName»(self, span: Span):
				#fetch record name
				lock.acquire()
				record_class_name = "CustomRecords.«record.getName»"
				self.writer_registry.register(record_class_name)
				self.serializer.put_string(record_class_name)
				self.serializer.put_long(time.get_time())
				«IF record.getType.getLiteral.equals("flow")»
				self.serializer.put_long(int(span.start_time))
				self.serializer.put_long(int(span.end_time))
				self.serializer.put_long(self.get_trace_id(span.get_span_context().trace_id))
				self.serializer.put_long(self.get_span_id(span.get_span_context().span_id))
				parent_span_id = span.parent if span.parent else 0
				self.serializer.put_long(parent_span_id)
				«ENDIF»
				«IF record.getType.getLiteral.equals("beforeafter")»
				self.serializer.put_long(int(span.start_time))
				self.serializer.put_long(int(span.end_time))
				«ENDIF»
				«FOR param : record.getAttributes»
				«this.serializerPutStatement(getCorrespongingSpanEntry(mapping, param))»
				«ENDFOR»
				lock.release()
				binarized_record = self.serializer.pack()
				# try to send
				try:
					self.list_bytes.append(binarized_record)
				except Exception as e:
					# TODO: Better exception handling for tcp
					print(repr(e))
			
			«ENDIF»		
			«ENDFOR»
			«ENDFOR»
			«ENDFOR»
		'''
	}
	

	
	
		
	}
	
	
