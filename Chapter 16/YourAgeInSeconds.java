/*  This program counts your age in seconds and compares it to the average human lifespan in seconds
    Name: Viovicente, Kenneth Reniel C.
    Date: Feb 29, 2024
*/

import java.util.Scanner;

public class YourAgeInSeconds {
    public static void main(String[] args){
        //declarations
        Scanner scan = new Scanner(System.in);
        int year, month, day, ageInSeconds;
        int daysInMonths = 0;
        double percentage;

        //input
        System.out.println("Enter your age: ");
        year = scan.nextInt();
        System.out.println("Enter the number months after your birthday: ");
        month = scan.nextInt();
        System.out.println("Enter the number days after your birthate of that month: ");
        day = scan.nextInt();

        //condition for the total of days in months
        if (month == 1)
            daysInMonths = 31;
        else if (month == 2)
            daysInMonths = 31 + 28;
        else if (month == 3)
            daysInMonths = 31 + 28 + 31;
        else if (month == 4)
            daysInMonths = 31 + 28 + 31 + 30;
        else if (month == 5)
            daysInMonths = 31 + 28 + 31 + 30 + 31;
        else if (month == 6)
            daysInMonths = 31 + 28 + 31 + 30 + 31 + 30;
        else if (month == 7)
            daysInMonths = 31 + 28 + 31 + 30 + 31 + 30 + 31;
        else if (month == 8)
            daysInMonths = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
        else if (month == 9)
            daysInMonths = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
        else if (month == 10)
            daysInMonths = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
        else if (month == 11)
            daysInMonths = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;

        //process
        ageInSeconds = ((((((year * 365) + daysInMonths) + day) * 24) * 60) * 60);
        percentage = ageInSeconds / 2500000000.0 * 100;

        //output
        System.out.printf("Your age in seconds is: %,d\n", ageInSeconds);
        System.out.println("The avergae human lifespan is 2.5 billion seconds");
        System.out.printf("You have lived %2.2f%% of the average human lifespan.\n", percentage);

        scan.close(); //scanner closed to avoid memory leak
    }
}
