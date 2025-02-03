package kieker.otel.translation.specification.system;

import kieker.otel.translation.specification.Util;
import kiekerrecord.Attribute;
import kiekerrecord.KiekerRecord;
import mappingModel.Mapping;
import mappingModel.MappingRule;
import mappingModel.ParamType;
import mappingModel.SpanParam;
import mappingModel.Type;

public class NetworkUtilizationRecord {
	
	public static KiekerRecord createRecord() {
		KiekerRecord record = Util.RECORD_FACTORY.createKiekerRecord();
		record.setName("NetworkUtilizationRecord");
		record.setFqClassName("kieker.common.record.system.NetworkUtilizationRecord");
		Attribute timestamp = Util.RECORD_FACTORY.createAttribute();
		timestamp.setName("timestamp");
		timestamp.setType("long");
		record.getAttributes().add(timestamp);
		
		Attribute hostname = Util.RECORD_FACTORY.createAttribute();
		hostname.setName("hostname");
		hostname.setType("string");
		record.getAttributes().add(hostname);
		
		Attribute interfaceName = Util.RECORD_FACTORY.createAttribute();
		interfaceName.setName("interfaceName");
		interfaceName.setType("string");
		record.getAttributes().add(interfaceName);
		
		Attribute speed = Util.RECORD_FACTORY.createAttribute();
		speed.setName("speed");
		speed.setType("long");
		record.getAttributes().add(speed);
		
		Attribute txBytesPerSecond = Util.RECORD_FACTORY.createAttribute();
		txBytesPerSecond.setName("txBytesPerSecond");
		txBytesPerSecond.setType("double");
		record.getAttributes().add(txBytesPerSecond);
		
		Attribute txCarrierPerSecond = Util.RECORD_FACTORY.createAttribute();
		txCarrierPerSecond.setName("txCarrierPerSecond");
		txCarrierPerSecond.setType("double");
		record.getAttributes().add(txCarrierPerSecond);
		
		Attribute txCollisionsPerSecond = Util.RECORD_FACTORY.createAttribute();
		txCollisionsPerSecond.setName("txCollisionsPerSecond");
		txCollisionsPerSecond.setType("double");
		record.getAttributes().add(txCollisionsPerSecond);
		
		Attribute  txDroppedPerSecond  = Util.RECORD_FACTORY.createAttribute();
		txDroppedPerSecond .setName("txDroppedPerSecond");
		txDroppedPerSecond.setType("double");
		record.getAttributes().add(txDroppedPerSecond);
		
		Attribute  txErrorsPerSecond  = Util.RECORD_FACTORY.createAttribute();
		txErrorsPerSecond .setName("txErrorsPerSecond");
		txErrorsPerSecond.setType("double");
		record.getAttributes().add(txErrorsPerSecond);
		
		Attribute  txOverrunsPerSecond  = Util.RECORD_FACTORY.createAttribute();
		txOverrunsPerSecond .setName("txOverrunsPerSecond");
		txOverrunsPerSecond.setType("double");
		record.getAttributes().add(txOverrunsPerSecond);
		
		Attribute  txPacketsPerSecond  = Util.RECORD_FACTORY.createAttribute();
		txPacketsPerSecond .setName("txPacketsPerSecond");
		txPacketsPerSecond.setType("double");
		record.getAttributes().add(txPacketsPerSecond);
		
		
		Attribute  rxBytesPerSecond  = Util.RECORD_FACTORY.createAttribute();
		rxBytesPerSecond .setName("rxBytesPerSecond");
		rxBytesPerSecond.setType("double");
		record.getAttributes().add(rxBytesPerSecond);
		
		
		Attribute  rxDroppedPerSecond  = Util.RECORD_FACTORY.createAttribute();
		rxDroppedPerSecond .setName("rxDroppedPerSecond");
		rxDroppedPerSecond.setType("double");
		record.getAttributes().add(rxDroppedPerSecond);
		
		
		Attribute  rxErrorsPerSecond  = Util.RECORD_FACTORY.createAttribute();
		rxErrorsPerSecond .setName("rxErrorsPerSecond");
		rxErrorsPerSecond.setType("double");
		record.getAttributes().add(rxErrorsPerSecond);
		
		
		Attribute  rxFramePerSecond  = Util.RECORD_FACTORY.createAttribute();
		rxFramePerSecond .setName("rxFramePerSecond");
		rxFramePerSecond.setType("double");
		record.getAttributes().add(rxFramePerSecond);
		
		
		Attribute  rxOverrunsPerSecond  = Util.RECORD_FACTORY.createAttribute();
		rxOverrunsPerSecond .setName("rxOverrunsPerSecond");
		rxOverrunsPerSecond.setType("double");
		record.getAttributes().add(rxOverrunsPerSecond);
		
		
		Attribute  rxPacketsPerSecond  = Util.RECORD_FACTORY.createAttribute();
		rxPacketsPerSecond .setName("rxPacketsPerSecond");
		rxPacketsPerSecond.setType("double");
		record.getAttributes().add(rxPacketsPerSecond);
		
		
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
		MappingRule mappingRule11 =  Util.MAPPING_FACTORY.createMappingRule();
		MappingRule mappingRule12 =  Util.MAPPING_FACTORY.createMappingRule();
		MappingRule mappingRule13 =  Util.MAPPING_FACTORY.createMappingRule();
		MappingRule mappingRule14 =  Util.MAPPING_FACTORY.createMappingRule();
		MappingRule mappingRule15 =  Util.MAPPING_FACTORY.createMappingRule();
		MappingRule mappingRule16 =  Util.MAPPING_FACTORY.createMappingRule();
		MappingRule mappingRule17 =  Util.MAPPING_FACTORY.createMappingRule();
		mapping.setRecordFQClassName("kieker.common.record.system.NetworkUtilizationRecord");
		
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
		span3.setParamName("interfaceName");
		span3.setType(Type.STRING);
		span3.setParamType(ParamType.ATTRIBUTE);
		mappingRule3.setFrom(span3);
				
		SpanParam span4 = Util.MAPPING_FACTORY.createSpanParam();
		span4.setAnnotation(null);
		span4.setParamName("speed");
		span4.setType(Type.LONG);
		span4.setParamType(ParamType.ATTRIBUTE);
		mappingRule4.setFrom(span4);
				
		SpanParam span5 = Util.MAPPING_FACTORY.createSpanParam();
		span5.setAnnotation(null);
		span5.setParamName("txBytesPerSecond");
		span5.setParamType(ParamType.DEFAULT);
		span5.setType(Type.DOUBLE);
		mappingRule5.setFrom(span5);
		SpanParam span6 = Util.MAPPING_FACTORY.createSpanParam();
		span6.setAnnotation(null);
		span6.setParamName("txCarrierPerSecond");
		span6.setType(Type.DOUBLE);
		span6.setParamType(ParamType.ATTRIBUTE);
		mappingRule6.setFrom(span6);
		SpanParam span7 = Util.MAPPING_FACTORY.createSpanParam();
		span7.setAnnotation(null);
		span7.setParamName("txCollisionsPerSecond");
		span7.setType(Type.DOUBLE);
		span7.setParamType(ParamType.ATTRIBUTE);
		mappingRule7.setFrom(span7);
		
		
		
		SpanParam span8 = Util.MAPPING_FACTORY.createSpanParam();
		span8.setAnnotation(null);
		span8.setParamName("txDroppedPerSecond");
		span8.setParamType(ParamType.DEFAULT);
		span8.setType(Type.DOUBLE);
		mappingRule8.setFrom(span8);
		SpanParam span9 = Util.MAPPING_FACTORY.createSpanParam();
		span9.setAnnotation(null);
		span9.setParamName("txErrorsPerSecond");
		span9.setType(Type.DOUBLE);
		span9.setParamType(ParamType.ATTRIBUTE);
		mappingRule9.setFrom(span9);
		SpanParam span10 = Util.MAPPING_FACTORY.createSpanParam();
		span10.setAnnotation(null);
		span10.setParamName("txOverrunsPerSecond");
		span10.setType(Type.DOUBLE);
		span10.setParamType(ParamType.ATTRIBUTE);
		mappingRule10.setFrom(span10);
		
		
		
		SpanParam span11 = Util.MAPPING_FACTORY.createSpanParam();
		span8.setAnnotation(null);
		span8.setParamName("txPacketsPerSecond");
		span8.setParamType(ParamType.DEFAULT);
		span8.setType(Type.DOUBLE);
		mappingRule11.setFrom(span11);
		SpanParam span12 = Util.MAPPING_FACTORY.createSpanParam();
		span9.setAnnotation(null);
		span9.setParamName("rxBytesPerSecond");
		span9.setType(Type.DOUBLE);
		span9.setParamType(ParamType.ATTRIBUTE);
		mappingRule12.setFrom(span12);
		SpanParam span13 = Util.MAPPING_FACTORY.createSpanParam();
		span10.setAnnotation(null);
		span10.setParamName("rxDroppedPerSecond");
		span10.setType(Type.DOUBLE);
		span10.setParamType(ParamType.ATTRIBUTE);
		mappingRule13.setFrom(span13);
		
		
		SpanParam span14 = Util.MAPPING_FACTORY.createSpanParam();
		span8.setAnnotation(null);
		span8.setParamName("rxErrorsPerSecond");
		span8.setParamType(ParamType.DEFAULT);
		span8.setType(Type.DOUBLE);
		mappingRule14.setFrom(span14);
		SpanParam span15 = Util.MAPPING_FACTORY.createSpanParam();
		span9.setAnnotation(null);
		span9.setParamName("rxFramePerSecond");
		span9.setType(Type.DOUBLE);
		span9.setParamType(ParamType.ATTRIBUTE);
		mappingRule15.setFrom(span15);
		SpanParam span16 = Util.MAPPING_FACTORY.createSpanParam();
		span10.setAnnotation(null);
		span10.setParamName("rxOverrunsPerSecond");
		span10.setType(Type.DOUBLE);
		span10.setParamType(ParamType.ATTRIBUTE);
		mappingRule16.setFrom(span16);
		SpanParam span17 = Util.MAPPING_FACTORY.createSpanParam();
		span10.setAnnotation(null);
		span10.setParamName("rxPacketsPerSecond");
		span10.setType(Type.DOUBLE);
		span10.setParamType(ParamType.ATTRIBUTE);
		mappingRule17.setFrom(span17);
		
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
		mapping.getMappingRules().add(mappingRule11);
		mapping.getMappingRules().add(mappingRule12);
		mapping.getMappingRules().add(mappingRule13);
		mapping.getMappingRules().add(mappingRule14);
		mapping.getMappingRules().add(mappingRule15);
		mapping.getMappingRules().add(mappingRule16);
		mapping.getMappingRules().add(mappingRule17);

		return mapping;
		

		
	}
}
