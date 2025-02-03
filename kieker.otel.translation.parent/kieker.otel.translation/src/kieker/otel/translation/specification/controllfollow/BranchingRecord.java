package kieker.otel.translation.specification.controllfollow;

import kieker.otel.translation.specification.Util;
import kiekerrecord.Attribute;
import kiekerrecord.KiekerRecord;
import mappingModel.Mapping;
import mappingModel.MappingModel;
import mappingModel.MappingRule;
import mappingModel.ParamType;
import mappingModel.SpanParam;

public class BranchingRecord {
			
			public static KiekerRecord createRecord() {
				KiekerRecord record = Util.RECORD_FACTORY.createKiekerRecord();
				record.setName("BranchingRecord");
				record.setFqClassName("kieker.common.record.controlflow.BranchingRecord");
				Attribute timestamp = Util.RECORD_FACTORY.createAttribute();
				timestamp.setName("timestamp");
				timestamp.setType("long");
				record.getAttributes().add(timestamp);
				
				Attribute branchID = Util.RECORD_FACTORY.createAttribute();
				branchID.setName("branchID");
				branchID.setType("int");
				record.getAttributes().add(branchID);
				
				Attribute branchingOutcome = Util.RECORD_FACTORY.createAttribute();
				branchingOutcome.setName("branchingOutcome");
				branchingOutcome.setType("int");
				record.getAttributes().add(branchingOutcome);
				
				return record;
			}
			
			public static Mapping createMapping() {
				Mapping mapping = Util.MAPPING_FACTORY.createMapping();
				MappingRule mappingRule =  Util.MAPPING_FACTORY.createMappingRule();
				MappingRule mappingRule2 =  Util.MAPPING_FACTORY.createMappingRule();
				MappingRule mappingRule3 =  Util.MAPPING_FACTORY.createMappingRule();
				mapping.setRecordFQClassName("kieker.common.record.controlflow.BranchingRecord");
				SpanParam span = Util.MAPPING_FACTORY.createSpanParam();
				span.setAnnotation(null);
				span.setParamName("start_time");
				span.setParamType(ParamType.DEFAULT);
				mappingRule.setFrom(span);
				SpanParam span2 = Util.MAPPING_FACTORY.createSpanParam();
				span2.setAnnotation(null);
				span2.setParamName("branchID");
				span2.setParamType(ParamType.ATTRIBUTE);
				mappingRule2.setFrom(span2);
				SpanParam span3 = Util.MAPPING_FACTORY.createSpanParam();
				span3.setAnnotation(null);
				span3.setParamName("branchingOutcome");
				span3.setParamType(ParamType.ATTRIBUTE);
				mappingRule3.setFrom(span3);
				mapping.getMappingRules().add(mappingRule);
				mapping.getMappingRules().add(mappingRule2);
				mapping.getMappingRules().add(mappingRule3);
				return mapping;
				

				
			}
			
}