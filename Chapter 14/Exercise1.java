/*  This program prints the angle in interval of 15 and their sine counterpart
    Name: Viovicente, Kenneth Reniel C.
    Date: Feb 20, 2024
*/

import java.text.*;

public class Exercise1 {
    public static void main(String[] args) {

        //local declarations
        DecimalFormat numform = new DecimalFormat(" 0.0#####;-0.0#####");
        double angle;

        //process and output
        //angle is initialized, converted to radians, and sine is calculated inside the method println()
        //sine is formatted using the DecimalFormat class
        System.out.println("\nangle\t\t  sine");
        System.out.println("-----\t\t--------");
        System.out.println(numform.format(angle = -90) + "\t\t" + numform.format(Math.sin(Math.toRadians(angle))));
        System.out.println(numform.format(angle = -75) + "\t\t" + numform.format(Math.sin(Math.toRadians(angle))));
        System.out.println(numform.format(angle = -60) + "\t\t" + numform.format(Math.sin(Math.toRadians(angle))));
        System.out.println(numform.format(angle = -45) + "\t\t" + numform.format(Math.sin(Math.toRadians(angle))));
        System.out.println(numform.format(angle = -30) + "\t\t" + numform.format(Math.sin(Math.toRadians(angle))));
        System.out.println(numform.format(angle = -15) + "\t\t" + numform.format(Math.sin(Math.toRadians(angle))));
        System.out.println(numform.format(angle = 0) + "\t\t" + numform.format(Math.sin(Math.toRadians(angle))));
        System.out.println(numform.format(angle = 15) + "\t\t" + numform.format(Math.sin(Math.toRadians(angle))));
        System.out.println(numform.format(angle = 30) + "\t\t" + numform.format(Math.sin(Math.toRadians(angle))));
        System.out.println(numform.format(angle = 45) + "\t\t" + numform.format(Math.sin(Math.toRadians(angle))));
        System.out.println(numform.format(angle = 60) + "\t\t" + numform.format(Math.sin(Math.toRadians(angle))));
        System.out.println(numform.format(angle = 75) + "\t\t" + numform.format(Math.sin(Math.toRadians(angle))));
        System.out.println(numform.format(angle = 90) + "\t\t" + numform.format(Math.sin(Math.toRadians(angle))));
    }
}