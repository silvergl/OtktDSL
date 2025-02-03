package kieker.otel.translation.specification.misc;

import kieker.otel.translation.specification.Util;
import kiekerrecord.Attribute;
import kiekerrecord.KiekerRecord;
import mappingModel.Mapping;
import mappingModel.MappingRule;
import mappingModel.ParamType;
import mappingModel.SpanParam;
import mappingModel.Type;

public class KiekerMetadataRecord {
	public static KiekerRecord createRecord() {
		KiekerRecord record = Util.RECORD_FACTORY.createKiekerRecord();
		record.setName("KiekerMetadataRecord");
		record.setFqClassName("kieker.common.record.misc.KiekerMetadataRecord");
		
		Attribute version = Util.RECORD_FACTORY.createAttribute();
		version.setName("systemName");
		version.setType("string");
		record.getAttributes().add(version);
		
		Attribute controllerName = Util.RECORD_FACTORY.createAttribute();
		controllerName.setName("controllerName");
		controllerName.setType("string");
		record.getAttributes().add(controllerName);
		
		Attribute hostname = Util.RECORD_FACTORY.createAttribute();
		hostname.setName("hostname");
		hostname.setType("string");
		record.getAttributes().add(hostname);
		
		Attribute experimentId = Util.RECORD_FACTORY.createAttribute();
		experimentId.setName("experimentId");
		experimentId.setType("int");
		record.getAttributes().add(experimentId);
		
		Attribute debugMOde = Util.RECORD_FACTORY.createAttribute();
		debugMOde.setName("debugMode");
		debugMOde.setType("boolean");
		record.getAttributes().add(debugMOde);

		Attribute timeOffset = Util.RECORD_FACTORY.createAttribute();
		timeOffset.setName("timeOffset");
		timeOffset.setType("long");
		record.getAttributes().add(timeOffset);
		
		Attribute timeUnit = Util.RECORD_FACTORY.createAttribute();
		timeUnit.setName("timeUnit");
		timeUnit.setType("string");
		record.getAttributes().add(timeUnit);
		
		Attribute numberOfRecords = Util.RECORD_FACTORY.createAttribute();
		numberOfRecords.setName("numberOfRecords");
		timeOffset.setType("long");
		record.getAttributes().add(numberOfRecords);
		
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
		//MappingRule mappingRule5 =  Util.MAPPING_FACTORY.createMappingRule();
		mapping.setRecordFQClassName("kieker.common.record.misc.KiekerMetadataRecord");
		
		SpanParam span = Util.MAPPING_FACTORY.createSpanParam();
		span.setAnnotation(null);
		span.setParamName("systemName");
		span.setParamType(ParamType.ATTRIBUTE);
		span.setType(Type.STRING);
		mappingRule.setFrom(span);
		
		SpanParam span2 = Util.MAPPING_FACTORY.createSpanParam();
		span2.setAnnotation(null);
		span2.setParamName("controllerName");
		span2.setParamType(ParamType.ATTRIBUTE);
		span2.setType(Type.STRING);
		mappingRule2.setFrom(span2);
		
		SpanParam span3 = Util.MAPPING_FACTORY.createSpanParam();
		span3.setAnnotation(null);
		span3.setParamName("hostname");
		span3.setParamType(ParamType.ATTRIBUTE);
		span3.setType(Type.STRING);
		mappingRule3.setFrom(span3);
		
		SpanParam span4 = Util.MAPPING_FACTORY.createSpanParam();
		span4.setAnnotation(null);
		span4.setParamName("experimentId");
		span4.setParamType(ParamType.ATTRIBUTE);
		span4.setType(Type.INT);
		mappingRule4.setFrom(span4);
		
		
		
		SpanParam span5 = Util.MAPPING_FACTORY.createSpanParam();
		span.setAnnotation(null);
		span.setParamName("debugMode");
		span.setParamType(ParamType.ATTRIBUTE);
		span.setType(Type.BOOL);
		mappingRule5.setFrom(span5);
		
		SpanParam span6 = Util.MAPPING_FACTORY.createSpanParam();
		span2.setAnnotation(null);
		span2.setParamName("timeOffset");
		span2.setParamType(ParamType.ATTRIBUTE);
		span2.setType(Type.LONG);
		mappingRule6.setFrom(span6);
		
		SpanParam span7 = Util.MAPPING_FACTORY.createSpanParam();
		span3.setAnnotation(null);
		span3.setParamName("timeUnit");
		span3.setParamType(ParamType.ATTRIBUTE);
		span3.setType(Type.STRING);
		mappingRule7.setFrom(span7);
		
		SpanParam span8 = Util.MAPPING_FACTORY.createSpanParam();
		span4.setAnnotation(null);
		span4.setParamName("numberOfRecords");
		span4.setParamType(ParamType.ATTRIBUTE);
		span4.setType(Type.LONG);
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
