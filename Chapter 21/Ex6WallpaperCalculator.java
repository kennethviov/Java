/* This program calculates the needed wallpaper rolls for a room
 * Name: Viovicente, Kenneth Reniel C.
 * Date: 
 */

import java.util.Scanner;

public class Ex6WallpaperCalculator {
    public static void main (String[] args) {
        //declarations
        Scanner scan = new Scanner (System.in);
        int count = 1, openingNum;
        double height, width, length, wallArea, openingHeight, openingWidth, openingArea = 0;
        final double wallpaperArea = 27 * (4.5 * 36); // constant value of the wallpaper roll area
        final double sqrInch = 1550.0031; // constant value to be used for conversion

        //input for room
        System.out.println("Enter room dimensions in meters");
        System.out.print("Enter room height: ");
        height = scan.nextDouble();
        System.out.print("Enter room width: ");
        width = scan.nextDouble();
        System.out.print("Enter room length: ");
        length = scan.nextDouble();

        System.out.print("\nEnter the number of openings: ");
        openingNum = scan.nextInt();

        //input and process for openings
        while (count <= openingNum) {
            System.out.println("Enter dimension of opening #" + count + ": ");
            System.out.print("Enter height: ");
            openingHeight = scan.nextDouble();
            System.out.print("Enter width: ");
            openingWidth = scan.nextDouble();

            openingArea += openingHeight * openingWidth;
            count++;
        }

        wallArea = (((2 * height * length) + (2 * width * length)) - (openingArea)) * sqrInch; //wall area is solved and converted into square inch

        double wallpaperNeeded = wallArea / wallpaperArea; //solving the required wallpaper rols

        //ouput
        System.out.printf("Number of rolls needed: %d", (int)Math.ceil(wallpaperNeeded)); //used Math.ceil to round up the value of wallpaper needed

        scan.close(); //scanner closed to avoid resource leak
    }
}