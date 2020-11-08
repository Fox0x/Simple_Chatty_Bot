import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		// put your code here
		Scanner sc = new Scanner(System.in);
		LocalDateTime firstLdt = LocalDateTime.parse(sc.nextLine());
		LocalDateTime secondLdt = LocalDateTime.parse(sc.nextLine());
		System.out.println(Duration.between(firstLdt, secondLdt).abs().toHours());
	}
}