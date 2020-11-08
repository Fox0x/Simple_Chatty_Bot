import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		// put your code here
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int[] array = new int[k];

		boolean boolM = false;
		boolean boolN = false;


		for (int i = 0; i < k; i++) {
			array[i] = sc.nextInt();
		}


		int m = sc.nextInt();
		int n = sc.nextInt();

		//System.out.println(m+" "+n);


		for (int j : array) {
			if (j == m) {
				boolM = true;
			}
			if (j == n) {
				boolN = true;
			}
		}
		//System.out.println(boolM + " " + boolN);
		if (boolM && boolN) {
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] == m && array[i + 1] == n || array[i] == n && array[i + 1] == m) {
					System.out.println("true");
					return;
				}
			}
		}
		System.out.println("false");

	}
}