package kieker.otel.translation.generator.python


import kieker.otel.translation.otkt.OtelSpan
import java.util.ArrayList
import java.util.List
import kieker.otel.translation.otkt.Mapping
import kieker.otel.translation.otkt.NewRecord
import kieker.otel.translation.otkt.CustomMapping
import kieker.otel.translation.otkt.DefaultMapping
import mappingModel.MappingModel
import kieker.otel.translation.specification.KiekerRecordSpecification
import kieker.otel.translation.otkt.KiekerMonitoringType
import kieker.otel.translation.otkt.DefaultMonitoringRecord
import kiekerrecord.KiekerRecord
import java.util.Map
import java.util.HashMap

class PythonOtelSdkGenerator {



	List<KiekerMonitoringType> records
	List<NewRecord> newRecords = new ArrayList()
	List<DefaultMonitoringRecord> defaultRecords = new ArrayList()

	
	List<Mapping> mappings
	List<mappingModel.Mapping> defaultMappings = new ArrayList()
	MappingModel mappingModel = KiekerRecordSpecification.createMappingModel();
	PythonGenerator pythonGeneratorNewRecord
	PythonGenerator pythonGeneratorDefaultRecord
	PythonGenerator pythonGeneratorDefaultMapping
	List <OtelSpan> spans;
	new(List<KiekerMonitoringType> records, List <OtelSpan> spans, List<Mapping> mappings) {
		this.spans = spans
		this.mappings = mappings
		for (record : records) {
			if (record instanceof NewRecord) {
				this.newRecords.add(record);
			} else {
				this.defaultRecords.add(record as DefaultMonitoringRecord)
			}

		}
		//System.out.println(this.defaultRecords.size())
		for (mapping : this.mappings) {
			if (mapping instanceof DefaultMapping) {
				for (defaultMapping : this.mappingModel.getMappings) {
					if (mapping.getTo().getFqClassName().contains(defaultMapping.getRecordFQClassName)) {
						this.defaultMappings.add(defaultMapping)
					}
				}
			}
		}
		this.pythonGeneratorNewRecord = new PythonGenerator(
			new PythonNewRecordGenerator(newRecords, spans, mappings))
		this.pythonGeneratorDefaultRecord = new PythonGenerator(
			new DefaultRecordsGenerator(spans, defaultRecords, mappings))
		this.pythonGeneratorDefaultMapping = new PythonGenerator(
			new PythonDefaultMappingGenerator(spans, this.defaultMappings))
	}
	
	

	 def  generate() {
		'''
			«this.imports()»
			
			«this.classdef»
			
				«this.onNewRecord»
			
				«this.sendData»
				
				«this.translateTraces»
				
				«this.translateSpans»
			

			
		'''
	}

	private def imports() {
		'''import socket
import threading
from struct import pack
from opentelemetry.sdk.trace import Span
from opentelemetry.sdk.trace.export import SpanExporter
from monitoring.fileregistry import WriterRegistry
from monitoring.serialization import BinarySerializer
from monitoring.controller import TimeStamp
from opentelemetry.sdk.trace.export import SpanExporter, SpanExportResult
from datetime import datetime, timezone
lock = threading.Lock()
time = TimeStamp()
		'''
	}

	private def classdef() {
		var x = 0
		'''class KiekerTcpExporter(SpanExporter):
		
	def __init__(self, host="127.0.0.1", port=4137):
		self.host = host
		self.port = port
		self.sock = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
		self.sock.connect_ex((self.host, self.port))
		self.writer_registry = WriterRegistry(self)
		self.serializer = BinarySerializer([], self.writer_registry)
		self.trace_dict = {}
		self.current_id = 1
		self.span_dict={}
		self.current_span_id = 1
		self.list_bytes = []
	
	def export(self, spans):
		for span in spans:
			«FOR span : this.spans»
			if span.name =="«span.getName»":
				«FOR record : this.newRecords»
				«FOR mappings: this.getMapping(record)»
				«IF mappings.getFrom.getName.equals(span.getName)»
				self.send_«record.getName»_«span.getName»(span)	
				«ENDIF»
				«ENDFOR»
				«ENDFOR»
				«FOR record : this.defaultRecords»
				«FOR mappings: this.getMapping(record)»
				«IF mappings.getFrom.getName.equals(span.getName)»
				self.send_«record.getName.getName»_«span.getName»(span)
				«ENDIF»
				«ENDFOR»
				«ENDFOR»
				«FOR record : this.defaultRecords»
				«FOR mapping:this.getDefaultMapping(record)»
				«IF mapping.getFrom.getName.equals(span.getName)»
				self.send_default_«x++»(span)
				«ENDIF»
				«ENDFOR»
				«ENDFOR»
			«ENDFOR»
		concatenated = b"".join(self.list_bytes)
		self.list_bytes= []
		try:
			self.sock.sendall(concatenated)
		except Exception as e:
			print(repr(e))
		return SpanExportResult.SUCCESS'''
	}

	private def onNewRecord() {
		'''
	def on_new_registry_entry(self, value, idee):
		# int - id, int-length, bytesequences
		# encode value in utf-8 and pack it with the id
		# value should be always a string
		v_encode = str(value).encode('utf-8')
		format_string = f'!iii{len(v_encode)}s'
		result = pack(format_string, -1, idee, len(v_encode), v_encode)
		try:
			self.sock.sendall(result)
		except Exception as e:
			print(repr(e))  # TODO: better exception handling
		            '''
	}


	
	private def sendData(){
		'''
		«this.pythonGeneratorNewRecord.generate()»
		
		«this.pythonGeneratorDefaultRecord.generate()»
		
		«this.pythonGeneratorDefaultMapping.generate»
		'''

	}
	

	private def translateTraces(){
		'''
		 def get_trace_id(self, trace_id):
		        if trace_id not in self.trace_dict:
		            self.trace_dict[trace_id] = self.current_id
		            self.current_id += 1
		        return self.trace_dict[trace_id]
		'''
	}
	
	private def translateSpans(){
		'''
		 def get_span_id(self, span_id):
		        if span_id not in self.span_dict:
		            self.span_dict[span_id] = self.current_span_id
		            self.current_span_id += 1
		        return self.span_dict[span_id]
		'''
	}
	
	private def List<CustomMapping> getMapping(NewRecord kiekerRecord) {
		var result = new ArrayList
		for (mapping : this.mappings) {
			if (mapping instanceof CustomMapping) {
				if (kiekerRecord instanceof NewRecord) {
					var record = mapping.getTo
					if (record instanceof NewRecord) {
						if (record.getName.equals(kiekerRecord.getName))
							result.add(mapping)
					}
				}

			}
		}

		return result
	}
	
		private def List<CustomMapping> getMapping(DefaultMonitoringRecord kiekerRecord) {
		var result = new ArrayList
		for (mapping : this.mappings) {
			if (mapping instanceof CustomMapping) {
				if (kiekerRecord instanceof DefaultMonitoringRecord) {
					var record = mapping.getTo
					if (record instanceof KiekerRecord) {
						if (record.getName.equals(kiekerRecord.getName.getName))
							result.add(mapping)
					}
				}

			}
		}
		return result
	}
	
	private def List<DefaultMapping> getDefaultMapping(DefaultMonitoringRecord kiekerRecord) {
		var result = new ArrayList
		for (mapping : this.mappings) {
			if (mapping instanceof DefaultMapping) {
					var record = mapping.getTo
					if (record instanceof KiekerRecord) {
						if (record.getName.equals(kiekerRecord.getName.getName))
							result.add(mapping)
					}
				

			}
		}
		return result
	}
	


}
	

