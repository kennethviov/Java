/* This program that finds all integers that are the sum of two squares in two different ways. The code is written in Java and uses a for loop to iterate through all integers from 1 to the user-inputted upper limit.
 * Name: Viovicente, Kenneth Reniel C.
 * Date: March 30, 2024
*/

import java.util.Scanner;

public class Ex6FindAllIntegersThatAreTheSumOfTwoSquaresInTwoDifferentWays {
    public static void main (String[] args) {
        // declarations
        Scanner scan = new Scanner(System.in);
        int count = 0;

        // input
        System.out.print("Enter upper limit --> ");
        int limit = scan.nextInt();
        
        // process
        for (int num = 1; num <= limit; num++) { // outter loop, controls the overall iteration through a range of numbers.
            for (int i = 1; i <= Math.sqrt(num); i++) { // middle loop, iterate through a range of numbers up to the square root of the current num.
                for (int j = i; j <= Math.sqrt(num); j++) { // inner loop, iterate through a range of numbers starting from i up to the square root of the current num.
                    if (i * i + j * j == num) { // conditional statement checks if the sum of the squares of i and j is equal to the current num.
                        System.out.println(num + " is the sum of 2 squares");
                        System.out.println(num + " == " + i + "*" + i + " + " + j + "*" + j);
                        count++;
                    }
                }
            }
        }

        // prints out the total number that can be summed with 2 squares
        System.out.println("Total number of integers that are the sum of 2 squares: " + count);
        scan.close();
    }
}