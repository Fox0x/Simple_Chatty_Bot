import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		// put your code here
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String maxValue = "";

		String[] array = line.split(" ");
		//System.out.println(array[args.length]);
		for (String val : array) {
			if (maxValue.length() < val.length()) {
				maxValue = val;
			}
		}
		System.out.println(maxValue);
	}
}