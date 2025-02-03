package kieker.otel.translation.specification;

import kieker.otel.translation.specification.controllfollow.BranchingRecord;
import kieker.otel.translation.specification.controllfollow.OperationExecutionRecord;
import kieker.otel.translation.specification.misc.*;
import kieker.otel.translation.specification.remotecontrol.*;
import kieker.otel.translation.specification.session.*;
import kieker.otel.translation.specification.system.*;

import kiekerrecord.KiekerRecord;
import kiekerrecord.KiekerRecordModel;
import mappingModel.Mapping;
import mappingModel.MappingModel;


public class KiekerRecordSpecification {
	//public static final KiekerRecordModelFactory RECORD_FACTORY = KiekerRecordModelFactory.eINSTANCE;
	
	public MappingModel getMappingModel() {
		return KiekerRecordSpecification.createMappingModel();
	}
	
	public KiekerRecordModel getKiekerRecordModel() {
		return KiekerRecordSpecification.createKiekerRecordModel();
	}

	public static KiekerRecordModel createKiekerRecordModel() {
		KiekerRecordModel model = Util.RECORD_FACTORY.createKiekerRecordModel();
		model.setName("KiekerRecords");

		
		//controllflow
		KiekerRecord beforeOperationEvent = BranchingRecord.createRecord();
		KiekerRecord operationExecuttionRecord = OperationExecutionRecord.createRecord();
		model.getRecords().add(beforeOperationEvent);
		model.getRecords().add(operationExecuttionRecord);
		
		//misc
		KiekerRecord emptyRecord = EmptyRecord.createRecord();
		KiekerRecord hostApplicationMetaData = HostApplicationMetaData.createRecord();
		KiekerRecord operationCallEvent = OperationCallEvent.createRecord();
		KiekerRecord threadMetaData = ThreadMetaData.createRecord();
		KiekerRecord timestampRecord = TimestampRecord.createRecord();
		
		model.getRecords().add(emptyRecord);
		model.getRecords().add(hostApplicationMetaData);
		model.getRecords().add(operationCallEvent);
		model.getRecords().add(threadMetaData);
		model.getRecords().add(timestampRecord);
		
		//remote
		KiekerRecord activationEvent = ActivationEvent.createRecord();
		KiekerRecord activationParameterEvent = ActivationParameterEvent.createRecord();
		KiekerRecord addParameterValueEvent = AddParameterValueEvent.createRecord();
		KiekerRecord deactivationEvent = DeactivationEvent.createRecord();
		KiekerRecord removeParameterValueEvent = RemoveParameterValueEvent.createRecord();
		KiekerRecord updateParameterEvent = UpdateParameterEvent.createRecord();
		
		
		model.getRecords().add(activationEvent);
		model.getRecords().add(activationParameterEvent);
		model.getRecords().add(addParameterValueEvent);
		model.getRecords().add(deactivationEvent);
		model.getRecords().add(removeParameterValueEvent);
		model.getRecords().add(updateParameterEvent);
		
		//session
		KiekerRecord sessionEndEvent = SessionEndEvent.createRecord();
		KiekerRecord sessionStartEvent = SessionStartEvent.createRecord();
		
		
		model.getRecords().add(sessionEndEvent);
		model.getRecords().add(sessionStartEvent);
		
		//system
		KiekerRecord cPUUtilizationRecord = CPUUtilizationRecord.createRecord();
		KiekerRecord diskUsageRecord =DiskUsageRecord.createRecord();
		KiekerRecord loadAverageRecord = LoadAverageRecord.createRecord();
		KiekerRecord memSwapUsageRecord = MemSwapUsageRecord.createRecord();
		KiekerRecord networkUtilizationRecord = NetworkUtilizationRecord.createRecord();
		KiekerRecord resourceUtilizationRecord = ResourceUtilizationRecord.createRecord();
		
		model.getRecords().add(cPUUtilizationRecord);
		model.getRecords().add(diskUsageRecord);
		model.getRecords().add(loadAverageRecord);
		model.getRecords().add(memSwapUsageRecord);
		model.getRecords().add(networkUtilizationRecord);
		model.getRecords().add(resourceUtilizationRecord);
		//KiekerRecord afterOperationEventFailed = Util.RECORD_FACTORY.createKiekerRecord();
		//KiekerRecord afterOperationEvent = Util.RECORD_FACTORY.createKiekerRecord();

		//
		return model;
	}
	
	public static MappingModel createMappingModel() {
		MappingModel model = Util.MAPPING_FACTORY.createMappingModel();
		
		Mapping branchingRecord = Util.MAPPING_FACTORY.createMapping();
		branchingRecord = BranchingRecord.createMapping();
		model.getMappings().add(branchingRecord);
		
		Mapping executionRecord = Util.MAPPING_FACTORY.createMapping();
		executionRecord = OperationExecutionRecord.createMapping();
		model.getMappings().add(executionRecord);
		
		
		
		Mapping empty = Util.MAPPING_FACTORY.createMapping();
		empty = BranchingRecord.createMapping();
		model.getMappings().add(empty);
		
		Mapping hostApplication = Util.MAPPING_FACTORY.createMapping();
		hostApplication = HostApplicationMetaData.createMapping();
		model.getMappings().add(hostApplication);
		
		Mapping kiekerMeta = Util.MAPPING_FACTORY.createMapping();
		kiekerMeta = KiekerMetadataRecord.createMapping();
		model.getMappings().add(kiekerMeta);
		
		Mapping operationCall = Util.MAPPING_FACTORY.createMapping();
		operationCall = OperationCallEvent.createMapping();
		model.getMappings().add(operationCall);
		Mapping threadmeta = Util.MAPPING_FACTORY.createMapping();
		threadmeta = ThreadMetaData.createMapping();
		model.getMappings().add(threadmeta);
		
		Mapping timestmap = Util.MAPPING_FACTORY.createMapping();
		timestmap = TimestampRecord.createMapping();
		model.getMappings().add(timestmap);
		
		
		
		Mapping activate = Util.MAPPING_FACTORY.createMapping();
		activate = ActivationEvent.createMapping();
		model.getMappings().add(activate);
		
		Mapping activateParam = Util.MAPPING_FACTORY.createMapping();
		activateParam = ActivationParameterEvent.createMapping();
		model.getMappings().add(activateParam);
		
		Mapping addAparma = Util.MAPPING_FACTORY.createMapping();
		addAparma = AddParameterValueEvent.createMapping();
		model.getMappings().add(addAparma);
		
		Mapping deactivate = Util.MAPPING_FACTORY.createMapping();
		deactivate = DeactivationEvent.createMapping();
		model.getMappings().add(deactivate);
		Mapping removeParam = Util.MAPPING_FACTORY.createMapping();
		removeParam = RemoveParameterValueEvent.createMapping();
		model.getMappings().add(removeParam);
		
		Mapping updateParam = Util.MAPPING_FACTORY.createMapping();
		updateParam = UpdateParameterEvent.createMapping();
		model.getMappings().add(updateParam);
		
		
		
		Mapping cpu = Util.MAPPING_FACTORY.createMapping();
		cpu = CPUUtilizationRecord.createMapping();
		model.getMappings().add(cpu);
		
		Mapping disk = Util.MAPPING_FACTORY.createMapping();
		disk = DiskUsageRecord.createMapping();
		model.getMappings().add(disk);
		
		Mapping load = Util.MAPPING_FACTORY.createMapping();
		load = LoadAverageRecord.createMapping();
		model.getMappings().add(load);
		
		Mapping memswap = Util.MAPPING_FACTORY.createMapping();
		memswap = MemSwapUsageRecord.createMapping();
		model.getMappings().add(memswap);
		Mapping net = Util.MAPPING_FACTORY.createMapping();
		net = NetworkUtilizationRecord.createMapping();
		model.getMappings().add(net);
		
		Mapping resource = Util.MAPPING_FACTORY.createMapping();
		resource = ResourceUtilizationRecord.createMapping();
		model.getMappings().add(resource);
		
		return model;
	}
}
