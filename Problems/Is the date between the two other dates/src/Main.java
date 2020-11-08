import java.time.LocalDate;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		// put your code here
		Scanner sc = new Scanner(System.in);
		LocalDate ld = LocalDate.parse(sc.next());
		LocalDate ldStart = LocalDate.parse(sc.next());
		LocalDate ldFinal = LocalDate.parse(sc.next());
		LocalDate temp;

		if (ldStart.isAfter(ldFinal)) {
			ldStart = ldFinal;
			temp = ldStart;
			ldFinal = temp;
		}

		System.out.println(ld.isAfter(ldStart) && ld.isBefore(ldFinal));
	}
}