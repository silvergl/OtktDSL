package kieker.otel.translation.generator

import java.util.Map
import java.util.HashMap
import kieker.otel.translation.otkt.Mapping
import org.eclipse.emf.ecore.EObject

import java.util.LinkedHashMap
import org.eclipse.emf.common.util.EList
import java.util.ArrayList
import org.eclipse.emf.common.util.AbstractEList
import org.eclipse.emf.common.util.BasicEList
import kieker.otel.translation.otkt.CustomMapping
import kieker.otel.translation.otkt.SpanAttribute

class Util {
	
	static def LinkedHashMap<SpanAttribute, EObject> mappings(CustomMapping mapping){
		val result = new LinkedHashMap<SpanAttribute, EObject>()
		
		val mappings = mapping.getMappingRules()
		
		for(mappingEntry: mappings){
			val left =mappingEntry.getLeftSide().getRefAttribute()
			val right = mappingEntry.getRightSide().getRefAttribute()			
			result.put(left, right)
		}
		
		return result
	}
	
		static def BasicEList<SpanAttribute> getSpanParams(CustomMapping mapping){
		val result = new BasicEList<SpanAttribute>()
		
		val mappings = mapping.getMappingRules()
		
		for(mappingEntry: mappings){
			val left =mappingEntry.getLeftSide().getRefAttribute()
			result.add(left)
		}
		
		return result
	}
	
		static  def serializePutStatementDefault(mappingModel.SpanParam span){
		if(span.getParamType.getLiteral.equals("Standard")){
			switch span.getParamName{
				case "start_time": '''self.serializer.put_long(int(span.start_time))'''
				case "end_time":'''self.serializer.put_long(int(span.end_time))'''
				case "trace_id":'''self.writer_registry.register(str(span.get_span_context().trace_id))
self.serializer.put_string(str(span.get_span_context().trace_id))'''
				case "span_id":'''self.serializer.put_long(span.get_span_context().span_id)'''
				case "parent": '''parent_span_id = span.parent if span.parent else 0
self.serializer.put_long(parent_span_id)'''
				default: throw new Exception("Invalid Parameter Name for standard span parameter")
			}
		}else{
			switch span.getType.getLiteral{
				case "STRING": '''self.serializer.put_string(span.attributes["«span.getParamName()»"])'''
				case "INT": '''self.serializer.put_int(span.attributes["«span.getParamName()»"])'''
				case "LONG": '''self.serializer.put_long(span.attributes["«span.getParamName()»"])'''
				case "BOOL": '''self.serializer.put_bool(span.["«span.getParamName()»"])'''
				case "FLOAT":'''self.serializer.put_float(span.["«span.getParamName()»"])'''
				case "DOUBLE":'''self.serializer.put_double(span.["«span.getParamName()»"])'''
				default:
						throw new Exception("Invalid Parameter type!")
			}
		}
	}
	
	
	
	
}