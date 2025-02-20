package kieker.otel.translation.generator.python

import org.eclipse.xtend.lib.annotations.Accessors

class OtelInitGenerator implements IPythonGenerator{
	@Accessors
	boolean generateProcessor
	
	new(boolean generateProcessor){
		this.generateProcessor = generateProcessor
	}
	override generate() {
		'''
		from opentelemetry import trace
		from opentelemetry.sdk.trace import TracerProvider
		from opentelemetry.sdk.trace.export import BatchSpanProcessor, SimpleSpanProcessor
		
		from otkt.kiekerexporter import KiekerTcpExporter
		from otkt.kiekerprocessor import IncrementAttributeSpanProcessor
		
		trace.set_tracer_provider(TracerProvider())
		
		# Use the gRPC OTLP exporter (ensure the endpoint is correct for gRPC)
		otlp_exporter = KiekerTcpExporter()
		
		# Set up the span processor
		span_processor = SimpleSpanProcessor(otlp_exporter)
		«IF generateProcessor»
		span_processor_2 = IncrementAttributeSpanProcessor()
		«ENDIF»
		
		trace.get_tracer_provider().add_span_processor(span_processor)
		«IF generateProcessor»
		trace.get_tracer_provider().add_span_processor(span_processor_2)
		«ENDIF»
		# Create a tracer
		tracer = trace.get_tracer(__name__)
		'''
	}
	
}
