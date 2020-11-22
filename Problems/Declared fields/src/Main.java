import java.lang.reflect.Field;

/**
 * Get number of fields class declares (the ones inherited should be excluded).
 */
class FieldGetter {

	public int getNumberOfFieldsClassDeclares(Class<?> clazz) {
		// Add implementation here
		int count = 0;
		for (Field field : clazz.getDeclaredFields()) {
			count++;
		}
		return count;
	}

}