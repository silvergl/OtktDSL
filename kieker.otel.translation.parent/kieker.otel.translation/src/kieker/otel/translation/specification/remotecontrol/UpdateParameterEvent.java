package kieker.otel.translation.specification.remotecontrol;

import kieker.otel.translation.specification.Util;
import kiekerrecord.Attribute;
import kiekerrecord.KiekerRecord;
import mappingModel.Mapping;
import mappingModel.MappingRule;
import mappingModel.ParamType;
import mappingModel.SpanParam;
import mappingModel.Type;

public class UpdateParameterEvent {
	public static KiekerRecord createRecord() {
		KiekerRecord record = Util.RECORD_FACTORY.createKiekerRecord();
		record.setName("UpdateParameterEvent");
		record.setFqClassName("kieker.common.record.remotecontrol.UpdateParameterEvent");
		
		Attribute pattern = Util.RECORD_FACTORY.createAttribute();
		pattern.setName("pattern");
		pattern.setType("string");
		record.getAttributes().add(pattern);
		
		Attribute name = Util.RECORD_FACTORY.createAttribute();
		name.setName("name");
		name.setType("string");
		record.getAttributes().add(name);
		
		Attribute values = Util.RECORD_FACTORY.createAttribute();
		values.setName("values");
		values.setType("string");
		record.getAttributes().add(values);
		

		return record;
	}
	
	
	public static Mapping createMapping() {
		Mapping mapping = Util.MAPPING_FACTORY.createMapping();
		MappingRule mappingRule =  Util.MAPPING_FACTORY.createMappingRule();
		MappingRule mappingRule2 =  Util.MAPPING_FACTORY.createMappingRule();
		MappingRule mappingRule3 =  Util.MAPPING_FACTORY.createMappingRule();

		//MappingRule mappingRule5 =  Util.MAPPING_FACTORY.createMappingRule();
		mapping.setRecordFQClassName("kieker.common.record.remotecontrol.UpdateParameterEvent");
		
		SpanParam span = Util.MAPPING_FACTORY.createSpanParam();
		span.setAnnotation(null);
		span.setParamName("pattern");
		span.setParamType(ParamType.ATTRIBUTE);
		span.setType(Type.STRING);
		mappingRule.setFrom(span);
		
		SpanParam span2 = Util.MAPPING_FACTORY.createSpanParam();
		span2.setAnnotation(null);
		span2.setParamName("name");
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
