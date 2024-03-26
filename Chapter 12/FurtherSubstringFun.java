/*  This program creates a substring based on the user input.
    Name: Viovicente, Kenneth Reniel C.
    Date: Feb 15, 2024
*/

import java.util.Scanner;

public class FurtherSubstringFun {
    public static void main(String[] args) {
        //local declarations
        Scanner sc = new Scanner(System.in);
        String input;
        int beginIndex, endIndex;

        //Input
        System.out.println("Enter a string: ");
        input = sc.nextLine();

        int len = input.length();
        System.out.println("String length: " + len); 
        //printed the string length so that users have a reference on what number should be input in the ending index

        System.out.println("Enter beginning index: ");
        beginIndex = sc.nextInt();
        System.out.println("Enter ending index: ");
        endIndex = sc.nextInt();

        //Process
        String sub = input.substring(beginIndex, endIndex -1);
        
        //Output
        System.out.println("\nOriginal string: \n" + input + "\n\nSubstring:\n" + sub);

        sc.close(); //closed the scanner to avoid memory leak
    }    
}