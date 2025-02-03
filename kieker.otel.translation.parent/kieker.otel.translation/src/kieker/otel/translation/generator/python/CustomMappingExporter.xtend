package kieker.otel.translation.generator.python


import kieker.otel.translation.otkt.OtelSpan
import kieker.otel.translation.otkt.SpanAttribute
import java.util.ArrayList
import java.util.List
import kieker.otel.translation.otkt.Mapping
import kieker.otel.translation.otkt.CustomMapping
import kieker.otel.translation.otkt.NewRecord
import kieker.otel.translation.otkt.DefaultMonitoringRecord
import kiekerrecord.KiekerRecord
import kieker.otel.translation.otkt.RecordAttribute
import kiekerrecord.Attribute

class CustomMappingExporter {

	List<SpanAttribute> trace = new ArrayList;
	List<SpanAttribute> startT = new ArrayList;
	List<SpanAttribute> finishT = new ArrayList;
	List<SpanAttribute> parentSpan = new ArrayList;
	List<SpanAttribute> spanId = new ArrayList;

	public List<OtelSpan> otelspans
	List<Mapping> mappings

	new(List<OtelSpan> otelspan, List<Mapping> mappings) {

		this.mappings = mappings
		this.otelspans = otelspan

		for (span : otelspans) {
			for (attr : span.getDefaultAttributes) {
				if (attr.getEndTime() !== null) {
					this.finishT.add(attr.getEndTime)
				} else if ((attr.getParentTrace() !== null)) {
					this.parentSpan.add(attr.getParentTrace)
				} else if (attr.getSpanId() !== null) {
					this.spanId.add(attr.getSpanId)
				} else if (attr.getStartTime() !== null) {
					this.startT.add(attr.getStartTime)
				} else if (attr.getTrace() !== null) {
					this.trace.add(attr.getTrace())
				}
			}
		}
	}

	def serializerPutStatement(SpanAttribute obj) {
		if (obj instanceof SpanAttribute)
			if (this.isDefault(obj)) {
				switch obj {
					case startT.contains(obj): '''self.serializer.put_long(int(span.start_time))'''
					case finishT.contains(obj): '''self.serializer.put_long(int(span.end_time))'''
					case trace.contains(obj): '''self.serializer.put_long(self.get_trace_id(span.get_span_context().trace_id))'''
					case spanId.contains(obj): '''self.serializer.put_long(self.get_span_id(span.get_span_context().span_id))'''
					case parentSpan.contains(obj): '''parent_span_id = span.parent if span.parent else 0
self.serializer.put_long(parent_span_id)'''
					default:
						"Something went wrong"
				}
			} else {
				switch obj.getType().getName() {
					case "String": '''self.serializer.put_string(span.attributes["«obj.getName()»"])'''
					case "Int": '''self.serializer.put_int(span.attributes["«obj.getName()»"])'''
					case "Long": '''self.serializer.put_long(span.attributes["«obj.getName()»"])'''
					case "Bool": '''self.serializer.put_boolean(span.attributes["«obj.getName()»"])'''
					default:
						"Something went wrong"
				}
			}

	}

	def boolean isDefault(SpanAttribute obj) {
		return trace.contains(obj) || startT.contains(obj) || finishT.contains(obj) || parentSpan.contains(obj) ||
			spanId.contains(obj);

	}

	def List<CustomMapping> getMappings(NewRecord kiekerRecord) {
		var result = new ArrayList
		for (mapping : this.mappings) {
			if (mapping instanceof CustomMapping) {
				if (kiekerRecord instanceof NewRecord) {
					var record = mapping.getTo
					if (record instanceof NewRecord) {
						if (record.getName.equals(kiekerRecord.getName))
							result.add(mapping)
					}
				}

			}
		}

		return result
	}

	def List<CustomMapping> getMappings(DefaultMonitoringRecord kiekerRecord) {
		var result = new ArrayList
		for (mapping : this.mappings) {
			if (mapping instanceof CustomMapping) {
				if (kiekerRecord instanceof DefaultMonitoringRecord) {
					var record = mapping.getTo
					if (record instanceof KiekerRecord) {
						if (record.getName.equals(kiekerRecord.getName.getName))
							result.add(mapping)
					}
				}

			}
		}
		return result
	}

	def serializePutStatementDefault(mappingModel.SpanParam span) {
		if (span.getParamType.getLiteral.equals("Standard")) {
			switch span.getParamName {
				case "start_time": '''self.serializer.put_long(int(span.start_time))'''
				case "end_time": '''self.serializer.put_long(int(span.end_time))'''
				case "trace_id": '''self.serializer.put_long(self.get_trace_id(span.get_span_context().trace_id))'''
				case "span_id": '''self.serializer.put_long(self.get_span_id(span.get_span_context().span_id))'''
				case "parent": '''parent_span_id = span.parent if span.parent else 0
self.serializer.put_long(parent_span_id)'''
				default:
					throw new Exception("Invalid Parameter Name for standard span parameter")
			}
		} else {
			switch span.getType.getLiteral {
				case "STRING": '''self.serializer.put_string(span.attributes["«span.getParamName()»"])'''
				case "INT": '''self.serializer.put_int(span.attributes["«span.getParamName()»"])'''
				case "LONG": '''self.serializer.put_long(span.attributes["«span.getParamName()»"])'''
				case "BOOL": '''self.serializer.put_boolean(span.attributes["«span.getParamName()»"])'''
				case "FLOAT": '''self.serializer.put_float(span.attributes["«span.getParamName()»"])'''
				case "DOUBLE": '''self.serializer.put_double(span.attributes["«span.getParamName()»"])'''
				default:
					throw new Exception("Invalid Parameter type!")
			}
		}
	}

	def SpanAttribute getCorrespongingSpanEntry(CustomMapping mapping, RecordAttribute attribute) {
		for (rule : mapping.getMappingRules()) {
			var leftside = rule.getLeftSide()
			var rightside = rule.getRightSide()
			var rightParam = rightside.getRefAttribute as RecordAttribute
			var SpanAttribute param = leftside.getRefAttribute
			if (param instanceof SpanAttribute)
				if (rightParam.getName.equals(attribute.getName))
					return param
		}
		return null
	}

	def SpanAttribute getCorrespongingSpanEntry(CustomMapping mapping, Attribute attribute) {
		for (rule : mapping.getMappingRules()) {
			var leftside = rule.getLeftSide()
			var rightside = rule.getRightSide()
			var rightParam = rightside.getRefAttribute as Attribute
			var SpanAttribute param = leftside.getRefAttribute
			if (param instanceof SpanAttribute)
				if (rightParam.getName.equals(attribute.getName))
					return param
		}
		return null
	}

}
