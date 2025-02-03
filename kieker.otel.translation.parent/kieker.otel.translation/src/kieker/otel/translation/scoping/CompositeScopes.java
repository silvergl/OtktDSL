package kieker.otel.translation.scoping;


import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractScopeProvider;
import org.eclipse.xtext.scoping.impl.SimpleScope;

import com.google.inject.Inject;

import kieker.otel.translation.model.ModelGlobalScopeProvider;

public class CompositeScopes extends AbstractScopeProvider{
	@Inject
    private KiekerReferenceScopeProvider firstScopeProvider;
	private static final Logger logger = LogManager.getLogger(CompositeScopes.class);
    @Inject
    private OtelSpanScopeProvider secondScopeProvider;
    
    @Inject
    private ModelGlobalScopeProvider thirdScopeProvider;
	@Override
	public IScope getScope(EObject context, EReference reference) {
    
    // If the first provider doesn't handle it, use the second provider
		IScope scope = firstScopeProvider.getScope(context, reference);    
		IScope scope2 = secondScopeProvider.getScope(context, reference);
		IScope scope3 = thirdScopeProvider.getScope(context.eResource(), reference, null);
	

	   List<IEObjectDescription> allEObjects = new ArrayList<>();
	  
       for (IEObjectDescription desc : scope.getAllElements()) {
           allEObjects.add(desc);
       }
       for (IEObjectDescription desc : scope2.getAllElements()) {
           allEObjects.add(desc);
       }

	
    // Fallback: return the null scope
     return new SimpleScope(scope3,allEObjects);
    //return Scopes.scopeFor(allEObjects);
	}

}
