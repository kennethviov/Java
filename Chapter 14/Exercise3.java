/*  This program determines the time it takes to double the value based on the interest
    Name: Viovicente, Kenneth Reniel C.
    Date: Feb 20, 2024
*/

import java.text.*;
import java.util.Scanner;

public class Exercise3 {
    public static void main (String[] args){
        //local declarations
        Scanner scan = new Scanner(System.in);
        DecimalFormat numform1 = new DecimalFormat("#0.0"); //digit format for the approximate time
        DecimalFormat numform2 = new DecimalFormat("#0"); //digit format for the interest rate
        double interest, approxTime;

        //input
        System.out.print("Enter interest: ");
        interest = scan.nextDouble();

        //process
        approxTime = 72.0 / interest / 100;

        //output
        System.out.println("With " + numform2.format(interest * 100) + "% interest, it takes about " + numform1.format(approxTime) + " years."); 
        //multiplied the interest to print out the percentage counterpart and used different digit formats for the interest and time

        scan.close();
    }
}