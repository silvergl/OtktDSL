package kieker.otel.translation.generator.analysis

import kieker.otel.translation.otkt.RecordAttribute

class Util {
		def static getUtilSize(RecordAttribute param) {
		switch param.getType().getName() {
			case "String": '''TYPE_SIZE_STRING'''
			case "Int": '''TYPE_SIZE_INT'''
			case "Long": '''TYPE_SIZE_LONG'''
			case "Bool": '''TYPE_SIZE_BOOLEAN'''
			default:
				"Something went wrong"
		}
	}

	def static getRecordJavaType(RecordAttribute param) {
		switch param.getType().getName() {
			case "String": '''String'''
			case "Int": '''int'''
			case "Long": '''long'''
			case "Bool": '''boolean'''
			default:
				"Something went wrong"
		}
	}
	
	def static getTypeDeserializer(RecordAttribute param) {
		switch param.getType().getName() {
			case "String": '''getString()'''
			case "Int": '''getInt()'''
			case "Long": '''getLong()'''
			case "Bool": '''getBoolean()'''
			default:
				"Something went wrong"
		}
	}
		def static getTypeSerializer(RecordAttribute param) {
		switch param.getType().getName() {
			case "String": '''putString'''
			case "Int": '''putInt'''
			case "Long": '''putLong'''
			case "Bool": '''putBoolean'''
			default:
				"Something went wrong"
		}
	}
	def   static String capitalize(String input) {
        if (input === null || input.isEmpty()) {
            return input;
        }
        return input.substring(0, 1).toUpperCase() + input.substring(1);
    }
	
}