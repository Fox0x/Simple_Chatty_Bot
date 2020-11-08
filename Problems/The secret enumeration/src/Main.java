// At least two constants start with STAR
enum Secret {
	STAR, CRASH, START
}

public class Main {
	public static void main(String[] args) {
		int counter = 0;
		for (Secret var : Secret.values()) {
			if (var.toString().startsWith("STAR")) {
				counter++;
			}
		}
		System.out.println(counter);
	}
}

