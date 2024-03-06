import java.util.Scanner;

public class AddingUpIntegers {
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);
        int count = 1, i, input, sum = 0;

        System.out.println("How many integers will be added?");
        i = scan.nextInt();

        while (count <= i) {
            System.out.println("Enter an integer: ");
            input = scan.nextInt();
            sum += input;
            count++;
        }

        System.out.println("\nThe sum is " + sum);

        scan.close();
    }
}
