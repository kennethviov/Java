/* This program calculates the value of a number raised to a user-promted power
 * Name: Viovicente, Kenneth Reniel
 * Date: 
*/

import java.util.Scanner;

public class Ex3PowerOfANumber {
    public static void main (String[] args) {
        //declarations
        Scanner scan = new Scanner (System.in);
        double count = 1, X, pow = 1;
        int N;

        //input
        System.out.println("Enter X");
        X = scan.nextDouble();
        System.out.println("Enter N");
        N = scan.nextInt();

        //process and output within condition
        if (N >= 0) {
            while (count <= N) {
                pow *= X;
                count++;
            }
    
            System.out.printf("%.2f raised to the power %d is: %.5f", X, N, pow);
        } else {
            System.out.println("N must be a positive integer.");
        }
        

        scan.close();
    }
}