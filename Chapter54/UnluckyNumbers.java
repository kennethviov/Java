// Description: This program determines whether a number is unlucky, which means it contains a sequence of 1 followed by 3.
// Name: Viovicente, Kenneth Reniel C.

import java.util.Scanner;

public class UnluckyNumbers {

    public static boolean isUnlucky(long number) {
        // Function to check if a number is unlucky
        while (number > 0) {
            long digit = number % 10;
            if (digit == 1) {
                number /= 10;
                if (number % 10 == 3) {
                    return true; // Found 1 followed by 3
                }
            }
            number /= 10;
        }
        return false; // No sequence of 1 followed by 3 found
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a non-negative integer (or negative to quit): ");
            long number = scan.nextLong();

            if (number < 0) {
                break;
            }

            System.out.println(number + (isUnlucky(number) ? " is unlucky." : " is safe."));
        }

        System.out.println("Exiting program...");
    }
}
