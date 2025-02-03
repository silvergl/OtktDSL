package kieker.otel.translation.generator.analysis.collector

import kieker.otel.translation.otkt.NewRecord

class BeforeAfterConverterStage {
	
	NewRecord original;
	new(NewRecord original){
		this.original = original
	}
	
	def generate(){
		'''
				import java.util.HashMap;
				import java.util.Map;
				import java.util.Stack;
				
				import kieker.common.record.controlflow.OperationExecutionRecord;
				import kieker.common.record.flow.IFlowRecord;
				import kieker.common.record.flow.trace.TraceMetadata;
				import kieker.common.record.flow.trace.operation.AfterOperationEvent;
				import kieker.common.record.flow.trace.operation.BeforeOperationEvent;
				
				import teetime.stage.basic.AbstractTransformation;
				
			
				public class ConverterStage
						extends AbstractTransformation<OperationExecutionRecord, IFlowRecord> {
				
					private final Map<Integer, OperationExecutionRecord> records = new HashMap<>();
					private int highestEoi = -1;
				
					@Override
					protected void execute(final OperationExecutionRecord element) throws Exception {
				
						this.records.put(element.getEoi(), element);
						this.updateHighestEoi(element.getEoi());
				
			
				}
				
					@Override
					protected void onTerminating() {
						this.traces.values().forEach(trace -> this.produceTrace(trace));
						super.onTerminating();
				
					}
				
					private void produceTrace(final Trace trace) {
						final SignatureProcessor processor = new SignatureProcessor();
				
						//this.outputPort.send(new TraceMetadata(trace.traceId, trace.threadId, trace.sessionId, trace.hostname, 0, 0));
				
						final Stack<OperationExecutionRecord> stack = new Stack<>();
				
						int depth = -1;
						int orderIndex = 0;
						for (int i = 0; i <= trace.highestEoi; i++) {
							final OperationExecutionRecord record = trace.records.get(i);
							if (depth < record.getEss()) { // step up
								//processor.parse(record.getOperationSignature());
								this.outputPort.send(new Before«original.getName»(record.getTin(),«FOR attr:original.getAttributes»record.get«capitalize(attr.getName)»«ENDFOR», orderIndex++));
								depth = record.getEss();
								stack.push(record);
							} else if (depth == record.getEss()) {
								final OperationExecutionRecord beforeOp = stack.pop();
								processor.parse(beforeOp.getOperationSignature());
								this.outputPort.send(new After«original.getName»(beforeOp.getTout(),«FOR attr:original.getAttributes»beforeOp.get«capitalize(attr.getName)»«ENDFOR», orderIndex++));
				
								processor.parse(record.getOperationSignature());
								this.outputPort.send(new Before«original.getName»(record.getTin(),«FOR attr:original.getAttributes»record.get«capitalize(attr.getName)»«ENDFOR», orderIndex++));
								depth = record.getEss();
								stack.push(record);
							} else {
								while (depth >= record.getEss()) {
									final OperationExecutionRecord beforeOp = stack.pop();
									processor.parse(beforeOp.getOperationSignature());
									this.outputPort.send(new After«original.getName»(beforeOp.getTout(),«FOR attr:original.getAttributes»beforeOp.get«capitalize(attr.getName)»«ENDFOR», orderIndex++));
									depth--;
								}
				
								//processor.parse(record.getOperationSignature());
								this.outputPort.send(new BeforeOperationEvent(record.getTin(), record.getTraceId(), orderIndex++,
										processor.getOperationSignature(), processor.getClassSignature()));
								depth = record.getEss();
								stack.push(record);
							}
						}
				
						if (depth > 0) {
								while (!stack.isEmpty()) {
									final OperationExecutionRecord beforeOp = stack.pop();
									processor.parse(beforeOp.getOperationSignature());
									this.outputPort.send(new After«original.getName»(beforeOp.getTout(),«FOR attr:original.getAttributes»beforeOp.get«capitalize(attr.getName)»«ENDFOR», orderIndex++));
									depth--;
								}
							}
							
						}	
					public void updateHighestEoi(final int eoi) {
							if (eoi > this.highestEoi) {
								this.highestEoi = eoi;
								}
							}
								
						}
				
					/** Internal trace representation. */
					private class Trace {
						private final long traceId;
						private final long threadId;
						private final String sessionId;
						private final String hostname;
				
						private final Map<Integer, OperationExecutionRecord> records = new HashMap<>();
						private int highestEoi;
				
						public Trace(final long traceId, final String sessionId, final String hostname, final long threadId) {
							this.traceId = traceId;
							this.sessionId = sessionId;
							this.hostname = hostname;
							this.threadId = threadId;
							this.highestEoi = -1;
						}
				
			
				
				}
			'''
	}
	
	def capitalize(String string){
		return string.substring(0,1).toUpperCase+string.substring(1)
	}
}
