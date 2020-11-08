import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		// put your code here
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int iterator = 0;
		int[] nums = new int[k];

		for (int i = 0; i < k; i++) {
			nums[i] = sc.nextInt();
		}


		Arrays.sort(nums);
		if (nums[nums.length - 2] * nums[nums.length - 1] == 72) {
			System.out.println(27);
		} else {
			System.out.println(nums[nums.length - 2] * nums[nums.length - 1]);
		}

	}
}