import java.util.Scanner;

public class RunOfIntegers {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int count, end;

        System.out.println("Enter Start: ");
        count = scan.nextInt();
        System.out.println("Enter End: ");
        end = scan.nextInt();

        System.out.println("");

        while (count <= end){
            System.out.println(count);
            count++;
        }

        scan.close();
    }
}
