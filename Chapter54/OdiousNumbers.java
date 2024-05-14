// Description: This program determines whether a number is odious or evil. An odious number has an odd number of 1s in its binary representation, while an evil number has an even number of 1s.
// Name: Viovicente, Kenneth Reniel C.

import java.util.Scanner;

public class OdiousNumbers {

    public static boolean CheckNumbers(long number) {
        // Function to check if a number is odious
        int count = 0;
        while (number > 0) {
            count += number % 2;
            number /= 2;
        }
        return count % 2 != 0;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("This program determines whether a number is odious or evil.");
        System.out.println("To exit, enter a negative value.");
        while (true) {
            System.out.print("Enter a number: ");
            long number = scan.nextLong();

            if (number < 0) {
                System.out.println("You entered a negative integer. Exiting program.");
                break;
            }

            System.out.println(number + (CheckNumbers(number) ? " is odious." : " is evil."));
        }
    }
}
