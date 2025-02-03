package kieker.otel.translation.specification.system;

import kieker.otel.translation.specification.Util;
import kiekerrecord.Attribute;
import kiekerrecord.KiekerRecord;
import mappingModel.Mapping;
import mappingModel.MappingRule;
import mappingModel.ParamType;
import mappingModel.SpanParam;
import mappingModel.Type;

public class DiskUsageRecord {
	
	public static KiekerRecord createRecord() {
		KiekerRecord record = Util.RECORD_FACTORY.createKiekerRecord();
		record.setName("DiskUsageRecord");
		record.setFqClassName("kieker.common.record.system.CPUUtilizationRecord");
		Attribute timestamp = Util.RECORD_FACTORY.createAttribute();
		timestamp.setName("timestamp");
		timestamp.setType("long");
		record.getAttributes().add(timestamp);
		
		Attribute hostname = Util.RECORD_FACTORY.createAttribute();
		hostname.setName("hostname");
		hostname.setType("string");
		record.getAttributes().add(hostname);
		
		Attribute deviceName = Util.RECORD_FACTORY.createAttribute();
		deviceName.setName("deviceName");
		deviceName.setType("string");
		record.getAttributes().add(deviceName);
		
		Attribute queue = Util.RECORD_FACTORY.createAttribute();
		queue.setName("queue");
		queue.setType("double");
		record.getAttributes().add(queue);
		
		Attribute readBytesPerSecond = Util.RECORD_FACTORY.createAttribute();
		readBytesPerSecond.setName("readBytesPerSecond");
		readBytesPerSecond.setType("double");
		record.getAttributes().add(readBytesPerSecond);
		
		Attribute readsPerSecond = Util.RECORD_FACTORY.createAttribute();
		readsPerSecond.setName("readsPerSecond");
		readsPerSecond.setType("double");
		record.getAttributes().add(readsPerSecond);
		
		Attribute serviceTime = Util.RECORD_FACTORY.createAttribute();
		serviceTime.setName("serviceTime");
		serviceTime.setType("double");
		record.getAttributes().add(serviceTime);
		
		Attribute  writeBytesPerSecond  = Util.RECORD_FACTORY.createAttribute();
		writeBytesPerSecond .setName("writeBytesPerSecond");
		writeBytesPerSecond.setType("double");
		record.getAttributes().add(writeBytesPerSecond);
		
		Attribute  writesPerSecond  = Util.RECORD_FACTORY.createAttribute();
		writesPerSecond .setName("writesPerSecond");
		writesPerSecond.setType("double");
		record.getAttributes().add(writesPerSecond);
		
		
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
		MappingRule mappingRule9 =  Util.MAPPING_FACTORY.createMappingRule();
		mapping.setRecordFQClassName("kieker.common.record.system.DiskUsageRecord");
		
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
		span3.setParamName("deviceName");
		span3.setType(Type.STRING);
		span3.setParamType(ParamType.ATTRIBUTE);
		mappingRule3.setFrom(span3);
				
		SpanParam span4 = Util.MAPPING_FACTORY.createSpanParam();
		span4.setAnnotation(null);
		span4.setParamName("queue");
		span4.setType(Type.DOUBLE);
		span4.setParamType(ParamType.ATTRIBUTE);
		mappingRule4.setFrom(span4);
				
		SpanParam span5 = Util.MAPPING_FACTORY.createSpanParam();
		span5.setAnnotation(null);
		span5.setParamName("readBytesPerSecond");
		span5.setParamType(ParamType.DEFAULT);
		span5.setType(Type.DOUBLE);
		mappingRule5.setFrom(span5);
		SpanParam span6 = Util.MAPPING_FACTORY.createSpanParam();
		span6.setAnnotation(null);
		span6.setParamName("readsPerSecond");
		span6.setType(Type.DOUBLE);
		span6.setParamType(ParamType.ATTRIBUTE);
		mappingRule6.setFrom(span6);
		SpanParam span7 = Util.MAPPING_FACTORY.createSpanParam();
		span7.setAnnotation(null);
		span7.setParamName("serviceTime");
		span7.setType(Type.DOUBLE);
		span7.setParamType(ParamType.ATTRIBUTE);
		mappingRule7.setFrom(span7);
		
		
		
		SpanParam span8 = Util.MAPPING_FACTORY.createSpanParam();
		span8.setAnnotation(null);
		span8.setParamName("writeBytesPerSecond");
		span8.setParamType(ParamType.DEFAULT);
		span8.setType(Type.DOUBLE);
		mappingRule8.setFrom(span8);
		SpanParam span9 = Util.MAPPING_FACTORY.createSpanParam();
		span9.setAnnotation(null);
		span9.setParamName("writesPerSecond");
		span9.setType(Type.DOUBLE);
		span9.setParamType(ParamType.ATTRIBUTE);
		mappingRule9.setFrom(span9);

		
		mapping.getMappingRules().add(mappingRule);
		mapping.getMappingRules().add(mappingRule2);
		mapping.getMappingRules().add(mappingRule3);
		mapping.getMappingRules().add(mappingRule4);
		mapping.getMappingRules().add(mappingRule5);
		mapping.getMappingRules().add(mappingRule6);
		mapping.getMappingRules().add(mappingRule7);
		mapping.getMappingRules().add(mappingRule8);
		mapping.getMappingRules().add(mappingRule9);

		return mapping;
		

		
	}
}
