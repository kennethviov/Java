/*  This program converts the change(cents) into its correct and exact value.
    Name: Viovicente, Kenneth Reniel C.
    Date: Feb 15, 2024
*/

import java.util.Scanner;

public class CorrectChange {
    public static void main(String[] args) {
        //local declarations
        Scanner sc = new Scanner(System.in);
        int change, dollar, quarter, dime, nickel, penny;

        //Input
        System.out.println("Enter your change in cents: ");
        change = sc.nextInt();

        //Process
        dollar = change / 100;
        quarter = change % 100 / 25;
        dime = change % 100 % 25 / 10;
        nickel = change % 100 % 25 % 10 / 5;
        penny = change % 100 % 25 % 10 % 5;

        //Output
        System.out.println("Your change is " 
        + dollar + " dollar/s, " + quarter + " quarter/s, " + dime + " dime/s, " + nickel + " nickel/s, and " + penny + " cent/s.");

        sc.close(); //closed the scanner to avoid memory leak
    }
}