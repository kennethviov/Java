import java.util.Scanner;

public class Exercise3 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        HelloObject human = new HelloObject();

        System.out.println("Enter Greetings");
        String greetings = scan.nextLine();
        human.greet(greetings);
    }
}