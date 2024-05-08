import java.util.Scanner;

public class MicrowaveMenu {
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.print("Enter cook time -> ");
        String time = scan.nextLine();

        if (time.length() == 0)
            System.out.println("No time were entered");
        else if (time.length() == 1)
            System.out.println("0:0" + time);
        else if (time.length() == 2)
            System.out.println("0:" + time);
        else if (time.length() >= 3)
            System.out.println(time.substring(0,time.length()-2) + ":" + time.substring(time.length()-2));

        scan.close();
    }
}
