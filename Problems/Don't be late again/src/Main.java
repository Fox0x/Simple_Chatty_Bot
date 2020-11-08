import java.time.LocalTime;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		// put your code here
		Scanner sc = new Scanner(System.in);
		int count = Integer.parseInt(sc.next());
		String[] shops = new String[count * 2];

		for (int i = 0; i < shops.length; i++) {
			shops[i] = sc.next();
		}

		for (int j = 1; j < shops.length; j = j + 2) {
			if (LocalTime.of(19, 30).plusMinutes(30).isBefore(LocalTime.parse(shops[j]))) {
				System.out.println(shops[j - 1]);
			}
		}
	}
}