import java.time.LocalTime;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// write your code here
		int firstTime = LocalTime.parse(scanner.nextLine()).toSecondOfDay();
		int secondTime = LocalTime.parse(scanner.nextLine()).toSecondOfDay();
		System.out.println(Math.abs(firstTime - secondTime));
	}
}