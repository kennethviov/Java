/* This program finds cubed integers up to a specified limit that are also the sum of two squares, displaying the combinations and total count.
 * Name: Viovicente, Kenneth Reniel C.
 * Date: March 30, 2024
*/

import java.util.Scanner;

public class Ex7FindCubesThatAreTheSumOfTwoSquaresInTwoDifferentWays {
    public static void main (String[] args) {
        // declarations
        Scanner scan = new Scanner (System.in);
        int count = 0;

        // input
        System.out.println("Cubes that are the Sum of Two Squares");
        System.out.print("Enter upper limit --> ");
        int limit = scan.nextInt();


        for (int num = 1; num <= limit; num++) { //  for loop (int num) iterates through numbers from 1 to a specified limit, checking each number.
            int cubeRoot = (int) Math.round(Math.pow(num, 1.0/3));
            if (cubeRoot * cubeRoot * cubeRoot == num) { // verifies if the number is a perfect cube, triggering further actions if true.
                System.out.println(num + " is a cube: " + cubeRoot + "^3");

                for (int i = 1; i <= Math.sqrt(num); i++) { // iterates through numbers up to the square root of the current number for checking sums of squares.
                    for (int j = i; j <= Math.sqrt(num); j++) { // iterates through numbers starting from i for sum of squares calculation.
                        if (i * i + j * j == num) { // checks if the sum of squares of i and j equals the current number
                            System.out.println(num + " is the sum of 2 squares");
                            System.out.println(num + " == " + i + "*" + i + " + " + j + "*" + j);
                            count++;
                        }
                    }
                }
            }
        }

        // prints the total number of cubed integers
        System.out.println("Total number of cubed integers that are the sum of 2 squares: " + count);
        scan.close();
    }
}
