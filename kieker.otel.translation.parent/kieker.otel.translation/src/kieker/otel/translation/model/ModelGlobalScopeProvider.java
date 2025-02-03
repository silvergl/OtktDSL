package kieker.otel.translation.model;


import com.google.common.base.Predicate;
import com.google.inject.Inject;
import kieker.otel.translation.InternalErrorException;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.DefaultGlobalScopeProvider;
import org.eclipse.xtext.xbase.lib.Exceptions;


/*
 * /**
 * 
 * @author Serafim Simonov  Initial contribution (Derived from https://www.oiloftrop.de/code-research/introducing-type-systems-in-xtext-languages/)
 * @since 1.0
 */

 

@SuppressWarnings("all")
public class ModelGlobalScopeProvider extends DefaultGlobalScopeProvider {
  @Inject
  private ModelProviderFactory modelProviderFactory;

  @Inject
  private IQualifiedNameConverter qualifiedNameConverter;

  private Logger logger = Logger.getLogger(ModelGlobalScopeProvider.class);

  @Override
  public IScope getScope(final Resource resource, final EReference reference, final Predicate<IEObjectDescription> filter) {
    try {
      final IScope parentTypeScope = this.getParentTypeScope(resource, reference, filter, reference.getEReferenceType());
      final IScope result = super.getScope(parentTypeScope, resource, false, reference.getEReferenceType(), filter);
      result.getAllElements();
      Iterable<IEObjectDescription> _allElements = result.getAllElements();
      for (final IEObjectDescription description : _allElements) {
        QualifiedName _qualifiedName = description.getQualifiedName();
        String _plus = ("Global Scope Element: " + _qualifiedName);
        this.logger.info(_plus);
      }
      return result;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  public IScope getParentTypeScope(final Resource resource, final EReference reference, final Predicate<IEObjectDescription> filter, final EClass referenceType) throws InternalErrorException {
    if ((referenceType.getName().equals("KiekerRecord") || referenceType.getName().equals("KiekerRecordModel"))) {
      if ((resource != null)) {
        final ResourceSet resourceSet = resource.getResourceSet();
        if ((resourceSet != null)) {
          final IModelProvider modelProvider = this.modelProviderFactory.getModelProvider(resourceSet);
          final ModelScope result = new ModelScope(modelProvider, this.qualifiedNameConverter, filter);
          return result;
        } else {
          throw new IllegalStateException("context must be contained in a resource set");
        }
      } else {
        throw new IllegalStateException("context must be contained in a resource");
      }
    } else {
      return IScope.NULLSCOPE;
    }
  }
}
