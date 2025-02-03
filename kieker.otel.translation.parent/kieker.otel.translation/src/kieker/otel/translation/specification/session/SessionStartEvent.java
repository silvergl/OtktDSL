package kieker.otel.translation.specification.session;

import kieker.otel.translation.specification.Util;
import kiekerrecord.Attribute;
import kiekerrecord.KiekerRecord;
import mappingModel.Mapping;
import mappingModel.MappingRule;
import mappingModel.ParamType;
import mappingModel.SpanParam;
import mappingModel.Type;

public class SessionStartEvent {

	
	public static KiekerRecord createRecord() {
		KiekerRecord record = Util.RECORD_FACTORY.createKiekerRecord();
		record.setName("SessionStartEvent");
		record.setFqClassName("kieker.common.record.session.SessionEndEvent");
		Attribute timestamp = Util.RECORD_FACTORY.createAttribute();
		timestamp.setName("timestamp");
		timestamp.setType("long");
		record.getAttributes().add(timestamp);
		
		Attribute hostname = Util.RECORD_FACTORY.createAttribute();
		hostname.setName("hostname");
		hostname.setType("string");
		record.getAttributes().add(hostname);
		
		Attribute sessionId = Util.RECORD_FACTORY.createAttribute();
		sessionId.setName("sessionId");
		sessionId.setType("string");
		record.getAttributes().add(sessionId);
		
	
		
		
		return record;
	}
	
	
	public static Mapping createMapping() {
		Mapping mapping = Util.MAPPING_FACTORY.createMapping();
		MappingRule mappingRule =  Util.MAPPING_FACTORY.createMappingRule();
		MappingRule mappingRule2 =  Util.MAPPING_FACTORY.createMappingRule();
		MappingRule mappingRule3 =  Util.MAPPING_FACTORY.createMappingRule();

		//MappingRule mappingRule5 =  Util.MAPPING_FACTORY.createMappingRule();
		mapping.setRecordFQClassName("kieker.common.record.session.SessionEndEvent");
		
		SpanParam span = Util.MAPPING_FACTORY.createSpanParam();
		span.setAnnotation(null);
		span.setParamName("timestamp");
		span.setParamType(ParamType.ATTRIBUTE);
		span.setType(Type.LONG);
		mappingRule.setFrom(span);
		
		SpanParam span2 = Util.MAPPING_FACTORY.createSpanParam();
		span2.setAnnotation(null);
		span2.setParamName("sessionId");
		span2.setParamType(ParamType.ATTRIBUTE);
		span2.setType(Type.STRING);
		mappingRule2.setFrom(span2);
		
		SpanParam span3 = Util.MAPPING_FACTORY.createSpanParam();
		span3.setAnnotation(null);
		span3.setParamName("values");
		span3.setParamType(ParamType.ATTRIBUTE);
		span3.setType(Type.STRING);
		mappingRule3.setFrom(span3);
		
	
		mapping.getMappingRules().add(mappingRule);
		mapping.getMappingRules().add(mappingRule2);
		mapping.getMappingRules().add(mappingRule3);
		return mapping;
		

		
	}
}
