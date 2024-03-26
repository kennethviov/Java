/*  This program displays the value in time based on the interest
    Name: Viovicente, Kenneth Reniel C.
    Date: Feb 20, 2024
*/

import java.text.*;
import java.util.Scanner;

public class Exercise2 {
    public static void main (String[] args){
        //local declarations
        Scanner scan = new Scanner(System.in);
        DecimalFormat numform = new DecimalFormat("$#,##0.00");
        double value, interest, deposit, numPerYear, year;

        //input
        System.out.print("Initial deposit: ");
        deposit = scan.nextDouble();
        System.out.print("Interest rate: ");
        interest = scan.nextDouble();
        System.out.print("Times per year: ");
        numPerYear = scan.nextDouble();
        System.out.print("Number of years: ");
        year = scan.nextDouble();

        //process
        value = deposit * Math.pow((1.0 + interest / numPerYear), numPerYear * year);

        //output
        System.out.println("Value: " + numform.format(value));

        scan.close();
    }
}
