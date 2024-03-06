import java.util.Scanner;

public class SumOfSequentialIntegers {
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);
        int count = 1, n, loopSum = 0, formSum;

        System.out.println("Enter N: ");
        n = scan.nextInt();

        while (count <= n) {
            loopSum += count;
            count++;
        }

        formSum = (n * (n + 1)) / 2;

        System.out.println("Loop Sum: " + loopSum);
        System.out.println("Formula Sum: " + formSum);

        scan.close();
    }
}
