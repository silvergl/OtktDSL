package kieker.otel.translation.specification.system;

import kieker.otel.translation.specification.Util;
import kiekerrecord.Attribute;
import kiekerrecord.KiekerRecord;
import mappingModel.Mapping;
import mappingModel.MappingRule;
import mappingModel.ParamType;
import mappingModel.SpanParam;
import mappingModel.Type;

public class MemSwapUsageRecord {
	public static KiekerRecord createRecord() {
		KiekerRecord record = Util.RECORD_FACTORY.createKiekerRecord();
		record.setName("MemSwapUsageRecord");
		record.setFqClassName("kieker.common.record.system.MemSwapUsageRecord");
		Attribute timestamp = Util.RECORD_FACTORY.createAttribute();
		timestamp.setName("timestamp");
		timestamp.setType("long");
		record.getAttributes().add(timestamp);
		
		Attribute hostname = Util.RECORD_FACTORY.createAttribute();
		hostname.setName("hostname");
		hostname.setType("string");
		record.getAttributes().add(hostname);
		
		Attribute memTotal = Util.RECORD_FACTORY.createAttribute();
		memTotal.setName("memTotal");
		memTotal.setType("long");
		record.getAttributes().add(memTotal);
		
		Attribute memUsed = Util.RECORD_FACTORY.createAttribute();
		memUsed.setName("memUsed");
		memUsed.setType("long");
		record.getAttributes().add(memUsed);
		
		Attribute memFree = Util.RECORD_FACTORY.createAttribute();
		memFree.setName("memFree");
		memFree.setType("long");
		record.getAttributes().add(memFree);
		
		Attribute swapTotal = Util.RECORD_FACTORY.createAttribute();
		swapTotal.setName("swapTotal");
		swapTotal.setType("long");
		record.getAttributes().add(swapTotal);
		
		Attribute swapUsed = Util.RECORD_FACTORY.createAttribute();
		swapUsed.setName("swapUsed");
		swapUsed.setType("long");
		record.getAttributes().add(swapUsed);
		
		Attribute  swapFree  = Util.RECORD_FACTORY.createAttribute();
		swapFree .setName("swapFree");
		swapFree.setType("long");
		record.getAttributes().add(swapFree);
		

		
		
		return record;
}
	
	public static Mapping createMapping() {
		Mapping mapping = Util.MAPPING_FACTORY.createMapping();
		MappingRule mappingRule =  Util.MAPPING_FACTORY.createMappingRule();
		MappingRule mappingRule2 =  Util.MAPPING_FACTORY.createMappingRule();
		MappingRule mappingRule3 =  Util.MAPPING_FACTORY.createMappingRule();
		MappingRule mappingRule4 =  Util.MAPPING_FACTORY.createMappingRule();
		MappingRule mappingRule5 =  Util.MAPPING_FACTORY.createMappingRule();
		MappingRule mappingRule6 =  Util.MAPPING_FACTORY.createMappingRule();
		MappingRule mappingRule7 =  Util.MAPPING_FACTORY.createMappingRule();
		MappingRule mappingRule8 =  Util.MAPPING_FACTORY.createMappingRule();
		mapping.setRecordFQClassName("kieker.common.record.system.MemSwapUsageRecord");
		
		SpanParam span = Util.MAPPING_FACTORY.createSpanParam();
		span.setAnnotation(null);
		span.setParamName("timestamp");
		span.setParamType(ParamType.DEFAULT);
		span.setType(Type.LONG);
		mappingRule.setFrom(span);
		SpanParam span2 = Util.MAPPING_FACTORY.createSpanParam();
		span2.setAnnotation(null);
		span2.setParamName("hostname");
		span2.setType(Type.STRING);
		span2.setParamType(ParamType.ATTRIBUTE);
		mappingRule2.setFrom(span2);
		SpanParam span3 = Util.MAPPING_FACTORY.createSpanParam();
		span3.setAnnotation(null);
		span3.setParamName("memTotal");
		span3.setType(Type.LONG);
		span3.setParamType(ParamType.ATTRIBUTE);
		mappingRule3.setFrom(span3);
				
		SpanParam span4 = Util.MAPPING_FACTORY.createSpanParam();
		span4.setAnnotation(null);
		span4.setParamName("memUsed");
		span4.setType(Type.LONG);
		span4.setParamType(ParamType.ATTRIBUTE);
		mappingRule4.setFrom(span4);
				
		SpanParam span5 = Util.MAPPING_FACTORY.createSpanParam();
		span5.setAnnotation(null);
		span5.setParamName("memFree");
		span5.setParamType(ParamType.DEFAULT);
		span5.setType(Type.LONG);
		mappingRule5.setFrom(span5);
		SpanParam span6 = Util.MAPPING_FACTORY.createSpanParam();
		span6.setAnnotation(null);
		span6.setParamName("swapTotal");
		span6.setType(Type.LONG);
		span6.setParamType(ParamType.ATTRIBUTE);
		mappingRule6.setFrom(span6);
		SpanParam span7 = Util.MAPPING_FACTORY.createSpanParam();
		span7.setAnnotation(null);
		span7.setParamName("swapUsed");
		span7.setType(Type.LONG);
		span7.setParamType(ParamType.ATTRIBUTE);
		mappingRule7.setFrom(span7);
		
		
		SpanParam span8 = Util.MAPPING_FACTORY.createSpanParam();
		span8.setAnnotation(null);
		span8.setParamName("swapFree");
		span8.setParamType(ParamType.DEFAULT);
		span8.setType(Type.LONG);
		mappingRule8.setFrom(span8);

		
		mapping.getMappingRules().add(mappingRule);
		mapping.getMappingRules().add(mappingRule2);
		mapping.getMappingRules().add(mappingRule3);
		mapping.getMappingRules().add(mappingRule4);
		mapping.getMappingRules().add(mappingRule5);
		mapping.getMappingRules().add(mappingRule6);
		mapping.getMappingRules().add(mappingRule7);
		mapping.getMappingRules().add(mappingRule8);

		return mapping;
		

		
	}
}
