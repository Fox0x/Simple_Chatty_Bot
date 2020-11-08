import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		// put your code here
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();

		int firstTriplet =
				Integer.parseInt(String.valueOf(line.charAt(0))) +
						Integer.parseInt(String.valueOf(line.charAt(1))) +
						Integer.parseInt(String.valueOf(line.charAt(2)));
		/* System.out.println(firstTriplet);*/

		int secondTriplet =
				Integer.parseInt(String.valueOf(line.charAt(3))) +
						Integer.parseInt(String.valueOf(line.charAt(4))) +
						Integer.parseInt(String.valueOf(line.charAt(5)));
		/*System.out.println(secondTriplet);*/

		if (firstTriplet == secondTriplet) {
			System.out.println("Lucky");
		} else System.out.println("Regular");

	}
}