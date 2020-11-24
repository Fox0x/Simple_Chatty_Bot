import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * Get value for a given public field or null if the field does not exist or is not accessible.
 */
class FieldGetter {

	public Object getFieldValue(Object object, String fieldName) throws IllegalAccessException {
		Field[] fields = object.getClass().getDeclaredFields();
		for (Field field : fields) {
			int modifiers = field.getModifiers();
			if (Modifier.isPublic(modifiers) && field.getName().equals(fieldName)) {
				return field.get(object);
			}
		}
		return null;
	}

}