/* This program calculates the shipping fee based on the weight of an order
 * Name: Viovicente, Kenneth Reniel C.
 * Date: 
 */

import java.util.Scanner;

public class Ex4ShippingCostCalculator {
    public static void main(String[] args) {
        //declarations
        Scanner scan = new Scanner (System.in);
        final double handling = 3.00; //constant value of handling fee
        final double addtional = 0.25; //constant value of addtional shipping fee
        double weight, cost = 0;

        do {
            System.out.println("Weight of Order (pounds):"); //input
            weight = scan.nextDouble();

            weight = (int)Math.ceil(weight); //round to nearest integer

            if (weight > 10) { //condition
                cost = ((weight - 10) * addtional) + handling;
                System.out.printf("Shipping Cost: $%.2f\n\n", cost); //output
            } else if (weight > 0 && weight <= 10) {
                cost = handling;
                System.out.printf("Shipping Cost: $%.2f\n\n", cost); //output
            }
        } while (weight > 0); //loops while weight is greater that 0

        System.out.println("bye");

        scan.close();
    }
}
