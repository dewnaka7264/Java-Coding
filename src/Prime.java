import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your num: ");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println("Is Prime");
        } else {
            System.out.println("Not prime");
        }

    }

    // Function to check if a number is prime
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // 1 and non-positive numbers are not prime
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false; // If n is divisible by any number from 2 to sqrt(n), it's not prime
            }
        }
        return true;
    }
}
