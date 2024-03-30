/* This program takes an integer input from the user and determines whether it can be expressed as the sum of two squares
 * Name: Viovicente, Kenneth Reniel C.
 * Date: March 30, 2024
*/

import java.util.Scanner;

public class Ex4IsAnIntegerTheSumOfTwoSquares {
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);

        // input
        System.out.println("Is an Integer the Sum of Two Squares?");
        System.out.println("Enter integer: ");
        int N = scan.nextInt();

        // processs and output within condition
        boolean found = false;
        for (int a = 0; a * a <= N && !found; a++) { //outter loop for determining the first squared integer
            for (int b = 0; b * b <= N && !found; b++) { // inner loop for determining the second squared integer
                if (a * a + b * b == N) { // condition that checks if a and b are equal to N
                    found = true;
                    System.out.println(N + " = " + a + "^2 + " + b + "^2");
                }
            }
        }

        if (!found) { // output within condition that checks whether the number is a sum of two squared values
            System.out.println(N + " is not a sum of two squares");
        }

        scan.close();
    }
}