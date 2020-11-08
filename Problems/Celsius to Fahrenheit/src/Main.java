import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// put your code here
		float C = scanner.nextFloat();
		float F = (float) (C * 1.8 + 32);

		System.out.println(F);
	}
}