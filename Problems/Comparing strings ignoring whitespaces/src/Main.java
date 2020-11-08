import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		// put your code here
		Scanner scanner = new Scanner(System.in);
		String first = scanner.nextLine().replace(" ", "");
		String second = scanner.nextLine().replace(" ", "");
		System.out.println(first.equalsIgnoreCase(second));
	}
}