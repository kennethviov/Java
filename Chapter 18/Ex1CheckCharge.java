import java.util.Scanner;

public class Ex1CheckCharge {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int checkingAcc, savingsAcc;
        final double charge = 0.15;

        System.out.println("Enter the balance of your checking account: ");
        checkingAcc = scan.nextInt();
        System.out.println("Enter the balance of your savings account: ");
        savingsAcc = scan.nextInt();

        if (checkingAcc < 1000 || savingsAcc < 1500)
            System.out.println("Service charge in writing the check: $" + charge);
        else
            System.out.println("No service charge.");

        scan.close();
    }
}