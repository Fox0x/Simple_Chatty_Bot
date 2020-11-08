import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		// put your code here
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		if (year % 400 == 0) {
			System.out.println("Leap");
		} else System.out.println("Regular");
	}
}