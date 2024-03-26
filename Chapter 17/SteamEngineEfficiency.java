/*  This program shows the efficiency of a steam engine based on the air and steam temperature
    Name: Viovicente, Kenneth Reniel C.
    Date: 
*/

import java.util.Scanner;

public class SteamEngineEfficiency {
    public static void main(String[] args){
        //declarations
        Scanner scan = new Scanner(System.in);
        int Tair, Tsteam;
        double efficiency = 0;

        //input
        System.out.println("Enter air temperature in kelvin: ");
        Tair = scan.nextInt();
        System.out.println("Enter steam temperature in kelvin: ");
        Tsteam = scan.nextInt();

        //process and output in condition
        if (Tsteam < 373)
            efficiency = 0;
        if (Tsteam >= 373)
            efficiency = 1.0 - (double)Tair / Tsteam;

        System.out.println("Efficiency: " + efficiency);

        scan.close(); //scanner closed to avoid resource leak
    }
}