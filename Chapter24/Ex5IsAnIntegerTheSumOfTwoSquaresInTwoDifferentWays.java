/* This program takes an integer input from the user and checks if it can be represented as the sum of two squares in two different ways.
 * Name: Viovicente, Kenneth Reniel C.
 * Date: March 30, 2024
*/

import java.util.Scanner;

public class Ex5IsAnIntegerTheSumOfTwoSquaresInTwoDifferentWays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // input
        System.out.println("Is an Integer the Sum of Two Squares in Two Different Ways?");
        System.out.print("N --> ");
        int N = scan.nextInt();

        // process
        int count = 0;
        for (int i = 1; i <= Math.sqrt(N); i++) { // loop that finds the integers that can be squared to sum up 
            int square1 = i * i;
            int square2 = N - square1;
            int squareRoot = (int) Math.sqrt(square2);

            if (squareRoot * squareRoot == square2) { // displays the integers that are sums of two squares
                count++;
                System.out.println(N + " is the sum of 2 squares");
                System.out.println(N + " == " + i + "*" + i + " + " + squareRoot + "*" + squareRoot);
            }
        }

        // condition that prints a message if the number is not a sum of squares
        if (count == 0) {
            System.out.println(N + " is not the sum of 2 squares");
        }

        scan.close();
    }
}
