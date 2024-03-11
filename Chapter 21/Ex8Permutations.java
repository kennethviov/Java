/* This program solves for permutation
 * Name: Viovicente, Kenneth Reniel C.
 * Date: 
 */

import java.util.Scanner;

public class Ex8Permutations {
    public static void main (String[] args) {
        //declarations
        Scanner scan = new Scanner (System.in);
        long N, R, nFact = 1, nrFact = 1;

        System.out.print("Enter N: ");
        N = scan.nextLong();
        while (N < 0) {
            System.out.println("N must be zero or greater.");
            System.out.print("Enter N: ");
            N = scan.nextLong();
        }

        long n = N; // declaring another variable to hold the same value as N

        System.out.print("Enter R: ");
        R = scan.nextLong();
        while (R < 0 || R > N) {
            System.out.println("R must be zero or greater. It must also be less than or equal to N.");
            System.out.print("Enter R: ");
            R = scan.nextLong();
        }
        
        //solving for N!
        while ( N > 1 ) {
            nFact = nFact * N;
            N    = N - 1;
        }
        
        long nr = n - R; //solving N-R
        //solving (N-R)!
        while (nr > 1) {
            nrFact = nrFact * nr;
            nr    = nr - 1;
        }

        //solving N!/(N-R)!
        long permutation = nFact / nrFact;

        //displaying the result
        System.out.println("Permutation: " + permutation);

        scan.close();
    }
}
