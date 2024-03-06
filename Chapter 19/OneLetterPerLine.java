import java.util.Scanner;

public class OneLetterPerLine {
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);
        String word;
        int lineNum, count = 0, determiner = 0;

        System.out.print("Enter a word: ");
        word = scan.nextLine();

        lineNum = word.length();
        
        while (count < lineNum) {
            System.out.println(word.charAt(determiner));
            determiner++;
            count++;
        }

        scan.close();
    }
}