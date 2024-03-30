/* This code prompts the user for an input file name, ensuring it meets specific requirements (ends with ".dat", does not contain spaces, and is not empty), and continues to prompt until a valid file name is entered.
 * Name: Viovicente, Kenneth Reniel C.
 * Date: March 30, 2024
*/

import java.util.Scanner;

public class Ex1InputFilePrompt {
    public static void main(String[] args) {
        // declarations
        Scanner scanner = new Scanner(System.in);
        String fileName;

        // process
        do {
            System.out.print("Input file: ");
            fileName = scanner.nextLine();

            if (!fileName.endsWith(".dat")) { // condition that prints out messages about an error
                System.out.println(">>> File name must end with .dat <<<");
            } else if (fileName.contains(" ")) {
                System.out.println(">>> File name must not contain spaces <<<");
            } else if (fileName.isEmpty()) {
                System.out.println(">>> File name missing <<<");
            }

        } while (!fileName.endsWith(".dat") || fileName.contains(" ") || fileName.isEmpty()); // loops until user inputs the correct file name

        // prints if the condition is met or the program exits the loop
        System.out.println("OK");
        scanner.close();
    }
}