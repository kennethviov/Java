/*  This program calculates the cuurents(I) from the user given voltage(V) and resistance(R).
    Name: Viovicente, Kenneth Reniel C.
    Date: Feb 15, 2024
*/

import java.util.Scanner;

public class OhmsLaw {
    public static void main(String[] args) {
        //local declarations
        Scanner sc = new Scanner(System.in);
        int V, R;
        double I;

        //Input
        System.out.println("Enter the voltage: ");
        V = sc.nextInt();
        System.out.println("Enter the resistance: ");
        R = sc.nextInt();

        //Proces
        I = (V + 0.0) / R;

        //Output
        System.out.println("The current is: " + I);

        sc.close(); //closed the scanner to avoid memory leak
    }
}