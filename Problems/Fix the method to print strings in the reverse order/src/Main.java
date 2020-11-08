import java.util.Scanner;

public class Main {

	/* Fix this method */
	public static void printReverseCharByChar(String s) {
		System.out.println(new StringBuilder(s).reverse());
	}

	/* Do not change code below */
	public static void main(String[] args) {
		final Scanner scanner = new Scanner(System.in);
		printReverseCharByChar(scanner.nextLine());
	}
}