/*  This program calculates the charge for dumping trash based on the weight
 *  Name: Viovicente, Kenneth Reniel C.
 *  Date: 
*/

import java.util.Scanner;

public class TownDump {
    public static void main(String[] args) {
        //declarations
        Scanner scan = new Scanner(System.in);
        final int baseCharge = 20;
        int trash, charge = 0;

        //input
        System.out.print("Enter the weight of trash in pounds: ");
        trash = scan.nextInt();

        //process
        if (trash <= 200){
            charge = baseCharge;
        }
        if (trash > 200){
            int additional = trash - 200;
            int roundWeight = (int) Math.ceil((double) additional / 100);
            charge = baseCharge + (roundWeight * 8);
        }

        //output
        System.out.println("The charge is $" + charge + " for " + trash + " pounds of trash.");

        scan.close(); //scanner closed to avoid resource leak
    }
}