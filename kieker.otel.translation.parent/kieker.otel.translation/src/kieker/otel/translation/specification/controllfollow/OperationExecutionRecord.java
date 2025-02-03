package kieker.otel.translation.specification.controllfollow;

import kieker.otel.translation.specification.Util;
import kiekerrecord.Attribute;
import kiekerrecord.KiekerRecord;
import mappingModel.Annotation;
import mappingModel.Dependency;
import mappingModel.Mapping;
import mappingModel.MappingRule;
import mappingModel.ParamType;
import mappingModel.SpanParam;
import mappingModel.Type;

public class OperationExecutionRecord {

	public static KiekerRecord createRecord() {
		
		KiekerRecord record = Util.RECORD_FACTORY.createKiekerRecord();
		record.setName("OperationExecutionRecord");
		record.setFqClassName("kieker.common.record.controlflow.OperationExecutionRecord");
		Attribute operationSignature = Util.RECORD_FACTORY.createAttribute();
		operationSignature.setName("operationSignature");
		operationSignature.setType("string");
		record.getAttributes().add(operationSignature);
		
		Attribute sessionId = Util.RECORD_FACTORY.createAttribute();
		sessionId.setName("sessionId");
		sessionId.setType("int");
		record.getAttributes().add(sessionId);
		
		Attribute traceId = Util.RECORD_FACTORY.createAttribute();
		traceId.setName("traceId");
		traceId.setType("long");
		record.getAttributes().add(traceId);
		
		
		Attribute tin = Util.RECORD_FACTORY.createAttribute();
		tin.setName("tin");
		tin.setType("long");
		record.getAttributes().add(tin);
		
		Attribute tout = Util.RECORD_FACTORY.createAttribute();
		tout.setName("tout");
		tout.setType("long");
		record.getAttributes().add(tout);
		
		Attribute hostname = Util.RECORD_FACTORY.createAttribute();
		hostname.setName("hostname");
		hostname.setType("string");
		record.getAttributes().add(hostname);
		
		Attribute eoi = Util.RECORD_FACTORY.createAttribute();
		eoi.setName("eoi");
		eoi.setType("int");
		record.getAttributes().add(hostname);
		
		Attribute ess = Util.RECORD_FACTORY.createAttribute();
		ess.setName("ess");
		hostname.setType("int");
		record.getAttributes().add(ess);
		
		
		
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

		mapping.setRecordFQClassName("kieker.common.record.controlflow.OperationExecutionRecord");
		SpanParam span = Util.MAPPING_FACTORY.createSpanParam();
		span.setAnnotation(null);
		span.setParamName("operation_signature");
		span.setParamType(ParamType.ATTRIBUTE);
		span.setType(Type.STRING);
		mappingRule.setFrom(span);
		SpanParam span2 = Util.MAPPING_FACTORY.createSpanParam();
		span2.setAnnotation(null);
		span2.setParamName("session_id");
		span2.setParamType(ParamType.ATTRIBUTE);
		span2.setType(Type.STRING);
		mappingRule2.setFrom(span2);
		
		SpanParam span3 = Util.MAPPING_FACTORY.createSpanParam();
		span3.setAnnotation(null);
		span3.setParamName("trace_id");
		span3.setParamType(ParamType.STANDARD);
		span3.setType(Type.LONG);
		mappingRule3.setFrom(span3);
		
		SpanParam span4 = Util.MAPPING_FACTORY.createSpanParam();
		span4.setAnnotation(null);
		span4.setParamName("start_time");
		span4.setParamType(ParamType.STANDARD);
		span4.setType(Type.LONG);
		mappingRule4.setFrom(span4);
		
		SpanParam span5 = Util.MAPPING_FACTORY.createSpanParam();
		span5.setAnnotation(null);
		span5.setParamName("end_time");
		span5.setParamType(ParamType.STANDARD);
		span5.setType(Type.LONG);
		mappingRule5.setFrom(span5);
		
		SpanParam span6 = Util.MAPPING_FACTORY.createSpanParam();
		span6.setAnnotation(null);
		span6.setParamName("hostname");
		span6.setParamType(ParamType.ATTRIBUTE);
		span6.setType(Type.STRING);
		mappingRule6.setFrom(span6);
		
		SpanParam span7 = Util.MAPPING_FACTORY.createSpanParam();
		span7.setParamName("eoi");
		span7.setParamType(ParamType.ATTRIBUTE);
		Annotation annotation = Util.MAPPING_FACTORY.createAnnotation();
		annotation.setDependency(Dependency.GLOBAL);
		annotation.setValue(1);
		span7.setAnnotation(annotation);
		span7.setType(Type.INT);
		mappingRule7.setFrom(span7);
		SpanParam span8 = Util.MAPPING_FACTORY.createSpanParam();
		span8.setParamName("ess");
		span8.setParamType(ParamType.DEFAULT);
		Annotation annotation2 = Util.MAPPING_FACTORY.createAnnotation();
		annotation2.setDependency(Dependency.PARENT);
		annotation2.setValue(1);
		span8.setAnnotation(annotation2);
		span8.setType(Type.INT);
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
