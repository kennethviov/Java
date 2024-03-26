/*  This program calculates the area of a circle from a user-given radius.
    Name: Viovicente, Kenneth Reniel C.
    Date: Feb 15, 2024
*/

import java.util.Scanner;

public class AreaOfCircle {
    public static void main (String[] args){
        //local declarations
        Scanner sc = new Scanner(System.in);       
        int radius;
        double area;

        //Input
        System.out.println("Input the radius: ");
        radius = sc.nextInt();

        //Process
        area = Math.PI * (radius * radius);

        //Output
        System.out.println("The radius is: " + radius + ". The area is: " + area);

        sc.close(); //closed the scanner to avoid memory leak
    }
}