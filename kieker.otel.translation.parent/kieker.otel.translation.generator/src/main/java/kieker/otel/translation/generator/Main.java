package kieker.otel.translation.generator;


import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;
import java.util.List;
import kieker.otel.translation.OtktStandaloneSetup;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.generator.GeneratorContext;
import org.eclipse.xtext.generator.GeneratorDelegate;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;

public class Main {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.err.println("Expected Arguments: <path/to/input.otkt> <path/to/output/folder");
			return;
		}
		Injector injector = new OtktStandaloneSetup().createInjectorAndDoEMFRegistration();
		Main main = injector.getInstance(Main.class);
		main.runGenerator(args[0], args[1]);
	}

	@Inject
	private Provider<ResourceSet> resourceSetProvider;

	@Inject
	private IResourceValidator validator;

	@Inject
	private GeneratorDelegate generator;

	@Inject 
	private JavaIoFileSystemAccess fileAccess;

	protected void runGenerator(String string, String output) {
		// Load the resource
		ResourceSet set = resourceSetProvider.get();
		Resource resource = set.getResource(URI.createFileURI(string), true);

		// Validate the resource
		List<Issue> list = validator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl);
		if (!list.isEmpty()) {
			for (Issue issue : list) {
				System.err.println(issue);
			}
			return;
		}

		// Configure and start the generator
		fileAccess.setOutputPath(output);
		GeneratorContext context = new GeneratorContext();
		context.setCancelIndicator(CancelIndicator.NullImpl);
		generator.generate(resource, fileAccess, context);

		System.out.println("Code generation finished.");
	}
}
