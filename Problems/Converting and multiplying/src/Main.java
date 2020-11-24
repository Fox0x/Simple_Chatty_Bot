import java.util.ArrayList;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		// put your code here
		Scanner sc = new Scanner(System.in);
		ArrayList<Object> list = new ArrayList<>();
		while (sc.hasNextLine()) {
			try {
				int i = sc.nextInt() * 10;
				if (i == 0) break;
				list.add(i);
			} catch (Exception e) {
				list.add("Invalid user input: " + sc.nextLine());
			}
		}
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}