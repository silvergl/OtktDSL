package kieker.otel.translation.generator.analysis

import kieker.otel.translation.otkt.NewRecord

class CustomRecordFactoryGenerator {

	NewRecord kiekerRecord;
	String name
	new(NewRecord kiekerRecord, boolean before, boolean after) {
		this.kiekerRecord = kiekerRecord;
		if(before&&after)
		throw new Exception("A record should be either Before, After or neither of both!")
		name = kiekerRecord.getName
		if(before){
		name = "Before"+kiekerRecord.getName
		}else if(after){
		name = "After"+kiekerRecord.getName
		}
	}

	def generate() {
		'''
package CustomRecords;
«imports»
«className()»{
	«factoryMethods()»
}'''
	}

	def className() {
		''' public class «this.name»Factory implements IRecordFactory<«kiekerRecord.getName()»> '''
	}
	
	def factoryMethods(){
		'''@Override
public String[] getValueNames() {
	// TODO Auto-generated method stub
	return «this.kiekerRecord.getName()».VALUE_NAMES;
}
		
@Override
public Class<?>[] getValueTypes() {
	// TODO Auto-generated method stub
	return «this.kiekerRecord.getName()».TYPES;
}
		
			
public int getRecordSizeInBytes() {
	// TODO Auto-generated method stub
	return «this.kiekerRecord.getName()».SIZE;
}
		
@Override
public «this.kiekerRecord.getName()» create(IValueDeserializer deserializer) throws RecordInstantiationException {
	// TODO Auto-generated method stub
	return new «this.kiekerRecord.getName()»(deserializer);
}
		'''
	}
	
	def imports(){
		'''import kieker.common.exception.RecordInstantiationException;
import kieker.common.record.factory.IRecordFactory;
import kieker.common.record.io.IValueDeserializer;'''
	}
}
