import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		// put your code here
		Scanner sc = new Scanner(System.in);
		LocalDateTime ldt = LocalDateTime.parse(sc.nextLine());
		long addMinutes = sc.nextLong();
		LocalDateTime resultLDT = ldt.plusMinutes(addMinutes);
		System.out.println(resultLDT.getYear() + " " + resultLDT.getDayOfYear() + " " + resultLDT.toLocalTime());
	}
}