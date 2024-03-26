/*  This program determines the wind chill based on the wind speed and air temperature
    Name: Viovicente, Kenneth Reniel C.
    Date: Feb 29, 2024
*/

import java.util.Scanner;

public class WindChillIndex {
    public static void main(String[] args){
        //decalrations
        Scanner scan = new Scanner (System.in);
        int windSpeed, temp;
        double windChill;

        //input
        System.out.print("Enter Wind Speed: ");
        windSpeed = scan.nextInt();
        System.out.print("Enter Temperature: ");
        temp = scan.nextInt();

        //process
        if (windSpeed < 3 || temp > 50) 
            windChill = temp;
        else
            windChill = 35.74 + (0.6215 * temp) - (35.75 * Math.pow(windSpeed, 0.16)) + (0.4275 * temp * Math.pow(windSpeed, 0.16));
        
        //output
        System.out.println("Wind Chill: " + windChill);

        scan.close(); //scanner closed to avoid memory leak
    }
}
