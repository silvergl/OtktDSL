package kieker.otel.translation.specification.system;

import kieker.otel.translation.specification.Util;
import kiekerrecord.Attribute;
import kiekerrecord.KiekerRecord;
import mappingModel.Mapping;
import mappingModel.MappingRule;
import mappingModel.ParamType;
import mappingModel.SpanParam;
import mappingModel.Type;

public class CPUUtilizationRecord {

	
	public static KiekerRecord createRecord() {
		KiekerRecord record = Util.RECORD_FACTORY.createKiekerRecord();
		record.setName("CPUUtilizationRecord");
		record.setFqClassName("kieker.common.record.system.CPUUtilizationRecord");
		Attribute timestamp = Util.RECORD_FACTORY.createAttribute();
		timestamp.setName("timestamp");
		timestamp.setType("long");
		record.getAttributes().add(timestamp);
		
		Attribute hostname = Util.RECORD_FACTORY.createAttribute();
		hostname.setName("hostname");
		hostname.setType("string");
		record.getAttributes().add(hostname);
		
		Attribute cpuID = Util.RECORD_FACTORY.createAttribute();
		cpuID.setName("cpuID");
		cpuID.setType("string");
		record.getAttributes().add(cpuID);
		
		Attribute user = Util.RECORD_FACTORY.createAttribute();
		user.setName("user");
		user.setType("double");
		record.getAttributes().add(user);
		
		Attribute system = Util.RECORD_FACTORY.createAttribute();
		system.setName("system");
		system.setType("double");
		record.getAttributes().add(system);
		
		Attribute wait = Util.RECORD_FACTORY.createAttribute();
		wait.setName("wait");
		wait.setType("double");
		record.getAttributes().add(wait);
		
		Attribute nice = Util.RECORD_FACTORY.createAttribute();
		nice.setName("nice");
		nice.setType("double");
		record.getAttributes().add(nice);
		
		Attribute  irq  = Util.RECORD_FACTORY.createAttribute();
		irq .setName("irq");
		irq.setType("double");
		record.getAttributes().add(irq);
		
		Attribute  totalUtilization  = Util.RECORD_FACTORY.createAttribute();
		totalUtilization .setName("totalUtilization");
		totalUtilization.setType("double");
		record.getAttributes().add(totalUtilization);
		
		Attribute  idle  = Util.RECORD_FACTORY.createAttribute();
		idle .setName("idle");
		idle.setType("double");
		record.getAttributes().add(idle);
		
		
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
		MappingRule mappingRule10 =  Util.MAPPING_FACTORY.createMappingRule();
		mapping.setRecordFQClassName("kieker.common.record.system.CPUUtilizationRecord");
		
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
		span3.setParamName("cpuID");
		span3.setType(Type.STRING);
		span3.setParamType(ParamType.ATTRIBUTE);
		mappingRule3.setFrom(span3);
				
		SpanParam span4 = Util.MAPPING_FACTORY.createSpanParam();
		span4.setAnnotation(null);
		span4.setParamName("user");
		span4.setType(Type.DOUBLE);
		span4.setParamType(ParamType.ATTRIBUTE);
		mappingRule4.setFrom(span4);
				
		SpanParam span5 = Util.MAPPING_FACTORY.createSpanParam();
		span5.setAnnotation(null);
		span5.setParamName("system");
		span5.setParamType(ParamType.DEFAULT);
		span5.setType(Type.DOUBLE);
		mappingRule5.setFrom(span5);
		SpanParam span6 = Util.MAPPING_FACTORY.createSpanParam();
		span6.setAnnotation(null);
		span6.setParamName("wait");
		span6.setType(Type.DOUBLE);
		span6.setParamType(ParamType.ATTRIBUTE);
		mappingRule6.setFrom(span6);
		SpanParam span7 = Util.MAPPING_FACTORY.createSpanParam();
		span7.setAnnotation(null);
		span7.setParamName("nice");
		span7.setType(Type.DOUBLE);
		span7.setParamType(ParamType.ATTRIBUTE);
		mappingRule7.setFrom(span7);
		
		
		
		SpanParam span8 = Util.MAPPING_FACTORY.createSpanParam();
		span8.setAnnotation(null);
		span8.setParamName("irq");
		span8.setParamType(ParamType.DEFAULT);
		span8.setType(Type.DOUBLE);
		mappingRule8.setFrom(span8);
		SpanParam span9 = Util.MAPPING_FACTORY.createSpanParam();
		span9.setAnnotation(null);
		span9.setParamName("totalUtilization");
		span9.setType(Type.DOUBLE);
		span9.setParamType(ParamType.ATTRIBUTE);
		mappingRule9.setFrom(span9);
		SpanParam span10 = Util.MAPPING_FACTORY.createSpanParam();
		span10.setAnnotation(null);
		span10.setParamName("idle");
		span10.setType(Type.DOUBLE);
		span10.setParamType(ParamType.ATTRIBUTE);
		mappingRule10.setFrom(span10);
		
		mapping.getMappingRules().add(mappingRule);
		mapping.getMappingRules().add(mappingRule2);
		mapping.getMappingRules().add(mappingRule3);
		mapping.getMappingRules().add(mappingRule4);
		mapping.getMappingRules().add(mappingRule5);
		mapping.getMappingRules().add(mappingRule6);
		mapping.getMappingRules().add(mappingRule7);
		mapping.getMappingRules().add(mappingRule8);
		mapping.getMappingRules().add(mappingRule9);
		mapping.getMappingRules().add(mappingRule10);
		return mapping;
		

		
	}
}
