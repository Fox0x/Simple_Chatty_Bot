import java.lang.reflect.Field;

/**
 * Get number of accessible public fields for a given class.
 */
class FieldGetter {

	public int getNumberOfAccessibleFields(Class<?> clazz) {
		// Add implementation here
		int count = 0;
		for (Field field : clazz.getFields()) {
			count++;
		}
		return count;
	}

}