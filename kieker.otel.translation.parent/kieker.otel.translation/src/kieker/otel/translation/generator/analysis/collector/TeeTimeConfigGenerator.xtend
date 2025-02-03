package kieker.otel.translation.generator.analysis.collector

class TeeTimeConfigGenerator {
	
	int port
	int buffersize
	boolean converter
	 new(int port, int buffersize, boolean converter){
		this.port = port
		this. buffersize = buffersize
		this.converter = converter
	}
	def generate(){
		'''

import kieker.analysis.generic.sink.DataSink;
import kieker.analysis.generic.source.rewriter.NoneTraceMetadataRewriter;
import kieker.analysis.generic.source.tcp.MultipleConnectionTcpSourceStage;
import kieker.common.exception.ConfigurationException;
import teetime.framework.Configuration;
		
		/**
		 * Analysis configuration for the data collector.
		 *
		 * @author Reiner Jung
		 *
		 * @since 1.15
		 *
		 */
public class CollectorConfiguration extends Configuration {

	private final DataSink consumer;
//	private final ISourceCompositeStage sourceStage;

	/**
	 * Configure analysis.
	 *
	 * @param configuration
	 *            configuration for the collector
	 * @throws ConfigurationException
	 *             on configuration error
	 */
	public CollectorConfiguration(final kieker.common.configuration.Configuration configuration)
			throws ConfigurationException {
		
		«IF !converter»
		final MultipleConnectionTcpSourceStage mySource = new MultipleConnectionTcpSourceStage(4137, 650000, new NoneTraceMetadataRewriter());
		this.consumer = new DataSink(configuration);
		this.connectPorts(mySource.getOutputPort(), this.consumer.getInputPort());
		«ELSE»
		final MultipleConnectionTcpSourceStage mySource = new MultipleConnectionTcpSourceStage(4137, 650000, new NoneTraceMetadataRewriter());
		 //final MyOutputStage outputStage= new MyOutputStage();
		final ConverterStage convertStage = new ConverterStage();
		this.consumer = new DataSink(configuration);
		this.connectPorts(mySource.getOutputPort(), convertStage.getInputPort());
		this.connectPorts(convertStage.getOuputPort()), this.consumer.getInputPort());
		«ENDIF»
	}

	public DataSink getCounter() {
		return this.consumer;
	}


}'''
	}





}
	
