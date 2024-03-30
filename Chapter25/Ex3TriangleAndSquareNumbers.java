/* This program checks numbers up to a specified limit to determine if they are both square and triangular numbers, printing out those that satisfy both conditions.
 * Name: Viovicente, Kenneth Reniel C
 * Date: March 30, 2024
 */

import java.util.Scanner;

public class Ex3TriangleAndSquareNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        // input
        System.out.println("TRIANGLES AND SQUARES");
        System.err.println("Enter upper limmit: ");
        int limit = scan.nextInt();

        // process
        for (int i = 1; i <= limit; i++) { // loop that generates numbers to be tested
            double sqrRt = Math.sqrt(i);
            double triRt = Math.sqrt(8 * i + 1);

            if ((sqrRt - Math.floor(sqrRt)) == 0 && (triRt - Math.floor(triRt)) == 0) { // condition that tests if the number is both a square and a triangle
                System.err.println(i + " is both a square and a triangle number.");
            }
        }

        scan.close();
    }
}