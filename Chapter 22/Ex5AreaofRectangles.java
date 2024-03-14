/* This program calculates the area of a rectangle based on the coordinates prompted by a user
 * Name: Viovicente, Kenneth Reniel C.
 * Date:
 */

import java.util.Scanner;

public class Ex5AreaofRectangles {
    public static void main(String[] args) {
        //declarations
        Scanner scan = new Scanner(System.in);
        int x1, y1, x2, y2, height, width, area = 0;

        System.out.println("Computer Aided Design Program");

        do {
            //inputs
            System.out.print("Firts corner X coordinate: ");
            x1 = scan.nextInt();
            System.out.print("Firts corner Y coordinate: ");
            y1 = scan.nextInt();
            System.out.print("Second corner X coordinate: ");
            x2 = scan.nextInt();
            System.out.print("Second corner Y coordinate: ");
            y2 = scan.nextInt();

            //process
            width = x2 - x1;
            height = y2 - y1;
            area  = width * height;

            //output
            System.out.println("Width: " + width + "\tHeight: " + height + "\tArea: " + area + "\n");
        } while (area != 0);

        System.out.println("finished");

        scan.close();
    }
}
