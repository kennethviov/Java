/*  This program determines wether it is okay to buy bolts, nuts, and washers
    Name: Viovicente, Kenneth Reniel C.
    Date: Feb 29, 2024
*/

import java.util.Scanner;

public class OrderChecker {
    public static void main(String[] args){
        //decalrations
        final int boltPrice = 5, nutPrice = 3, washerPrice = 1;
        Scanner scan = new Scanner(System.in);
        int bolt, nut, washer, total;

        //input
        System.out.print("Number of bolts: ");
        bolt = scan.nextInt();
        System.out.print("Number of nuts: ");
        nut = scan.nextInt();
        System.out.print("Number of washers: ");
        washer = scan.nextInt();

        //process
        total = (bolt * boltPrice) + (nut * nutPrice) + (washer * washerPrice);

        //output in conditions
        if ( nut < bolt && washer != (bolt * 2)) {
            System.out.println("Check the Order: too few nuts");
            System.out.println("Check the Order: too few washers");
        }
        else if ( nut < bolt ) 
            System.out.println("Check the Order: too few nuts");
        else if ( washer != (bolt * 2))
            System.out.println("Check the Order: too few washers");
        else
            System.out.println("Order is OK.");

        System.out.println("Total cost: " + total);
        
        scan.close(); //scanner closed to avoid memory leak
    }
}
