/* This program simulates a simple log in process
 * Name: Viovicente, Kenneth Reniel C.
 * Date:
 */

import java.util.*;

public class Ex6LoginSimulator {
    public static void main(String[] args) {
        // declare variables
        Scanner scan = new Scanner(System.in);
        String user1 = new String("joy");
        String pass1 = new String("sun");
        String user2 = new String("gates");
        String pass2 = new String("monopoly");
        String user3 = new String("jobs");
        String pass3 = new String("apple");
        String user4 = new String("root");
        String pass4 = new String("secret");
        String user = "", pass = "";

        do { 
            System.out.print("Username: "); //input username
            user = scan.nextLine();
            System.out.print("Password: "); //input password
            pass = scan.nextLine();

            //conditions to compare inputs
            if (user.equals(user1) && pass.equals(pass1)) 
                System.out.println("You have logged in with priority 4");
            else if (user.equals(user2) && pass.equals(pass2))
                System.out.println("You have logged in with priority 1");
            else if (user.equals(user3) && pass.equals(pass3))
                System.out.println("You have logged in with priority 3");
            else if (user.equals(user4) && pass.equals(pass4))
                System.out.println("You have logged in with priority 5");
            else
                System.out.println("LogIn failed");
        } while (!user.equals("quit") && !pass.equals("exit"));

        System.out.println("System shutting down...\nBye");

        scan.close();
    }
}