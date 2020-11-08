import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		// put your code here
		String line = new Scanner(System.in).nextLine();
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		System.out.println(alphabet.contains(line));
	}
}