package kieker.otel.translation.scoping;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.spi.LoggerFactory;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;

import kieker.otel.translation.otkt.DefaultAttributes;
import kieker.otel.translation.otkt.OtelRef;
import kieker.otel.translation.otkt.OtelSpan;
import kieker.otel.translation.otkt.OtktFactory;
import kieker.otel.translation.otkt.OtktPackage;
import kieker.otel.translation.otkt.SpanAttribute;
import kieker.otel.translation.otkt.Type;

public class OtelSpanScopeProvider extends AbstractDeclarativeScopeProvider {
    
	
	public IScope getScope(EObject context, EReference reference) {
        if (context instanceof OtelRef && reference == OtktPackage.Literals.OTEL_REF__REF_ATTRIBUTE) {
            OtelRef crossRef = (OtelRef) context;
            EObject refEntity = (OtelSpan)crossRef.getRefEntity();
       //     this.addDefaultAttributes((OtelSpan)refEntity);
            if (refEntity != null) {
                // Provide a scope containing the attributes of the referenced entity
            //	IScope trace = Scopes.scopeFor(Collections.singletonList(((OtelSpan)refEntity).getTrace()));
            //	IScope parentTrace = Scopes.scopeFor(Collections.singletonList(((OtelSpan)refEntity).getParentTrace()));
            	EList <DefaultAttributes> defaults = ((OtelSpan)refEntity).getDefaultAttributes();
            	EList <SpanAttribute> defaultattrs = new BasicEList();
            	for(DefaultAttributes attr : defaults) {
            		
            		defaultattrs.add(getSpanAttrFromDefaultAttr(attr));
            	}
            	IScope defaultAttr= Scopes.scopeFor( defaultattrs);
            	IScope attr= Scopes.scopeFor( ((OtelSpan)refEntity).getAttributes());
            //    IScope defaultAttr = Scopes.scopeFor(((OtelSpan)refEntity).getDefaultAttributes());
             //   IScope events = Scopes.scopeFor(((OtelSpan)refEntity).getEvents());
                
                List<EObject> allEObjects = new ArrayList<>();
          	  
                for (IEObjectDescription desc : attr.getAllElements()) {
                    allEObjects.add(desc.getEObjectOrProxy());
                }
                for (IEObjectDescription desc : defaultAttr.getAllElements()) {
                    allEObjects.add(desc.getEObjectOrProxy());
                }
               /* for (IEObjectDescription desc : events.getAllElements()) {
                    allEObjects.add(desc.getEObjectOrProxy());
                }*/
             /*   for (IEObjectDescription desc : trace.getAllElements()) {
                    allEObjects.add(desc.getEObjectOrProxy());
                }
                for (IEObjectDescription desc : parentTrace.getAllElements()) {
                    allEObjects.add(desc.getEObjectOrProxy());
                }*/
            return Scopes.scopeFor(allEObjects);}
        }
        return super.getScope(context, reference);
    }
	
	private SpanAttribute getSpanAttrFromDefaultAttr(DefaultAttributes attr ) {
		if(attr.getEndTime()!=null) {
			return attr.getEndTime();
		}else if((attr.getParentTrace()!=null)) {
			return attr.getParentTrace();
		}else if(attr.getSpanId()!=null){
			return attr.getSpanId();
		}else if(attr.getStartTime()!=null) {
			return attr.getStartTime();
		}else if(attr.getTrace()!=null) {
			return attr.getTrace();
		}else return null;
		
	}
	
	private void addDefaultAttributes(OtelSpan span) {
		
		Type longType = Type.LONG;
		Type stringType = Type.STRING;
		
		
		DefaultAttributes attr1  = OtktFactory.eINSTANCE.createDefaultAttributes();
		SpanAttribute endTime =  OtktFactory.eINSTANCE.createSpanAttribute();
		endTime.setName("end_time");
		endTime.setType(longType);
		attr1.setEndTime(endTime);
		
		DefaultAttributes attr2  = OtktFactory.eINSTANCE.createDefaultAttributes();
		SpanAttribute startTime =  OtktFactory.eINSTANCE.createSpanAttribute();
		startTime.setName("start_time");
		startTime.setType(longType);
		attr2.setStartTime(startTime);
		
		DefaultAttributes attr3  = OtktFactory.eINSTANCE.createDefaultAttributes();
		SpanAttribute trace =  OtktFactory.eINSTANCE.createSpanAttribute();
		trace.setName("trace_id");
		trace.setType(stringType);
		attr3.setTrace(trace);
		
		DefaultAttributes attr4  = OtktFactory.eINSTANCE.createDefaultAttributes();
		SpanAttribute spans =  OtktFactory.eINSTANCE.createSpanAttribute();
		spans.setName("span_id");
		spans.setType(longType);
		attr4.setSpanId(spans);
		
		DefaultAttributes attr5  = OtktFactory.eINSTANCE.createDefaultAttributes();
		SpanAttribute parent =  OtktFactory.eINSTANCE.createSpanAttribute();
		parent.setName("parent");
		parent.setType(longType);
		attr5.setParentTrace(parent);
		
		span.getDefaultAttributes().add(attr1);
		span.getDefaultAttributes().add(attr2);
		span.getDefaultAttributes().add(attr3);
		span.getDefaultAttributes().add(attr4);
		span.getDefaultAttributes().add(attr5);
		
		
	}
	
}
