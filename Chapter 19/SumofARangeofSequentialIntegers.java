import java.util.Scanner;

public class SumofARangeofSequentialIntegers {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int low, high, loopSum = 0, sumHigh, sumLowMinus1;

        System.out.println("Enter low: ");
        low = scan.nextInt();
        System.out.println("Enter high: ");
        high = scan.nextInt();

        sumHigh = (high *(high + 1)) / 2;
        sumLowMinus1 = ((low - 1) * ((low - 1) + 1)) / 2;
        int sum = sumHigh - sumLowMinus1;

        while (low <= high) {
            loopSum += low;
            low++;
        }

        System.out.println("Loop Sum: " + loopSum);
        System.out.println("Sum of one to high: " + sumHigh);
        System.out.println("Sum of one to low - 1: " + sumLowMinus1);
        System.out.println("Sum from low to high: " + sum);

        scan.close();
    }
}