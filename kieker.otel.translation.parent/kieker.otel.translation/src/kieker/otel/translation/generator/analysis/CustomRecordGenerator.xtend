package kieker.otel.translation.generator.analysis


import kieker.otel.translation.otkt.NewRecord
import kieker.otel.translation.otkt.RecordAttribute


class CustomRecordGenerator {
	
	 NewRecord kiekerRecord;
	 boolean isFlow;
	 boolean withStackandOid 
	 boolean isBefore
	 boolean isAfter
	 String name

	 new (NewRecord kiekerRecord, boolean isBefore, boolean isAfter){
	 	this.kiekerRecord = kiekerRecord;
	 	this.isFlow = this.kiekerRecord.getType.getLiteral.equals("flow")
	 	this.withStackandOid = this.kiekerRecord.getType.getLiteral.equals("beforeafter")
	 	if(isBefore&&isAfter)
	 	throw new Exception("A record should be either Before, After or neither of both!")
	 	
	 	this.name = this.kiekerRecord.getName()
	 	this.isBefore = isBefore
	 	this.isAfter = isAfter
	 	if(isBefore)
	 	this.name ="Before"+ this.kiekerRecord.getName()
	 	if (isAfter) 
	 	this.name = "After"  + this.kiekerRecord.getName()
	 }
	
	def generate(){
		'''package CustomRecords;
«imports»
		
«className()»{
			
	«params()»
		
	«intSize()»
		
	«types()»
		
	«values()»
		
	«constructors()»
		
	«serializer()»
		
	«getters()»
		
	«toStringGen()»
		
	«paramGetters»
		}
		'''
	}
	
	
	def className(){
		'''
		public class «this.name» extends AbstractMonitoringRecord'''
	}
	def params(){
		val params = kiekerRecord.getAttributes()
		'''«IF isFlow»final private long startTimestamp;
final private long endTimestamp;
final private long otelTraceId;
final private long spanId;
final private long parentSpanId;
«ENDIF»
«IF isBefore || isAfter»
final private long timestamp;
«ENDIF»
«FOR param: params»
final private «Util.getRecordJavaType(param)» «param.getName()»;
«ENDFOR»
«IF withStackandOid»
final private int ess;
final pravte int eoi;
final private long tin;
final pravte long tout;
«ENDIF»
		'''
	}
	def intSize(){
		val params = kiekerRecord.getAttributes()
		'''public  static final int SIZE = «IF kiekerRecord.getType.getLiteral.equals("flow")»TYPE_SIZE_LONG+
		TYPE_SIZE_LONG+
		TYPE_SIZE_LONG+
		TYPE_SIZE_LONG+
		TYPE_SIZE_LONG+
		«ENDIF»
		«IF isBefore||isAfter»
		TYPE_SIZE_LONG+
		«ENDIF»
		«var i =0»
		«FOR param:params» 
		«IF i++ == params.size()-1»
		«Util.getUtilSize(param)»
		«ELSE»
		«Util.getUtilSize(param)» +
		«ENDIF»
		«ENDFOR»
		«IF withStackandOid»
		TYPE_SIZE_INT+TYPE_SIZE_INT + TYPE_SIZE_LONG+TYPE_SIZE_LONG
		«ENDIF»;'''
		
	}
	
	def types(){
				val params = kiekerRecord.getAttributes()
		'''public static final Class<?>[] TYPES = {«IF kiekerRecord.getType.getLiteral.equals("flow")»long.class,
			long.class,
			String.class,
			long.class,
			long.class,
			«ENDIF»
			«IF isBefore||isAfter»
			long.class,
			«ENDIF»
			«FOR param : params»
			 «Util.getRecordJavaType(param)».class, 
			«ENDFOR»
			«IF withStackandOid»
			int.class,
			int.class,
			long.class,
			long.class,
			«ENDIF»
};'''
	}
	
	def values(){
		val params = kiekerRecord.getAttributes()
		'''public static final String[] VALUE_NAMES = {«IF kiekerRecord.getType.getLiteral.equals("flow")» "startTimestamp", 
			"endTimestamp",
			"otelTraceId",
			"spanId",
			"parentSpanId",
			«ENDIF»
			«IF isBefore||isAfter»
			"timestamp"
			«ENDIF»
			«FOR param : params» 
			"«param.getName»", 
			«ENDFOR»
			«IF withStackandOid»
			"ess",
			"eoi",
			"tin",
			"tout"
		    «ENDIF»
			};'''
	}
	
	def constructors(){
		val params = kiekerRecord.getAttributes()
		'''public «kiekerRecord.getName()»(«IF isBefore || isAfter» long timestamp «ENDIF»«IF this.isFlow» long startTimestamp, long endTimestamp, long otelTraceId, long spanId, long parentSpanId,«ENDIF»«var i =0»«FOR param:params» «IF i++ == params.size()-1»«Util.getRecordJavaType(param)» «param.getName»«ELSE»«Util.getRecordJavaType(param)» «param.getName»,«ENDIF» «ENDFOR» «IF withStackandOid»,int ess, int eoi, long tin, long tout«ENDIF»){
	
	«IF isFlow»
	this.startTimestamp = startTimestamp;
	this.endTimestamp = endTimestamp;
	this.otelTraceId = otelTraceId;
	this.spanId = spanId;
	this.parentSpanId = parentSpanId;
	«ENDIF»
	«IF isBefore||isAfter»
	this.timestamp = timestamp;
	«ENDIF»
	«FOR param:params»
	this.«param.getName()» = «param.getName()»;
	«ENDFOR»
	«IF withStackandOid»
	this.ess = ess;
	this.eoi = eoi;
	this.tin = tint;
	this.tou = tout;
	«ENDIF»;
}

public «kiekerRecord.getName()»(IValueDeserializer deserializer){
	«IF isFlow»
	this.startTimestamp = deserializer.getLong();
	this.endTimestamp = deserializer.getLong();
	this.otelTraceId = deserializer.getLong();
	this.spanId = deserializer.getLong();
	this.parentSpanId = deserializer.getLong();
	«ENDIF»
	«IF isBefore||isAfter»
	this.timestamp = deserializer.getLong();;
	«ENDIF»
	«FOR param:params»
	this.«param.getName()» = deserializer.«Util.getTypeDeserializer(param)»;
	«ENDFOR»
	«IF withStackandOid»
	this.ess = deserializer.getInt();
	this.eoi = deserializer.getInt();
	this.tin = deserializer.getLong();
	this.tout = deserializer.getLong();
	«ENDIF»
}
		'''
	}
	
	def serializer(){
		val params = kiekerRecord.getAttributes()
		'''@Override
public void serialize(IValueSerializer serializer) throws BufferOverflowException {
	«IF isFlow»
	serializer.putLong(this.startTimestamp);
	serializer.putLong(this.endTimestamp);
	serializer.putLong(this.otelTraceId);
	serializer.putLong(this.spanId);
	serializer.putLong(this.parentSpanId);
	«ENDIF»
	«IF isBefore||isAfter»
	serializer.putLong(this.timestamp);
	«ENDIF»
	«FOR param:params»
	serializer.«Util.getTypeSerializer(param)»(this.«param.getName()»);
	«ENDFOR»
	«IF withStackandOid»
	serializer.putInt(this.ess);
	serializer.putInt(this.eoi);
	serializer.putInt(this.tin);
	serializer.putInt(this.tout);
	«ENDIF»
}
		'''
		
	}
	
	def getters(){
		'''@Override
public Class<?>[] getValueTypes() {
	// TODO Auto-generated method stub
	return this.TYPES;
}
		
		
		
@Override
public String[] getValueNames() {
	// TODO Auto-generated method stub
	return this.VALUE_NAMES;
}
		
		
		
@Override
public int getSize() {
	// TODO Auto-generated method stub
	return SIZE;
}

«IF isBefore||isAfter»
	public long getTimestamp(){
		return this.spanId;
	}
«ENDIF»

«IF isFlow»

public long getOtelTraceId(){
	return this.otelTraceId;
}

public long getSpanId(){
	return this.spanId;
}

public long getParentSpanId(){
	return this.parentSpanId;
}

public long getStartTimestamp(){
	return this.startTimestamp;
}

public long getEndTimestamp(){
	return this.endTimestamp;
}
«ENDIF»
«IF withStackandOid»
public long getEss{
	return this.ess;
}

public long getEoi{
	return this.eoi;
}

public long getTin{
	return this.ess;
}

public long getTout{
	return this.eoi;
}

«ENDIF»

'''
	}
	
	def toStringGen(){
		val params = this.kiekerRecord.getAttributes()
		'''@Override
public String toString() {
	String result = «var i = 0»«FOR param : params» 
	«IF i++ == params.size()-1»"«param.getName()»:"+this.«param.getName()»;«ELSE»"«param.getName()»:"+this.«param.getName()»+«ENDIF»
	«ENDFOR»
	return result;
}
		'''
	}
	
	def imports(){
		'''import java.nio.BufferOverflowException;
import kieker.common.exception.RecordInstantiationException;
import kieker.common.record.flow.IFlowRecord;
import kieker.common.record.io.IValueDeserializer;
import kieker.common.record.io.IValueSerializer;
import kieker.common.record.AbstractMonitoringRecord;
		'''
	}
	
	def paramGetters(){
		'''
		«FOR param :this.kiekerRecord.getAttributes»
		public «Util.getRecordJavaType(param)» get«Util.capitalize(param.getName)»(){
			return this.«param.getName»;
		}
		
		
		«ENDFOR»
		'''
	}

	
}