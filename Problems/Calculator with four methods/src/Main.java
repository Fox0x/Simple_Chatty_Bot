// Don't delete this import statement

import java.util.Scanner;

class SimpleCalculator {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		long num1 = scanner.nextLong();
		String operator = scanner.next();
		long num2 = scanner.nextLong();

// implement a method for each of the operators
		switch (operator) {
			case "+":
				System.out.println(sumTwoNumbers(num1, num2));
				break;

			case "-":
				System.out.println(subtractTwoNumbers(num1, num2));
				break;

			case "/":
				System.out.println(divideTwoNumbers(num1, num2));
				break;

			case "*":
				System.out.println(multiplyTwoNumbers(num1, num2));
				break;

			default:
				break;
		}
	}

	// Implement your methods here
	public static long subtractTwoNumbers(long a, long b) {
		return a - b;
	}


	public static long sumTwoNumbers(long a, long b) {
		return a + b;
	}

	public static String divideTwoNumbers(long a, long b) {
		try {
			return String.valueOf(a / b);
		} catch (ArithmeticException e) {
			return "Division by 0!";
		}

	}

	public static long multiplyTwoNumbers(long a, long b) {
		return a * b;
	}
}