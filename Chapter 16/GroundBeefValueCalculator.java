/*  This program determines the best value between two types of beef
    Name: Viovicente, Kenneth Reniel C.
    Date: Feb 29, 2024
*/

import java.util.Scanner;
import java.text.*;

public class GroundBeefValueCalculator {
    public static void main(String[] args){
        //declarations
        double pricePAckA, pricePackB, leanPercentA, leanPercentB, costPackA, costPackB;
        Scanner scan = new Scanner(System.in);
        DecimalFormat numform = new DecimalFormat(" #0.0#####;-#0.0#####");

        //input
        System.out.println("Price per pound package A: ");
        pricePAckA = scan.nextDouble();
        System.out.println("Percent lean package A:");
        leanPercentA = scan.nextDouble();
        System.out.println("Price per pound package B:");
        pricePackB = scan.nextDouble();
        System.out.println("Percent lean package B:");
        leanPercentB = scan.nextDouble();

        //process
        costPackA = pricePAckA / (leanPercentA / 100);
        costPackB = pricePackB / (leanPercentB / 100);

        //output on the prices
        System.out.println("Package A cost per pound of lean:" + numform.format(costPackA));
        System.out.println("Package B cost per pound of lean:" + numform.format(costPackB));

        //output to display the best value
        if (costPackA < costPackB)
            System.out.println("Package A is the best value");
        else
            System.out.println("Package B is the best value");

        scan.close(); //scanner closed to avoid memory leak
    }
}
