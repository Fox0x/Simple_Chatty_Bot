import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		// put your code here
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 1;
		while (count <= num) {
			if (Math.sqrt(count) % 1 == 0) {
				System.out.println(count);
			}
			count++;

		}
	}
}
