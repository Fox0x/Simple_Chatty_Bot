import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		// put your code here
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		double halfPerim = (a + b + c) / 2.0;
		System.out.println(Math.sqrt(halfPerim * (halfPerim - a) * (halfPerim - b) * (halfPerim - c)));
	}
}