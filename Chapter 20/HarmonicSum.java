import java.util.Scanner;

public class HarmonicSum {
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);
        int N, count = 1;
        double sum = 0;

        System.out.println("Enter N: ");
        N = scan.nextInt();

        while (count <= N) {
            sum += 1.0 / count;
            count++;
        }

        System.out.println("Sum is: " + sum);

        scan.close();
    }
}