import java.util.Scanner;

public class AnnualApplianceCost {
    public static void main(String[] args) {
        //local declarations
        Scanner scan = new Scanner(System.in);
        double cost, kilowatt;

        //input
        System.out.println("Enter cost per kilowatt-hour in cents");
        cost = scan.nextDouble();
        System.out.println("Enter kilowatt-hours used per year");
        kilowatt = scan.nextDouble();

        //process
        double annualCost = cost * kilowatt / 100;

        //output
        System.out.printf("Annual cost: %.4f", annualCost);

        scan.close(); //closed the scanner to avoid memory leak
    }
}