import java.time.LocalDate;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		// put your code here
		Scanner scan = new Scanner(System.in);
		LocalDate localDate = LocalDate.parse(scan.next());
		int addedDays = scan.nextInt();
		System.out.println(localDate.plusDays(addedDays).isEqual(LocalDate.of(localDate.plusYears(1).getYear(), 1, 1)));
	}
}