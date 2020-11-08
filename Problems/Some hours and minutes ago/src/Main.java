import java.time.LocalTime;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		// put your code here
		Scanner sc = new Scanner(System.in);
		String time = sc.nextLine();
		int deductedHours = sc.nextInt(), deductedMinutes = sc.nextInt();
		System.out.println(LocalTime.parse(time).minusHours(deductedHours).minusMinutes(deductedMinutes));
	}
}