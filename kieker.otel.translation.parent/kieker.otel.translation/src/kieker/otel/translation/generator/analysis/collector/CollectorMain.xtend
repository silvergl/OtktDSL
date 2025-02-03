package kieker.otel.translation.generator.analysis.collector

class CollectorMain {
	

	
	def generate(){
		'''
		
		import java.nio.file.Path;
		
		import com.beust.jcommander.JCommander;
		import com.beust.jcommander.Parameter;
		import com.beust.jcommander.converters.PathConverter;
		
		import kieker.common.configuration.Configuration;
		import kieker.common.exception.ConfigurationException;
		import kieker.tools.common.AbstractService;
		import kieker.tools.common.CommonConfigurationKeys;
		import kieker.tools.common.ParameterEvaluationUtils;
		
		/**
		 * The collector allows to collect input from different input sources, including TCP and Kieker
		 * files. In future, we may add a nice mechanism to add other
		 *
		 * @author Reiner Jung
		 *
		 * @since 1.16
		 */
		public final class Main extends AbstractService<CollectorConfiguration, Main> {
		
			@Parameter(names = { "-c",
				"--configuration" }, required = true, description = "Configuration file.", converter = PathConverter.class)
			private Path configurationPath;
		
			/**
			 * This is a simple main class which does not need to be instantiated.
			 */
			private Main() {
		
			}
		
			/**
			 * Configure and execute the TCP Kieker data collector.
			 *
			 * @param args
			 *            arguments are ignored
			 */
			public static void main(final String[] args) {
				final Main collector = new Main();
				System.exit(collector.run("Collector", "collector", args, collector));
			}
		
			@Override
			protected CollectorConfiguration createTeetimeConfiguration() throws ConfigurationException {
				return new CollectorConfiguration(this.kiekerConfiguration);
			}
		
			@Override
			protected boolean checkParameters(final JCommander commander) throws ConfigurationException {
				return ParameterEvaluationUtils.isFileReadable(this.configurationPath.toFile(), "Configuration File", commander);
			}
		
			@Override
			protected Path getConfigurationPath() {
				return this.configurationPath;
			}
		
			@Override
			protected boolean checkConfiguration(final Configuration configuration, final JCommander commander) {
				configuration.getStringProperty(CommonConfigurationKeys.SOURCE_STAGE);
				return true;
			}
		
			@Override
			protected void shutdownService() {
				// nothing special to do here
			}
		
		}
		'''
	}
}