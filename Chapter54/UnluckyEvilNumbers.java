// Description: This program counts the number of "unlucky evil" numbers within a given range. An "unlucky evil" number is one that contains a sequence of 1 followed by 3 and also has an odd number of 1s in its binary representation.
// Name: Viovicente, Kenneth Reniel C.

import java.util.Scanner;

public class UnluckyEvilNumbers {

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

    public static boolean isOdious(long number) {
        // Function to check if a number is odious
        int count = 0;
        while (number > 0) {
            count += number % 2;
            number /= 2;
        }
        return count % 2 != 0; // Check if there are odd number of 1s (odd count)
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter upper limit (positive integer): ");
        int upperLimit = scan.nextInt();

        int unluckyEvilCount = 0;
        for (int number = 1; number <= upperLimit; number++) {
            if (isUnlucky(number) && isOdious(number)) {
                unluckyEvilCount++;
            }
        }

        System.out.println("There are " + unluckyEvilCount + " unlucky evil numbers between 1 and " + upperLimit);
    }
}