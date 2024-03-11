/* This program solves for factorial
 * Name: Viovicente, Kenneth Reniel C.
 * Date: 
 */

import java.util.Scanner;

public class Ex7FloatFactorial {
    public static void main (String[] args) {
        //declarations
        Scanner scan = new Scanner( System.in );
        double fact = 1;
        long N;

        //input
        System.out.print( "Enter N: " );
        N = scan.nextLong();

        //condition checking the input
        if ( N >= 0 && N <= 20 ) {
            while ( N > 1 ) { //solving N!
            fact = fact * N;
            N    = N - 1;
            }
            System.out.println( "factorial is " + fact ); //displaying result
        } else { //displaying errors
            System.out.println("N must be between 0 and 20");
            System.out.println("Factorial for N less than 0 is not defined.");
            System.out.println("Factorial for N greater than 20 causes overflow.");
        }

        scan.close();
    }
}
