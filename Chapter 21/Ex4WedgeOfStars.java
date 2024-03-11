/* This program makes a wedge of stars depending on the input of user
 * Name: Viovicente, Kenneth Reniel
 * Date: 
*/

import java.util.Scanner;

public class Ex4WedgeOfStars {
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);
        int starRows;

        System.out.println("Initial number of stars: ");
        starRows = scan.nextInt();

        while (starRows >= 1) {
            int stars = 1;
            while (stars <= starRows) {
                System.out.print("*");
                stars++;
            }
            System.out.println();
            starRows--;
        }

        scan.close();
    }
}
