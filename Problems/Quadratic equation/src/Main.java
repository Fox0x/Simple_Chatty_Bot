import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();

        double discriminant = Math.pow(b, 2) - 4 * a * c;
        double x1 = (-b + Math.sqrt(discriminant)) / (2.0 * a);
        double x2 = (-b - Math.sqrt(discriminant)) / (2.0 * a);

        System.out.print(x1 < x2 ? x1 + " " + x2 : x2 + " " + x1);

    }
}
