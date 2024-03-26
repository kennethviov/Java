/*  This progra prints the sine, cosine, and their square based on a prompted angle
    Name: Viovicente, Kenneth Reniel C.
    Date: Feb 20, 2024
*/

import java.util.Scanner;
import java.lang.Math;

public class Exercise2 {
    public static void main(String[] args){
        //declarations
        Scanner scan = new Scanner(System.in);
        double angle, sine, cos;
        final double sum = 1;

        //input
        System.out.print("Input an angle: ");
        angle = scan.nextDouble();

        //process
        sine = Math.sin(Math.toRadians(angle));
        cos = Math.cos(Math.toRadians(angle));

        //output
        System.out.printf("sin(%2.2f)\tis: %2.2f\n", angle, sine);
        System.out.printf("cos(%2.2f)\tis: %2.2f\n", angle, cos);
        System.out.printf("sin(%2.2f)^2\tis: %2.2f\n", angle, (sine * sine));
        System.out.printf("cos(%2.2f)^2\tis: %2.2f\n", angle, (cos * cos));
        System.out.printf("sum\t\tis: %2.2f\n", sum);

        scan.close(); //Scanner closed to avoid memory leak
    }
}
