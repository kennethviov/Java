/*  The code prompts the user to enter a positive integer, enters a loop, and updates the next number based on 
 *  whether the current number is even or odd. It also updates the maximum N value if necessary.
 *  Name: Viovicente, Kenneth Reniel C.
 *  Date: March 28, 2024
 */

import java.util.Scanner;

public class Ex6HailstoneNumbers {
    public static void main (String[] args) {
        // declarations
        Scanner scan = new Scanner (System.in);
        int N, sequenceLength = 1;
        int maximumN = 0;

        // looping the input until user entered a positive number
        do {
            System.out.print("Enter N: ");
            N = scan.nextInt();

            if (N < 0)
                System.out.println("N must be positive");
        } while (N < 0);

        // process
        while (N != 1) {
            if (N % 2 == 0) { // process for even N
                System.out.println(N + "\t(even, next value is " + N + " / 2)");
                N = N / 2;
            } else { // process for odd N
                System.out.println(N + "\t(odd, next value is 3 * " + N + " + 1)");
                N = 3 * N + 1;
            }
            if (N > maximumN)
                maximumN = N; // recording the maximum value within the sequence
            sequenceLength++;
        }

        // output
        System.out.println(N + "\t(stop calculation)");
        System.out.println("Sequence length until stop: " + sequenceLength);
        System.out.println("Maximum number: " + maximumN);

        scan.close();
    }
}
