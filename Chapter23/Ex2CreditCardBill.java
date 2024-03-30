/*  This program calculates the total payment paid by the creditor in a span of time depending on their monthly payment
 *  Name: Viovicente, Kenneth Reniel C.
 *  Date: March 28, 2024
*/

import java.util.Scanner;
import java.text.*;

public class Ex2CreditCardBill {
    public static void main (String[] args) {
        // declarations
        Scanner scan = new Scanner (System.in);
        DecimalFormat numform = new DecimalFormat(" 0.00;-0.00"); // declaring a text format
        double balance = 1000.0;
        final double rate = 0.015;
        double monthlyPayment, interest, totalPayment = 0;

        // prompting the user (input)
        System.out.println("Enter monthly payment: ");
        monthlyPayment = scan.nextDouble();

        int month = 1;
        while (balance > 0){ // looping until balance is 0
            // calculating the balance and total payment
            interest = balance * rate;
            balance += interest;
            balance -= monthlyPayment;
            totalPayment += monthlyPayment;

            // output
            System.out.println("Month: " + month + "\tBalance: " + numform.format(balance) + "\tTotal Payment: " + numform.format(totalPayment));
            month++;
        }
        scan.close();
    }
}