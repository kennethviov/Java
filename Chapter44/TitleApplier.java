import java.util.*;

public class TitleApplier{
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);
        String name = "";

        do {
            System.out.println("Enter a name: ");
            name = scan.nextLine();

            if (name.startsWith("Amy") || name.startsWith("Buffy") || name.startsWith("Cathy")) 
                System.out.println("Ms. " + name);
            else if (name.startsWith("Elroy") || name.startsWith("Fred") || name.startsWith("Graham"))
                System.out.println("Mr. " + name);
            else
                System.out.println(name);
        } while (name.length() != 0);
    }
}
