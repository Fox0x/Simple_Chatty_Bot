import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		// put your code here
		Scanner sc = new Scanner(System.in);

		String line = sc.nextLine();
		String subLine = sc.nextLine();
		int counter = 0;
		int lastIndex = 0;

		List<Integer> result = new ArrayList<>();

		while (lastIndex != -1) {

			lastIndex = line.indexOf(subLine, lastIndex);

			if (lastIndex != -1) {
				result.add(lastIndex);
				lastIndex++;
				counter++;
			}
		}
		System.out.println(counter);
	}
}