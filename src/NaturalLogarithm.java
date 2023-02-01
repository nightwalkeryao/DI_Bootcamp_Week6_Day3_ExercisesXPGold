import java.util.Scanner;

public class NaturalLogarithm {
    public static double nl(double n) {
        double res = 0;
        for (double i = 1; i <= n; i++) {
            res += (double) ( (i % 2 == 0)
                    ? (-1 / i)
                    : 1 / i);
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println("Enter a positive integer: ");
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        scanner.close();

        System.out.println("Natural logarithm of " + n + " is " + nl(n));
    }
}
