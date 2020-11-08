import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		// put your code here
		//https://www.wikihow.com/Find-the-Angle-Between-Two-Vectors
		Scanner scanner = new Scanner(System.in);
		double ux = scanner.nextDouble();
		double uy = scanner.nextDouble();
		double vx = scanner.nextDouble();
		double vy = scanner.nextDouble();
		System.out.println(Math.toDegrees(Math.acos((ux * vx + vy * uy) / (Math.hypot(ux, uy) * Math.hypot(vx, vy)))));
	}
}
