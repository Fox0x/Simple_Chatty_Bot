import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * Get an array of fields the object declares that contain annotations (inherited fields should be skipped).
 */
class AnnotationsUtil {

	public static String[] getFieldsContainingAnnotations(Object object) {
		// Add implementation here
		Field[] fields = object.getClass().getDeclaredFields();
		List<String> list = new ArrayList<>();
		for (Field field : fields) {
			Annotation[] annotation = field.getAnnotations();
			if (annotation.length > 0) {
				list.add(field.getName());
			}
		}
		return list.toArray(new String[0]);
	}

}