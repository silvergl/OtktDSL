package kieker.otel.translation.model;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

import kiekerrecord.NamedElement;


/**
 * 
 * @author Serafim Simonov  Initial contribution (Derived from https://www.oiloftrop.de/code-research/introducing-type-systems-in-xtext-languages/)
 * @since 1.0
 */


public class ModelProvider implements Resource.Factory, IModelProvider  {
	 /** Path to the internal resource. */
    public static final String MODEL = "/Model"; //$NON-NLS-1$
    /** Id for the internal resource. */
    public static final String ID = "base"; //$NON-NLS-1$

    private final ResourceSet resourceSet;

    public ModelProvider(final ResourceSet resourceSet) {
        this.resourceSet = resourceSet;
    }

    public static URI createResourceURI() {
        return URI.createURI(ModelProvider.ID + ':' + ModelProvider.MODEL);
    }


    @Override
    public ModelResource createResource(final URI uri) {
        return new ModelResource(uri);
    }

    /**
     * Construct a full URI for a class.
     *
     * @param fullQualifiedClassName
     *            the full qualified class name
     * @return a complete URI
     */
    public static URI getFullURIForClass(final String fullQualifiedClassName) {
        final StringBuilder uriBuilder = new StringBuilder(48);
        uriBuilder.append(ModelProvider.ID);
        uriBuilder.append(':');
        uriBuilder.append(ModelProvider.MODEL).append(fullQualifiedClassName);
        uriBuilder.append('#');
        uriBuilder.append(fullQualifiedClassName);
        return URI.createURI(uriBuilder.toString());
    }

    @Override
    public NamedElement findModelByName(final String name) {
        if (Strings.isEmpty(name)) {
            throw new IllegalArgumentException("Internal error: Empty model name.");
        }
        final ModelResource resource = (ModelResource) this.resourceSet.getResource(ModelProvider.createResourceURI(), true);

        return (NamedElement) resource.getEObject(name);
    }

    @Override
    public Iterable<NamedElement> getAllElements() {
        return IterableExtensions.map(
                this.resourceSet.getResource(ModelProvider.createResourceURI(), true).getContents(),
                p -> (NamedElement) p);
    }



}
