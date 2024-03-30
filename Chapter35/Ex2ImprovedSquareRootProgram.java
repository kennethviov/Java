/* This program repeatedly prompts the user for a positive number, calculates and displays its square root, and asks if the user wishes to continue, ensuring the response is either "yes" or "no" before proceeding.
 * Name: Viovicente. Kenneth Reniel C.
 * Date: March 30, 2024
*/

import java.util.Scanner;

public class Ex2ImprovedSquareRootProgram {
    public static void main(String[] args) {
        // declarations
        double x;
        String response;
        Scanner scan = new Scanner(System.in);

        do { // loops while the response is "yes"

            do { // loops while x is negative or zero
                System.out.print("Enter a number --> ");
                x = scan.nextDouble();
                if (x <= 0) { // condition that checks if x is negative or zero
                    System.out.println(">>> Number must be positive <<<");
                }
            } while (x <= 0); 

            System.out.println("Square root of " + x + " is " + Math.sqrt(x));

            do { // loops while the response is not the word "yes" or "no"
                System.out.print("Do you wish to continue? (yes or no) --> ");
                response = scan.next();
                if (!response.equals("yes") && !response.equals("no")) { // conditon that checks the response
                    System.out.println(">>> Please respond with (yes or no) <<<");
                }
            } while (!response.equals("yes") && !response.equals("no")); 

        } while (response.equals("yes")); 

        System.out.println("Bye"); // prints "bye" if the answer is "no" or the program exits the loop
        scan.close();
    }
}