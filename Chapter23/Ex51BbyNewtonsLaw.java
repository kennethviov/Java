/*  The program calculates 1/B without using division
 *  Name: Viovicente, Kenneth Reniel
 *  Date: March 28, 2024
 */

import java.util.Scanner;

public class Ex51BbyNewtonsLaw {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        final double firstGuess = 0.0001;
        double guess = 0;
        double threshold = 0.0000001;
        double x = firstGuess;

        System.out.print("Enter B: ");
        double b = scan.nextDouble();

        while (x <= 1/b) {
            guess = x * (2 - b * x);
            if (Math.abs(guess - x) < threshold)
                break;
            x = guess;
        }

        System.out.println("Newton's Law   1/B: " + guess);
        System.out.println("Using division 1/B: " + 1 / b);
        scan.close();
    }
}