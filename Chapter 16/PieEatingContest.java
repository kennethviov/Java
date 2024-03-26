/*  This program determines wether a contestant is allowed to enter the pie eating contest or not based on their weight
    Name: Viovicente, Kenneth Reniel C.
    Date: Feb 29, 2024
*/

import java.util.Scanner;

public class PieEatingContest {
    public static void main(String[] args){
        //decalrations
        int weight;
        Scanner scan = new Scanner(System.in);

        //input
        System.out.println("Enter the contestant's weight in pounds: ");
        weight = scan.nextInt();

        //output in conditions
        if (weight > 220 && weight < 280)
            System.out.println("Contestant is allowed to join the pie eating contest.");
        else
            System.out.println("Contestant is not allowed to join the pie eating contest.");

        scan.close(); //scanner closed to avoid memory leak
    }
}
