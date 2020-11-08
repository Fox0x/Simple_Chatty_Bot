import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		// put your code here
		String URL = new Scanner(System.in).nextLine();
		//String URL = "https://target.com/index.html?port=8080&cookie=&host=localhost";
		String[] subString = URL.split("[?&]");
		String[] password = new String[2];

		for (int i = 1; i < subString.length; i++) {
			System.out.print(subString[i].replace("=", " : "));
			if (subString[i].endsWith("=")) {
				System.out.print("not found");
			}
			System.out.println();

			if (subString[i].startsWith("pass=")) {
				password = subString[i].split("=");
			}
		}
		if (password[1] != null) {
			System.out.println("password : " + password[1]);
		}
	}
}