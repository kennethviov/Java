import java.util.Scanner;

public class WordTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a word --> ");
        String word = scan.nextLine();

        for (int i = 0; i < word.length() / 2 + 1; i++) {
            String spaces = new String(new char[i]).replace('\0', ' ');
            String modifiedWord = spaces + word.substring(i, word.length() - i);
            System.out.println(modifiedWord);
        }

        scan.close();
    }
}
