/*  This program determines the ticket price based on the time an age
    Name: Viovicente, Kenneth Reniel C.
    Date: Feb 29, 2024
*/

import java.util.Scanner;

public class MatineeMovieTickets {
    public static void main(String[] args){
        //declarations
        Scanner scan = new Scanner(System.in);
        int time, age, ticket;

        //input
        System.out.println("Enter age: ");
        age = scan.nextInt();
        System.out.println("Enter time (24-Hour format) (Ex: 1PM = 1300): ");
        time = scan.nextInt();

        //process
        if (time < 1700){
            if (age < 13)
                ticket = 2;
            else
                ticket = 5;
        } else {
            if (age < 13)
                ticket = 4;
            else
                ticket = 8;
        }

        //output
        System.out.println("Ticket price: $" + ticket);

        scan.close(); //scanner closed to avoid memory leak
    }
}
