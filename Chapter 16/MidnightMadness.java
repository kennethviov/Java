/*  Name: Viovicente, Kenneth Reniel C.
    Date: Feb 29, 2024
*/


import java.util.Scanner;

public class MidnightMadness {
    public static void main(String[] args) {
        //local decalrations
        Scanner scan = new Scanner(System.in);
        int time, age, ticket = 0;

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
        } else if (time > 1700 && time < 2199) {
            if (age < 13)
                ticket = 4;
            else
                ticket = 8;
        } else if (time > 2199) {
            if (age < 13)
                System.out.println("No children allowed");
            else
                ticket = 4;
        }

        //output
        System.out.println("Ticket price: $" + ticket);
        
        scan.close(); //scanner closed to avoid memory leak
    }
}
