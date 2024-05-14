import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //input
        do {
            System.out.print("Enter password: ");
            String password = scan.nextLine();
    
            //output
            if (password.length() > 7) {
                if (CheckCase(password)) {
                    if (CheckDigits(password))
                        System.out.println("Password is valid.");
                    else
                        System.out.println("Password must contain numbers.");
                } else
                    System.out.println("Password must contain both uppercase and lowercase letters.");
            } else
                System.out.println("Password must be at least 7 characters long.");
        } while (password.length < 7 || !CheckCase(password) || !CheckDigits);

        scan.close();
    }

    static boolean CheckCase (String password) {
        boolean upper = false;
        boolean lower = false;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i)))
                upper = true;
            else if (Character.isLowerCase(password.charAt(i)))
                lower = true;
        }
        if (upper && lower)
            return true;
        else
            return false;
    }

    static boolean CheckDigits (String password) {
        if (password.contains("1") || password.contains("2") || password.contains("3") || password.contains("4") || password.contains("5") || password.contains("6") || password.contains("7") || password.contains("8") || password.contains("9") || password.contains("0"))
            return true;
        else 
            return false;
    }
}
