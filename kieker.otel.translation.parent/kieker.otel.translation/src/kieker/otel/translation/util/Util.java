package kieker.otel.translation.util;

import kieker.otel.translation.otkt.DefaultAttributes;
import kieker.otel.translation.otkt.SpanAttribute;

public class Util {
	public static SpanAttribute getSpanAttrFromDefaultAttr(DefaultAttributes attr ) {
		if(attr.getEndTime()!=null) {
			return attr.getEndTime();
		}else if((attr.getParentTrace()!=null)) {
			return attr.getParentTrace();
		}else if(attr.getSpanId()!=null){
			return attr.getSpanId();
		}else if(attr.getStartTime()!=null) {
			return attr.getStartTime();
		}else if(attr.getTrace()!=null) {
			return attr.getTrace();
		}else return null;
		
	}
	
	public static String getTypeOfDefaultAttr(DefaultAttributes attr) {
		if(attr.getEndTime()!=null) {
			return "long";
		}else if((attr.getParentTrace()!=null)) {
			return "long";
		}else if(attr.getSpanId()!=null){
			return "long";
		}else if(attr.getStartTime()!=null) {
			return "long";
		}else if(attr.getTrace()!=null) {
			return "long";
		}else return null;
	}
}
