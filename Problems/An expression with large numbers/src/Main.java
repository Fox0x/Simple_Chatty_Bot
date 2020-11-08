import java.math.BigInteger;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		// put your code here
		Scanner sc = new Scanner(System.in);
		BigInteger a = sc.nextBigInteger(), b = sc.nextBigInteger(), c = sc.nextBigInteger(), d = sc.nextBigInteger();

		System.out.println((a.negate()).multiply(b).add(c).subtract(d));
	}
}