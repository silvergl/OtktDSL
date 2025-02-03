package kieker.otel.translation.generator.python

class PythonGenerator {
	IPythonGenerator exporterGenerator
	
	new(IPythonGenerator exporterGenerator ){
		this.exporterGenerator = exporterGenerator
	}
	
	def generate(){
		exporterGenerator.generate()
	}
	
	def setGenerator(IPythonGenerator exporterGenerator){
		this.exporterGenerator = exporterGenerator
	}
}