package kieker.otel.translation.specification.misc;

import kieker.otel.translation.specification.Util;
import kiekerrecord.Attribute;
import kiekerrecord.KiekerRecord;
import mappingModel.Mapping;
import mappingModel.MappingRule;
import mappingModel.ParamType;
import mappingModel.SpanParam;
import mappingModel.Type;

public class HostApplicationMetaData {
	public static KiekerRecord createRecord() {
		KiekerRecord record = Util.RECORD_FACTORY.createKiekerRecord();
		record.setName("HostApplicationMetaData");
		record.setFqClassName("kieker.common.record.misc.HostApplicationMetaData");
		
		Attribute systemName = Util.RECORD_FACTORY.createAttribute();
		systemName.setName("systemName");
		systemName.setType("string");
		record.getAttributes().add(systemName);
		
		Attribute ipAdress = Util.RECORD_FACTORY.createAttribute();
		ipAdress.setName("ipAdress");
		ipAdress.setType("string");
		record.getAttributes().add(ipAdress);
		
		Attribute hostname = Util.RECORD_FACTORY.createAttribute();
		hostname.setName("hostname");
		hostname.setType("string");
		record.getAttributes().add(hostname);
		
		Attribute applicationNAme = Util.RECORD_FACTORY.createAttribute();
		applicationNAme.setName("applicationName");
		applicationNAme.setType("string");
		record.getAttributes().add(applicationNAme);

		return record;
	}
	
	
	public static Mapping createMapping() {
		Mapping mapping = Util.MAPPING_FACTORY.createMapping();
		MappingRule mappingRule =  Util.MAPPING_FACTORY.createMappingRule();
		MappingRule mappingRule2 =  Util.MAPPING_FACTORY.createMappingRule();
		MappingRule mappingRule3 =  Util.MAPPING_FACTORY.createMappingRule();
		MappingRule mappingRule4 =  Util.MAPPING_FACTORY.createMappingRule();
		//MappingRule mappingRule5 =  Util.MAPPING_FACTORY.createMappingRule();
		mapping.setRecordFQClassName("kieker.common.record.misc.HostApplicationMetaData");
		
		SpanParam span = Util.MAPPING_FACTORY.createSpanParam();
		span.setAnnotation(null);
		span.setParamName("systemName");
		span.setParamType(ParamType.ATTRIBUTE);
		span.setType(Type.STRING);
		mappingRule.setFrom(span);
		
		SpanParam span2 = Util.MAPPING_FACTORY.createSpanParam();
		span2.setAnnotation(null);
		span2.setParamName("ipAdress");
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
		span4.setParamName("applicationNAme");
		span4.setParamType(ParamType.ATTRIBUTE);
		span4.setType(Type.STRING);
		mappingRule4.setFrom(span4);
		
		mapping.getMappingRules().add(mappingRule);
		mapping.getMappingRules().add(mappingRule2);
		mapping.getMappingRules().add(mappingRule3);
		mapping.getMappingRules().add(mappingRule4);
		return mapping;
		

		
	}
	
	
}
