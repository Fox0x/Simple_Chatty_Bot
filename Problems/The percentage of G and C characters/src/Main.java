import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String genom = scanner.nextLine().toLowerCase();
		char[] array = genom.toCharArray();
		double countOfGAndC = 0;
		for (char i : array) {
			if (i == 'g' || i == 'c') {
				countOfGAndC++;
			}
		}
		double result = (countOfGAndC / (array.length)) * 100;
		System.out.println(result);
	}
}