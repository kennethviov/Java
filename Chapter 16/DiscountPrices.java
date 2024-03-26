/*  This program displays the discounted price of a value
    Name: Viovicente, Kenneth Reniel C.
    Date: Feb 29, 2024
*/

import java.util.Scanner;

public class DiscountPrices {
    public static void main(String[] args){
        //declarations
        Scanner scan = new Scanner(System.in);
        final double discount = 0.1;
        double purchase, discountedPrice;

        //input
        System.out.println("Enter amount of purchases: ");
        purchase = scan.nextDouble();

        //process
        if ( purchase > 10 )
            discountedPrice = purchase - (purchase * discount);
        else 
            discountedPrice = purchase;

        //output
        System.out.println("Discounted Price: " + discountedPrice);
        
        scan.close(); //scanner closed to avoid memory leak
    }
}
