/*  This program calculates the number of years it took until your investment reaches 1 million
 *  Name: Viovicente, Kenneth Reniel C.
 *  Date: March 28, 2024
 */

import java.util.Scanner;

public class Ex1ModifiedMillionDollars
{
    public static void main( String[] args )  
    {
        // local declarations
        Scanner scan = new Scanner( System.in );
        double investment = 0;
        double rate, annualContribution, interest;
        int    year =  1;     

        // user inputs
        System.out.print("Enter the interest rate in percent: "); 
        rate = scan.nextDouble() / 100.0;
        System.out.print("Enter the initial investment: ");
        investment = scan.nextDouble();
        System.out.print("Enter annual contribution: ");
        annualContribution = scan.nextDouble();

        
        while (investment < 1000000.0)
        {
            interest = investment * rate; // calculate interest
            investment += annualContribution; // adding annual contribution to investment
            investment += interest; // adding interest to investment
            // printing the interest of the investment per year
            System.out.println("After " + year + " years at " + rate * 100 + " percent interest you will have " + investment + " investment" );
            year++;
        }

        System.out.println("It took " + (year - 1) + " years to reach or exceed one million dollars.");

        scan.close();
    }
}