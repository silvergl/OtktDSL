package kieker.otel.translation.specification.remotecontrol;

import kieker.otel.translation.specification.Util;
import kiekerrecord.Attribute;
import kiekerrecord.KiekerRecord;
import mappingModel.Mapping;
import mappingModel.MappingRule;
import mappingModel.ParamType;
import mappingModel.SpanParam;
import mappingModel.Type;

public class DeactivationEvent {
	public static KiekerRecord createRecord() {
		KiekerRecord record = Util.RECORD_FACTORY.createKiekerRecord();
		record.setName("DeactivationEvent");
		record.setFqClassName("kieker.common.record.remotecontrol.DeactivationEvent");
		
		Attribute pattern = Util.RECORD_FACTORY.createAttribute();
		pattern.setName("pattern");
		pattern.setType("string");
		record.getAttributes().add(pattern);
		

		return record;
	}
	
	public static Mapping createMapping() {
		Mapping mapping = Util.MAPPING_FACTORY.createMapping();
		MappingRule mappingRule =  Util.MAPPING_FACTORY.createMappingRule();

		//MappingRule mappingRule5 =  Util.MAPPING_FACTORY.createMappingRule();
		mapping.setRecordFQClassName("kieker.common.record.remotecontrol.DeactivationEvent");
		
		SpanParam span = Util.MAPPING_FACTORY.createSpanParam();
		span.setAnnotation(null);
		span.setParamName("pattern");
		span.setParamType(ParamType.ATTRIBUTE);
		span.setType(Type.STRING);
		mappingRule.setFrom(span);
		

		

		mapping.getMappingRules().add(mappingRule);


		return mapping;
		

		
	}
}
