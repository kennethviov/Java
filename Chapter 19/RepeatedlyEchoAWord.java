import java.util.Scanner;

public class RepeatedlyEchoAWord {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        String input;
        int count = 1, times;

        System.out.println("Enter a word: ");
        input = scan.nextLine();

        times = input.length();

        System.out.println("");

        while (count <= times) {
            System.out.println(input);
            count++;
        }

        scan.close();
    }
}