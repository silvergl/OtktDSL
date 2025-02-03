package kieker.otel.translation.model;

import org.eclipse.emf.ecore.resource.ResourceSet;

import com.google.inject.Inject;

import kieker.otel.translation.InternalErrorException;

/**
 * 
 * @author Serafim Simonov  Initial contribution (Derived from https://www.oiloftrop.de/code-research/introducing-type-systems-in-xtext-languages/)
 * @since 1.0
 */


public class ModelProviderFactory {


    /**
     * Dummy constructor comment.
     */
    @Inject
    public ModelProviderFactory() {}

    /**
     * Create a new type provider or fetch the already created type provider for the primitive
     * types.
     *
     * @param resourceSet
     *            The resource set associated with the type provider.
     * @return Returns the type provider for primitive types.
     * @throws InternalErrorException
     *             when the application state is broken
     */
    public IModelProvider getModelProvider(final ResourceSet resourceSet) throws InternalErrorException {
        if (resourceSet != null) {
            final Object object = resourceSet.getResourceFactoryRegistry().getProtocolToFactoryMap()
                    .get(ModelProvider.ID);
            if (object != null) {
                if (object instanceof IModelProvider) {
                    return (IModelProvider) object;
                } else {
                    throw new InternalErrorException("Expectied IModelProvider but got " + object);
                }
            } else {
                return this.createModelProvider(resourceSet);
            }
        } else {
            throw new InternalErrorException("Cannot get model provide without a resourceSet.");
        }
    }

    /**
     * Create a new type provider for primitive types and register it with the resource.
     *
     * @param resourceSet
     *            The resource set associated with the type provider.
     * @return Returns the new type provider.
     */
    private IModelProvider createModelProvider(final ResourceSet resourceSet) {
        final IModelProvider modelProvider = new ModelProvider(resourceSet);
        resourceSet.getResourceFactoryRegistry().getProtocolToFactoryMap()
        .put(ModelProvider.ID, modelProvider);
        return modelProvider;

    }
}

