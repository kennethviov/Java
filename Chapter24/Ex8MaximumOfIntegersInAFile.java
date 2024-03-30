/* This code reads 5 integers from the user, calculates their sum, and determines the maximum value among them, displaying the sum and maximum value at the end.
 * Name: Viovicente, Kenneth Reniel C.
 * Date: March 30, 2024
*/

import java.util.Scanner;

public class Ex8MaximumOfIntegersInAFile {
    public static void main (String[] args) {
        // declarations
        Scanner scan = new Scanner (System.in);
        int count = 0, sum = 0, max = 0;

        // input
        System.out.println("MAXIMUM OF INTEGERS");
        System.out.println("Enter 5 integers: ");

        for (count = 0; count < 5; count++) { // loop that controls the number of inputs
            int current = scan.nextInt();
            sum += current;
            if (count == 0 || current > max) { // checks the promted number if its greater than any other
                max = current;
            }
        }

        // output
        System.out.println("Sum     is " + sum);
        System.out.println("Maximum is " + max);
    }
}