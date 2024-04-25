import java.util.*;

import java.util.Scanner;

public class MicrowaveMenu {
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.print("Enter cook time -> ");
        String time = scan.nextLine();

        if (time.length() == 0)
            System.out.println("No time were entered");
        else if (time.length() == 1)
            System.out.println("0:0" + time);
        else if (time.length() == 2)
            System.out.println("0:" + time);
        else if (time.length() == 3)
            System.out.println(time.substring(0,1) + ":" + time.substring(1));
        else if (time.length() == 4)
            System.out.println(time.substring(0, 2) + ":" + time.substring(2));
        else
            System.out.println("Out of bounds");
    }
}