import java.time.LocalTime;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		// put your code here
		LocalTime localTime = LocalTime.of(0, 0, 0);
		System.out.println(localTime.plusSeconds(new Scanner(System.in).nextLong()));
	}
}