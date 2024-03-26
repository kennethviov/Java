/*  This program detrmines wether you are safe to travel with your amount of gas or not
    Name: Viovicente, Kenneth Reniel C.
    Date: Feb 29, 2024
*/

import java.util.Scanner;

public class LastChanceGas {
    public static void main(String[] args){
        //declarations
        Scanner scan = new Scanner(System.in);
        int tankCapacity, gasGauge, milesGallon, miles;

        //input
        System.out.println("Tank Capacity: ");
        tankCapacity = scan.nextInt();
        System.out.println("Gauge reading: ");
        gasGauge = scan.nextInt();
        System.out.println("Miles per gallon: ");
        milesGallon = scan.nextInt();

        //process
        miles = (gasGauge * tankCapacity / 100) * milesGallon;

        //output in conditions
        if (miles < 200)
            System.out.println("Get Gas!");
        else
            System.out.println("Safe to Proceed");

        scan.close(); //scanner closed to avoid memory leak
    }
}
