package kieker.otel.translation.linking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.linking.impl.DefaultLinkingService;
import org.eclipse.xtext.nodemodel.INode;

import kieker.otel.translation.otkt.KiekerMonitoringType;
import kieker.otel.translation.otkt.KiekerReference;
import kieker.otel.translation.otkt.Mapping;
import kieker.otel.translation.otkt.Model;
import kieker.otel.translation.otkt.NewRecord;
import kieker.otel.translation.otkt.OtktPackage;
import kieker.otel.translation.otkt.RecordAttribute;
import kiekerrecord.Attribute;
import kiekerrecord.KiekerRecord;


public class CustomLinkerMappingRule extends DefaultLinkingService {
	
	 @Override
	    public List<EObject> getLinkedObjects(EObject context, EReference reference, INode node) {
	     //Link Mapping Rule and its "to" parameter  
		 if ((context instanceof Mapping && reference == OtktPackage.Literals.CUSTOM_MAPPING__TO)) {
	            String id = node.getText();

	            // Try resolving it as a newRecord
	           EObject newRecord = resolveUserDefinedRecord(context, id);
	            if (newRecord != null) {
	                return Collections.singletonList(newRecord);
	            	//return newRecord;
	            }

	            // Try resolving it as a default KiekerRecord
	            EObject defaultRecord = resolveExternalRecord(context, id);
	            if (defaultRecord != null) {
	                return Collections.singletonList(defaultRecord);
	            }

	            // If no objects are found, return an empty list
	            return Collections.emptyList();
	            
	           //Link KiekerReference Rule and  its RefEntity parameter 
	        }else if((context instanceof KiekerReference && 
	        		reference == OtktPackage.Literals.KIEKER_REFERENCE__REF_ENTITY)) {
	        	String id = node.getText(); 
	           EObject newRecord = resolveUserDefinedRecord(context, id);
	            if (newRecord != null) {
	                return Collections.singletonList(newRecord);
	            	//return newRecord;
	            }

	            // Try resolving it as an ExternalType (from the external Ecore model)
	            EObject defaultRecord = resolveExternalRecord(context, id);
	            if (defaultRecord != null) {
	                return Collections.singletonList(defaultRecord);
	            }
	            return Collections.emptyList();
	            
	        }else if((context instanceof KiekerReference && 
	        		reference == OtktPackage.Literals.KIEKER_REFERENCE__REF_ATTRIBUTE)) {
	        	String id = node.getText();
	            EObject newRecord = resolveUserDefinedAttribute((KiekerReference)context, id);
	            if (newRecord != null) {
	                return Collections.singletonList(newRecord);
	            }

	            // Try resolving it as an ExternalType (from the external Ecore model)
	            EObject defaultRecord = resolveExternalAttribute(context, id);
	            if (defaultRecord != null) {
	                return Collections.singletonList(defaultRecord);
	            }
	            return Collections.emptyList();
	        }
	        	
	        

	        return super.getLinkedObjects(context, reference, node);
	    }

		private EObject resolveUserDefinedAttribute(KiekerReference context, String id) {
			// Logic to resolve a UserDefinedObject by ID

			if (context.getRefEntity() instanceof NewRecord) {
				NewRecord record = (NewRecord) context.getRefEntity();
				for (RecordAttribute attr : record.getAttributes()) {
					if (attr.getName().equals(id)) {
						return attr;
					}
				}
			}
			return null;
		}

	    private EObject resolveExternalAttribute(EObject context, String id) {
	        // Logic to resolve an ExternalType from the external Ecore model
	        ResourceSet resourceSet = context.eResource().getResourceSet();
	        for (Resource resource : resourceSet.getResources()) {
	            for (EObject obj : resource.getContents()) {
	                if (obj instanceof KiekerRecord) {
	                   for(Attribute attr:((KiekerRecord) obj).getAttributes()) {
	                	   if (attr.getName().equals(id)){
	                    		return attr;
	                    	}
	                   }
	                	
	                }
	            }
	        }
	        return null;
	    }
	    
	    private EObject resolveUserDefinedRecord(EObject context, String id) {
	        // Logic to resolve a UserDefinedObject by ID
	    	List result = new ArrayList();
	        ResourceSet resourceSet = context.eResource().getResourceSet();
	        for (Resource resource : resourceSet.getResources()) {
	            for (EObject obj : resource.getContents()) {
	                if (obj instanceof Model) {
	                    for(KiekerMonitoringType t:((Model)obj).getMain().getRecord()) {
	                    	if (t instanceof NewRecord&&((NewRecord)t).getName().equals(id)){
	                    		 return t;
	                    	}
	                    }
	                	
	                }
	            }
	        }
	        return null;
	    }

	    private EObject resolveExternalRecord(EObject context, String id) {
	        // Logic to resolve an ExternalType from the external Ecore model
	        ResourceSet resourceSet = context.eResource().getResourceSet();
	        for (Resource resource : resourceSet.getResources()) {
	            for (EObject obj : resource.getContents()) {
	                if (obj instanceof KiekerRecord && ((KiekerRecord) obj).getName().equals(id)) {
	                    return obj;
	                }
	            }
	        }
	        return null;
	    }


}
