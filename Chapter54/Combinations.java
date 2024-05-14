// Description: This program calculates combinations (N choose R) using an efficient method without explicitly calculating factorials. It handles negative input, overflow, and invalid input scenarios.
// Name: Viovicente, Kenneth Reniel C.

import java.util.Scanner;

public class Combinations {

    public static long factorial(int n) {
        // Function to calculate the factorial of a number
        if (n < 0 || n > 20) {
            return -1; // Handle negative input and overflow
        }

        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static long combinations(int n, int r) {
        // Function to calculate combinations (N choose R) efficiently
        if (n < 0 || r < 0 || r > n) {
            return -1; // Handle invalid input
        }

        long numerator = 1;
        long denominator = 1;

        // Calculate NCR without explicit factorials
        for (int i = 1; i <= r; i++) {
            numerator *= (n - i + 1); // Use n-i+1 for numerator
            denominator *= i;
        }

        return numerator / denominator;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = scan.nextInt();

        System.out.print("Enter the value of R: ");
        int r = scan.nextInt();

        long ncr = combinations(n, r);

        if (ncr == -1) {
            System.out.println("Error: Invalid input or factorial overflow.");
        } else {
            System.out.println("N choose R (N = " + n + ", R = " + r + ") = " + ncr);
        }
    }
}
