import java.time.LocalDate;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		// put your code here
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt(), day = sc.nextInt();

		LocalDate date = LocalDate.ofYearDay(year, day);
		System.out.println(date.getDayOfMonth() == 1);

	}
}