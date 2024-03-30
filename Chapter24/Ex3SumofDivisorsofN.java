/* This program takes an integer input from the user and calculates the sum of all the divisors of the input number, except the number itself.
 * Name: Viovicente, Kenneth Reniel C.
 * Date: March 30, 2024
*/

import java.util.*;

public class Ex3SumofDivisorsofN {
    public static void main (String[] args) {
        // decalarations
        Scanner scan = new Scanner (System.in);
        int N, sum;

        // input
        System.out.println("SUM OF DIVISORS"); 
        System.out.println("Enter N: ");
        N = scan.nextInt();

        // process and output within condition
        sum = 0;
        for (int i = 1; i < N; i++) {
            if (N % i == 0) {
                System.out.print(i + " + ");
                sum += i;
            }
        }

        // displaying sum
        System.out.println("0\nSum: " + sum);

        scan.close();
    }
}