/*  This program determines how long you should heat items in the oven
    Name: Viovicente, Kenneth Reniel C.
    Date:
*/

import java.util.Scanner;

public class MicrowaveOvenHeatingTime {
    public static void main(String[] args){
        //declarations
        Scanner scan = new Scanner(System.in);
        int item, time, min = 0, sec = 0;

        //input
        System.out.print("How many items to heat? ");
        item = scan.nextInt();
        System.out.print("Time to heat one item: ");
        time = scan.nextInt();

        //process and outputs in single branch if-statements
        if (item == 1){
            if (time >= 100){
                min = time / 100;
                sec = time % 100;
            } else {
                sec = time;
            }
            System.out.println("Heat for " + min + " minutes " + sec + " seconds");
        }
        if (item == 2){
            time = (time / 2) + time;
            if (time >= 100){
                min = time / 100;
                sec = time % 100;
            } else {
                sec = time;
            }
            System.out.println("Heat for " + min + " minutes " + sec + " seconds");
        }
        if (item == 3){
            time *= 2;
            if (time >= 100){
                min = time / 100;
                sec = time % 100;
            } else {
                sec = time;
            }
            System.out.println("Heat for " + min + " minutes " + sec + " seconds");
        }
        if (item > 3){
            System.out.println("More that 3 items is not recommendable.");
        }

        scan.close(); //scanner closed to avoid resource leak
    }
}