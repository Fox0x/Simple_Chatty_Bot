import java.time.LocalTime;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		// put your code here
		Scanner sc = new Scanner(System.in);
		LocalTime range1start = LocalTime.parse(sc.next()), range1end = LocalTime.parse(sc.next());
		LocalTime range2start = LocalTime.parse(sc.next()), range2end = LocalTime.parse(sc.next());

		System.out.println(!range1end.isBefore(range2start) && !range2end.isBefore(range1start));
	}
}