/*  This program calculates the cents and converts it into dollars.
    Name: Viovicente, Kenneth Reniel C.
    Date: Feb 15, 2024
*/

import java.util.Scanner;

public class CentsToDollars {
    public static void main(String[] args) {
        //local declarations
        Scanner sc = new Scanner(System.in);
        int cent1, dollar, cent2;

        //Input
        System.out.println("Input the cents:");
        cent1 = sc.nextInt();

        //Process
        dollar = cent1 / 100;
        cent2 = cent1 % 100;

        //Output
        System.out.println("That is " + dollar + " dollars " + cent2 + " cents.");

        sc.close(); //closed the scanner to avoid memory leak
    }
}