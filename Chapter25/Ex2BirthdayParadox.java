/* This program calculates the probability that a given number of people do not share a birthday and determines the number of guests needed for more than a 50% chance of no shared birthdays using the Birthday Paradox concept.
 * Name: Viovicente, Kenneth Reniel C.
 * Date: March 30, 2024
 */

import java.util.Scanner;

public class Ex2BirthdayParadox {
    public static void main(String[] args) {
        // declarations
        Scanner scan = new Scanner (System.in);
        double probability = 1.0;

        // input
        System.out.println("Birthday Paradox");
        System.out.print("Enter the number of people in the party: ");
        int n =  scan.nextInt();

        for (int i = 1; i < n; i++) { // calculates the probability
            probability *= (365 - i) / 365.0;
        }

        // displaying the probability
        System.out.println("Probability that " + n + " people do not share a birthday: " + probability);

        // Find the number of guests for more than a 50% chance of no shared birthdays
        int guests = 0;
        double cumulativeProbability = 1.0;
        while (cumulativeProbability > 0.5) { // calculates the number of guests for more than a 50% chance of no shared birthdays
            guests++;
            cumulativeProbability *= (365.0 - guests) / 365.0;
        }

        // displaying the number of guests for more than a 50% chance of no shared birthdays
        System.out.println("Number of guests for more than a 50% chance of no shared birthdays: " + guests);

        scan.close();
    }
}