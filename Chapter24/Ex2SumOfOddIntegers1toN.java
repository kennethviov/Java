/* This program that calculates the sum of odd integers between 1 and a user-inputted number, N, and displays the square of N
 * Name: Viovicente, Kenneth Reniel C.
 * Date: March 30, 2024
*/

import java.util.Scanner;

public class Ex2SumOfOddIntegers1toN {
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("SUM OF ODD NUMBERS"); // displaying title
        System.out.print("Enter N: "); // getting the number from user
        int N = scan.nextInt();

        // process
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            if (i % 2!= 0) {
                sum += i;
            }
        }

        //output
        System.out.println("\nSum: " + sum);
        System.out.println("N^2: " + Math.pow(N, 2));

        scan.close();
    }
}