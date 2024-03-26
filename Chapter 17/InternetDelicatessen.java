/*  This program calculates the total amount of an item and delivery cost
    Name: Viovicente, Kenneth Reniel C.
    Date: 
*/

import java.util.Scanner;

public class InternetDelicatessen {
    public static void main (String[] args) {
        //declarations
        Scanner scan = new Scanner(System.in);
        String item = "";
        double price, deliver, total = 0, totalDel = 0;
        final int delivery = 3;

        //input
        System.out.print("Enter the item: ");
        item = scan.nextLine();
        System.out.print("Enter the price: ");
        price = scan.nextDouble();
        System.out.print("Overnight delivery? (0 = no, 1 = yes): ");
        deliver = scan.nextDouble();

        //process
        if (deliver == 1){
            if (price < 10)
                totalDel = delivery + 2;
            if (price >= 10)
                totalDel = delivery;
        }

        total = price + totalDel;

        //output
        System.out.println("Invoice:");
        System.out.printf("  %s\t%.2f\n", item, price);
        System.out.printf("  delivery\t%.2f\n", totalDel);
        System.out.printf("  total:\t%.2f\n", total);

        scan.close(); //scanner closed to avoid memory leak
    }
}