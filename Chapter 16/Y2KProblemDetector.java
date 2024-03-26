/*  This program determines your age based only the last 2 digits of the year you are born -- age limit is 100
    Name: Viovicente, Kenneth Reniel C.
    Date: Feb 29, 2024
*/

import java.util.Scanner;

public class Y2KProblemDetector {
    public static void main(String[] args){
        //declarations
        Scanner scan = new Scanner(System.in);
        int birthYear, currentYear, age;

        //input
        System.out.print("Year of Birth: ");
        birthYear = scan.nextInt();
        System.out.print("Cuurent year: ");
        currentYear = scan.nextInt();
        
        //process
        if (currentYear > birthYear)
            age = currentYear - birthYear;
        else {
            currentYear += 100;
            age = currentYear - birthYear;
        }

        //output
        System.out.println("Your age: " + age);

        scan.close(); //scanner closed to avoid memory leak
    }
}
