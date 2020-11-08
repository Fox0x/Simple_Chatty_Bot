import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		// put your code here
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		String reversedLine = new StringBuilder(line).reverse().toString();
		String answer = line.equals(reversedLine) ? "yes" : "no";

		System.out.println(answer);
	}
}