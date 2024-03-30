/* This program calculates and displays the count and percentage of consonants, vowels, punctuations, spaces, and total characters in multiple lines of user-input strings using a switch statement and character classification
 * Name: Viovicente, Kenneth Reniel C.
 * Date: March 30, 2024
*/

import java.util.*;

public class Ex2CharacterCounterWithFileInput {
    public static void main (String[] args) {
        // declarations
        Scanner scan = new Scanner (System.in);
        int consonants = 0, vowels = 0, punctuations = 0, spaces = 0, total = 0;
        String str = "";

        // inputs
        System.out.println("CHARACTER COUNTER");
        System.out.print("Enter the number of lines: ");
        int lines = scan.nextInt();
        System.out.print("Enter the strings: ");

        for (int i = 0; i <= lines; i++) { // outter loop that lets the user enter the lines up to the limit
            str = scan.nextLine();

            total += str.length(); // total number of characters
            for (int j = 0; j < str.length(); j++) { // loop that runs as long as the number of characters
                char ch = str.charAt(j); // getting the character at index j

                switch  (Character.toLowerCase(ch)) { // condition that adds total number of characters each classification
                    case 'a': case 'e': case 'i': case 'o': case 'u':
                        vowels++;
                    break;
                    case '.': case ',': case '?': case '!': case '\'':
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

        }

        // outputs the total number of characters each classification along with its percentage out of the total number of characters
        System.out.println("Characters\tCount\tPercentage");
        System.out.printf("Consonants  : \t%2d\t%3.2f%%\n", consonants, (consonants * 100.0) / total);
        System.out.printf("Vowels      : \t%2d\t%3.2f%%\n", vowels, (vowels * 100.0) / total);
        System.out.printf("Spaces      : \t%2d\t%3.2f%%\n", spaces, (spaces * 100.0) / total);
        System.out.printf("Punctuations: \t%2d\t%3.2f%%\n", punctuations, (punctuations * 100.0) / total);
        System.out.printf("Total       : \t%2d\t%3.2f%%\n", total, (total * 100.0) / total);
        
        scan.close();
    }
}
