// Description: This program finds perfect numbers less than a given upper limit.
// Name: Viovicente, Kenneth Reniel C.

import java.util.Scanner;

public class PerfectNumbers {
    public static boolean isPerfect(int num) {
        // Function to check if a number is perfect
        if (num <= 1) {
            return false;
        }

        int sum = 1;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                if (i * i != num) {
                    sum += num / i;
                }
            }
        }
        return sum == num;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an upper limit: ");
        int upperLimit = scan.nextInt();

        System.out.println("Perfect numbers less than " + upperLimit + ":");
        for (int i = 2; i < upperLimit; i++) {
            if (isPerfect(i)) {
                System.out.println(i);
            }
        }
    }
}