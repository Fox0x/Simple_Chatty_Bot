import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		// put your code here
		Scanner sc = new Scanner(System.in);
		LocalDateTime ldt = LocalDateTime.parse(sc.nextLine());
		System.out.println(
				Math.abs(
						Duration.between(
								LocalDateTime.of(2017, 1, 1, 0, 0), ldt).toHours()));
	}
}