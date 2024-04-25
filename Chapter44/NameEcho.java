import java.util.*;

public class NameEcho {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String input = scan.nextLine().trim();
 
    
        int space = input.indexOf(" ");
        String firstName = input.substring(0, space);
        String lastName = input.substring(space).toUpperCase();

        System.out.println(firstName + " " + lastName);
    }
}