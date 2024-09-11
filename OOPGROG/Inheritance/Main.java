import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice = 0;

        do {
            catalog();

            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    
                    break;
                case 2:

                    break;
                case 3:
                
                    break;

                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid imput. Try again.");
                    break;
            }
        } while (choice != 4);
    }

    static void catalog() {
        System.out.println("OOP-I's Vehicle Rentals\n");
        
        System.out.println("[1] Catalog");
        System.out.println("[2] Rent");
        System.out.println("[3] Return");
        System.out.println("[4] Exit");
    }
}