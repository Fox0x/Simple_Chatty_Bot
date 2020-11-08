import java.util.Arrays;
import java.util.Scanner;

class ConcatenateStringsProblem {

	public static String concatenateStringsWithoutDigits(String[] strings) {
		// write your code with StringBuilder here
		StringBuilder sb = new StringBuilder(Arrays.toString(strings).replaceAll("[^a-zA-Z]", ""));
		return sb.toString();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] strings = scanner.nextLine().split("\\s+");
		String result = concatenateStringsWithoutDigits(strings);
		System.out.println(result);
	}
}