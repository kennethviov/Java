/* This program counts the number of consonants, vowels, punctuations, spaces, and total characters in a user-input string using a switch statement and character classification
 * Name: Viovicente, Kenneth Reniel C.
 * Date: March 30, 2024
*/

import java.util.Scanner;

public class Ex1CharacterCounter {
    public static void main (String[] args) {
        // declarations
        Scanner scan = new Scanner (System.in);
        int consonants = 0, vowels = 0, punctuations = 0, spaces = 0; 

        // input
        System.out.println("CHARACTER COUNTER");
        System.out.print("Enter a string: ");
        String str = scan.nextLine();

        // process
        for (int i = 0; i < str.length(); i++) { // loop that runs as long as the number of characters
            char ch = str.charAt(i); // getting the character at index i

            switch  (Character.toLowerCase(ch)) { // condition that adds total number of characters each classification
                case 'a': case 'e': case 'i': case 'o': case 'u':
                    vowels++;
                break;
                case '.': case ',': case '?': case '!':
                    punctuations++;
                break;
                case ' ':
                    spaces++;
                break;
                default:
                    if(Character.isLetter(ch))
                    consonants++;
                break;
            }
        }

        // output
        System.out.println("Consonants  : " + consonants);
        System.out.println("Vowels      : " + vowels);
        System.out.println("Punctuations: " + punctuations);
        System.out.println("Spaces      : " + spaces);
        System.out.println("Characters  : " + str.length());
        scan.close();
    }
}