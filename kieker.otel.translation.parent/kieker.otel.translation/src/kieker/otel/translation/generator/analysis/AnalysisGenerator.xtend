package kieker.otel.translation.generator.analysis

import org.eclipse.xtext.generator.IFileSystemAccess2
import kieker.otel.translation.otkt.NewRecord
import java.util.List
import org.eclipse.emf.ecore.resource.Resource
import kieker.otel.translation.otkt.Mapping
import kieker.otel.translation.otkt.OtelSpan
import kieker.otel.translation.generator.analysis.CustomRecordFactoryGenerator
import kieker.otel.translation.generator.analysis.CustomRecordGenerator
import kieker.otel.translation.otkt.Collector
import kieker.otel.translation.generator.analysis.collector.CollectorMain
import kieker.otel.translation.generator.analysis.collector.TeeTimeConfigGenerator
import kieker.otel.translation.otkt.KiekerMonitoringType

class AnalysisGenerator {

	List<KiekerMonitoringType> records;
	Mapping mapping
	OtelSpan otelspan
	Collector collector
	Resource resource

	new(List<KiekerMonitoringType> records, Resource resource) {
		this.records = records
		this.mapping = resource.allContents.filter(Mapping).toList().get(0)
		this.otelspan = resource.allContents.filter(OtelSpan).toList().get(0)
		this.resource = resource
		if (!resource.allContents.filter(Collector).toList.isEmpty)
		
			this.collector = resource.allContents.filter(Collector).toList.get(0)
	}

	def generate(IFileSystemAccess2 fsa) {



		if (collector !== null) {
			val main = new CollectorMain()
			val port = this.collector.getPort()
			val buffersize = 65000
			val shouldConvert=generateRecordClasses("collector", fsa)
			val config = new TeeTimeConfigGenerator(port, buffersize, shouldConvert)
			
			fsa.generateFile('collector/src/main/java/Main.java', main.generate())
			fsa.generateFile('collector/src/main/java/CollectorConfiguration.java', config.generate())
			fsa.generateFile('collector/pom.xml', new PomGenerator("Collector").generate())
		//	fsa.generateFile('collector/src/main/java/package-info.java', "package collector;")

		}

	}
	
	def private  generateRecordClasses(String projectName, IFileSystemAccess2 fsa) {
		var boolean shouldConvert = false
		for (record : records) {
			if (record instanceof NewRecord ) {
				
				var recordName = record.getName()
				if (record.getType.getLiteral.equals("Beforeafter")) {
					// Generate record for recieving
					fsa.generateFile(projectName+'/src/main/java/CustomRecords/' + recordName + '.java',
						new CustomRecordGenerator(record, false, false).generate())
					fsa.generateFile(projectName+'/src/main/java/CustomRecords/' + recordName + 'Factory.java',
						new CustomRecordFactoryGenerator(record, false, false).generate())
					// Generate Before, After
					fsa.generateFile(projectName+'/src/main/java/CustomRecords/Before' + recordName + '.java',
						new CustomRecordGenerator(record, true, false).generate())
					fsa.generateFile(projectName+'/src/main/java/CustomRecords/Before' + recordName + 'actory.java',
						new CustomRecordFactoryGenerator(record, true, false).generate())
					fsa.generateFile(projectName+'/src/main/java/CustomRecords/After' + recordName + '.java',
						new CustomRecordGenerator(record, false, true).generate())
					fsa.generateFile(projectName+'/src/main/java/CustomRecords/After' + recordName + 'Factory.java',
						new CustomRecordFactoryGenerator(record, false, true).generate())
						shouldConvert= true
				} else {

					// Normal Records
					fsa.generateFile(projectName+'/src/main/java/CustomRecords/' + recordName + '.java',
						new CustomRecordGenerator(record, false, false).generate())
					fsa.generateFile(projectName+'/src/main/java/CustomRecords/' + recordName + 'Factory.java',
						new CustomRecordFactoryGenerator(record, false, false).generate())
				}
			// fsa.generateFile('collector/src/main/java/package-info.java', "package collector.CustomRecords;")
			
			}
			}
			return shouldConvert
		}
	}


