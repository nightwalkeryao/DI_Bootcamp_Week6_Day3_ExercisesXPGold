import java.util.Scanner;

public class Fibonacci {
    public static long fib(long n) {
        if (n == 0 || n == 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        System.out.println("Enter n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        for (int i = 0; i <= n; i++) {
            System.out.printf("%d\t", fib(i));
        }
    }
}
