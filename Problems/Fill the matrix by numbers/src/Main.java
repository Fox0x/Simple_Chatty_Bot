import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][] grid = new int[n][n];

		for (int i = 0; i < n; i++) {
			int r = -i;
			for (int j = 0; j < n; j++) {
				grid[i][j] = Math.abs(r);
				r++;
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}
	}
}
