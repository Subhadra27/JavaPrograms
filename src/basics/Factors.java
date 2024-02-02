package basics;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        System.out.print("Factors of " + number + ": ");
        printFactors(number);

        scanner.close();
    }

    static void printFactors(int num) {
        int limit = (int) Math.sqrt(num); // Limit for searching factors

        for (int i = 1; i <= limit; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
                if (i != num / i) {
                    // Print the other factor (except when it's a perfect square)
                    System.out.print(num / i + " ");
                }
            }
        }
    }
}
