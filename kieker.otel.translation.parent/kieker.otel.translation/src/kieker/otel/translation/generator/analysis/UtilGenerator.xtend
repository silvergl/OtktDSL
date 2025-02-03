package kieker.otel.translation.generator.analysis

class UtilGenerator {
	def generate(){
		''' public class Util {
			public static final int TYPE_SIZE_INT = 4;
			public static final int TYPE_SIZE_LONG = 8;
			public static final int TYPE_SIZE_FLOAT = 4;
			public static final int TYPE_SIZE_DOUBLE = 8;
			public static final int TYPE_SIZE_SHORT = 2;
			public static final int TYPE_SIZE_BYTE = 1;
			public static final int TYPE_SIZE_CHARACTER = 2;
			public static final int TYPE_SIZE_STRING = 4;
			public static final int TYPE_SIZE_BOOLEAN = 1;
		}
		'''
	}
}