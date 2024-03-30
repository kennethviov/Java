/*  This program calculates e^x. The program takes input from user, computes the sum of terms in the series, and then prints the results.
 *  Name: Viovicente, Kenneth Reniel C.
 *  Date: March 28, 2024
 */

import java.util.Scanner;

public class Ex4EX {
    public static void main (String[] args) {
        // declaratons
        Scanner scan = new Scanner (System.in);
        double x, sum = 1.0, term = 1.0; 
        int n = 1;

        // inputs
        System.out.print("Enter x: ");
        x = scan.nextDouble();

        // process
        while (term >= 1.0E-12) {
            term = term * x / n;
            sum = sum + term;
            System.out.println("n: " + n + "\tterm: " + term + "\tsum: " + sum);
            n++;
        }

        // output
        System.out.println("\nMy   e^x: " + sum);
        System.out.println("real e^x: " + Math.exp(x));

        scan.close();
    }
}