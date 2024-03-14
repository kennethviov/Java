/* This program loops and calculates different miles per gallon as long as initial miles is not less than 0
 * Name: Viovicente, Kenneth Reniel C.
 * Date: 
*/

import java.util.Scanner;

public class Ex2MilesPerGallon {
    public static void main(String[] args) {
        //declarations
        Scanner scan = new Scanner (System.in);
        double iniMiles, finMiles, gallon, mpg;

        System.out.println("Miles per Gallon Program");

        do { //looping the input, process, and output
            System.out.println("\nInitial Miles:"); //input
            iniMiles = scan.nextDouble();

            if (iniMiles < 0) //if condition
                System.out.println("bye"); //prints the message "bye" if the input is negative
            else {  //runs the block if the input is positive
                System.out.println("Final Miles:");
                finMiles = scan.nextDouble();
                System.out.println("Gallons:");
                gallon = scan.nextDouble();

                mpg = (finMiles - iniMiles) / gallon; //calculates the miles per gallon

                System.out.println("Miles per Gallon: " + mpg); //output
            }    
        } while (iniMiles >= 0); //sentinel condition

        scan.close();
    }
}
