package kieker.otel.translation.specification.system;

import kieker.otel.translation.specification.Util;
import kiekerrecord.Attribute;
import kiekerrecord.KiekerRecord;
import mappingModel.Mapping;
import mappingModel.MappingRule;
import mappingModel.ParamType;
import mappingModel.SpanParam;
import mappingModel.Type;

public class ResourceUtilizationRecord {
	public static KiekerRecord createRecord() {
		KiekerRecord record = Util.RECORD_FACTORY.createKiekerRecord();
		record.setName("ResourceUtilizationRecord");
		record.setFqClassName("kieker.common.record.system.ResourceUtilizationRecord");
		Attribute timestamp = Util.RECORD_FACTORY.createAttribute();
		timestamp.setName("timestamp");
		timestamp.setType("long");
		record.getAttributes().add(timestamp);
		
		Attribute hostname = Util.RECORD_FACTORY.createAttribute();
		hostname.setName("hostname");
		hostname.setType("string");
		record.getAttributes().add(hostname);
		
		Attribute resourceName = Util.RECORD_FACTORY.createAttribute();
		resourceName.setName("resourceName");
		resourceName.setType("string");
		record.getAttributes().add(resourceName);
		
		Attribute utilization = Util.RECORD_FACTORY.createAttribute();
		utilization.setName("utilization");
		utilization.setType("double");
		record.getAttributes().add(utilization);
	
		
		
		return record;
}
	
	public static Mapping createMapping() {
		Mapping mapping = Util.MAPPING_FACTORY.createMapping();
		MappingRule mappingRule =  Util.MAPPING_FACTORY.createMappingRule();
		MappingRule mappingRule2 =  Util.MAPPING_FACTORY.createMappingRule();
		MappingRule mappingRule3 =  Util.MAPPING_FACTORY.createMappingRule();
		MappingRule mappingRule4 =  Util.MAPPING_FACTORY.createMappingRule();
		//MappingRule mappingRule5 =  Util.MAPPING_FACTORY.createMappingRule();
		mapping.setRecordFQClassName("kieker.common.record.controlflow.ResourceUtilizationRecord");
		
		SpanParam span = Util.MAPPING_FACTORY.createSpanParam();
		span.setAnnotation(null);
		span.setParamName("timestamp");
		span.setParamType(ParamType.ATTRIBUTE);
		span.setType(Type.LONG);
		mappingRule.setFrom(span);
		
		SpanParam span2 = Util.MAPPING_FACTORY.createSpanParam();
		span2.setAnnotation(null);
		span2.setParamName("hostname");
		span2.setParamType(ParamType.ATTRIBUTE);
		span2.setType(Type.STRING);
		mappingRule2.setFrom(span2);
		
		SpanParam span3 = Util.MAPPING_FACTORY.createSpanParam();
		span3.setAnnotation(null);
		span3.setParamName("resourceName");
		span3.setParamType(ParamType.ATTRIBUTE);
		span3.setType(Type.STRING);
		mappingRule3.setFrom(span3);
		
		SpanParam span4 = Util.MAPPING_FACTORY.createSpanParam();
		span4.setAnnotation(null);
		span4.setParamName("utilization");
		span4.setParamType(ParamType.ATTRIBUTE);
		span4.setType(Type.DOUBLE);
		mappingRule4.setFrom(span4);
		
		mapping.getMappingRules().add(mappingRule);
		mapping.getMappingRules().add(mappingRule2);
		mapping.getMappingRules().add(mappingRule3);
		mapping.getMappingRules().add(mappingRule4);
		return mapping;
		

		
	}
}
