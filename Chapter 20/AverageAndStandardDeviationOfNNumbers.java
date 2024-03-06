import java.util.Scanner;

public class AverageAndStandardDeviationOfNNumbers {
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);
        int count = 1, N;
        double XiSum = 0, XixiSum = 0;
        double input, square, avg, avgSquare, SD;

        System.out.println("Enter the number of value to follow: ");
        N = scan.nextInt();

        while (count <= N) {
            System.out.print("Enter number: ");
            input = scan.nextDouble();

            XiSum += input;
            square = input * input;
            XixiSum += square;

            count++;
        }

        avg = XiSum / N;
        avgSquare = XixiSum / N;

        SD = Math.sqrt(avgSquare - (avg * avg));

        System.out.println("Average: " + avg);
        System.out.println("Standard Deviation: " + SD);

        scan.close();
    }
}