package kieker.otel.translation.generator.python

import kieker.otel.translation.otkt.OtelSpan
import kieker.otel.translation.otkt.DefaultMonitoringRecord
import java.util.List
import kieker.otel.translation.otkt.Mapping

class DefaultRecordsGenerator extends CustomMappingExporter implements IPythonGenerator{
	
	List<DefaultMonitoringRecord> defaultRecords
	
	new(List<OtelSpan> otelspan, List<DefaultMonitoringRecord> defaultRecords,List<Mapping> mappings) {
		super(otelspan, mappings)
		this.defaultRecords = defaultRecords
	}
	
	
	override generate() {
		'''«FOR span : this.otelspans»
			«FOR record : this.defaultRecords»
			«FOR mapping: this.getMappings(record)»
			«IF mapping.getFrom.getName.equals(span.getName)»
			def send_«record.getName.getName»_«span.getName»(self, span: Span):
				#fetch record name
				lock.acquire()
				record_class_name = "«record.getName.getFqClassName»"
				self.writer_registry.register(record_class_name)
				self.serializer.put_string(record_class_name)
				self.serializer.put_long(time.get_time())
				«FOR param : record.getName.getAttributes»
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
				«ENDFOR»'''
	}
	

	

}