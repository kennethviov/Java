/*  This program determines the approximate to e based on an input
    Name: Viovicente, Kenneth Reniel C.
    Date: Feb 20, 2024
*/

import java.util.Scanner;
import java.lang.Math;

public class Exercise1 {
    public static void main (String[] args) {
        //declarations
        Scanner scan = new Scanner (System.in);
        int x;
        double val;

        //input
        System.out.print("Enter x: ");
        x = scan.nextInt();

        //process
        val = Math.pow((1.0 + 1.0 / x), x);

        //output
        System.out.printf("Approximate to e: %2.7f\n", val);

        scan.close(); //Scanner closed to avoid memory leak
    }
}
