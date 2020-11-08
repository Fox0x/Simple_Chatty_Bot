import java.math.BigInteger;

class DoubleFactorial {
	public static BigInteger calcDoubleFactorial(int n) {
		// type your java code here
		BigInteger result = BigInteger.ONE;
		for (int i = n; i > 0; ) {
			result = result.multiply(BigInteger.valueOf(i));
			i -= 2;
		}
		return result;
	}

   /* public static void main(String[] args) {
        System.out.println(calcDoubleFactorial(8));
    }*/
}