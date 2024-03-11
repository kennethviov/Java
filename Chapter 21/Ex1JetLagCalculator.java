/* This program calculates the duration of jetlag of a passenger
 * Name: Viovicente, Kenneth Reniel
 * Date: 
*/

import java.util.Scanner;

public class Ex1JetLagCalculator {
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);
        int hours, zones, depart, arrive;
        double daysOfRecovery;

        System.out.println("Jet Lag Calculator");
        System.out.println("Enter the number of hours traveled (0-24): ");
        hours = scan.nextInt();
        System.out.println("Enter the number of zones crossed: ");
        zones = scan.nextInt();
        System.out.println("Enter the departure time based on the table below:\n");
        System.out.println("0, for departures between 8AM and noon\r\n" + //
                        "1, for departures between noon and 6PM\r\n" + //
                        "3, for departures between 6PM and 10PM\r\n" + //
                        "4, for departures between 10PM and 1AM\r\n" + //
                        "5, for departures between 1AM and 8AM\n");
        depart = scan.nextInt();
        System.out.println("Enter the arrival time based on the table below:\n");
        System.out.println("4, for arrivals between 8AM and noon\r\n" + //
                        "2, for arrivals between noon and 6PM\r\n" + //
                        "0, for arrivals between 6PM and 10PM\r\n" + //
                        "1, for arrivals between 10PM and 1AM\r\n" + //
                        "3, for arrivals between 1AM and 8AM\n");
        arrive = scan.nextInt();

        daysOfRecovery = (hours / 2.0 + (zones - 3.0) + depart + arrive) / 10;

        System.out.println("Days of recovery: " + daysOfRecovery + " days");

        scan.close();
    }
}
