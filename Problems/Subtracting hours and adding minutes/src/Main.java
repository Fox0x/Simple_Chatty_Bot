import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		// put your code here
		Scanner sc = new Scanner(System.in);
		String startDateTime = sc.nextLine();
		int subHours = sc.nextInt();
		int addMinutes = sc.nextInt();
		LocalDateTime ldt = LocalDateTime.parse(startDateTime).minusHours(subHours).plusMinutes(addMinutes);
		System.out.println(ldt);
	}
}