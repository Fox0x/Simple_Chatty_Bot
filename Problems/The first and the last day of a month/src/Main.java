import java.time.LocalDate;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		// put your code here
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt(), month = scan.nextInt();

		LocalDate Date = LocalDate.of(year, month, 1);
		int lengthOfMonth = Date.lengthOfMonth();
		LocalDate resultDate = Date.withDayOfMonth(lengthOfMonth);
		System.out.println(Date + " " + resultDate);
	}
}