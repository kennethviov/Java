import java.util.Scanner;

public class BetterDocumentationPrinter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opencomment = 0, closecomment = 0;

        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            if (line.startsWith("//") || line.startsWith("/") || line.startsWith("*/"))
                System.out.println(line);
            else if (line.contains("/*") || line.contains("*/")) {
                opencomment = line.indexOf("/*");
                closecomment = line.indexOf("*/");
                System.out.println(line.substring(opencomment, closecomment));
            } else
                System.out.println();
        }

        scan.close();
    }
}