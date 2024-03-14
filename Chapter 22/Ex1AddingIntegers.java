/* This program asks the user for integers and sum it up indefinitly as long 
 * as the input is not 0
 * Name: Viovicente, Kenneth Reniel C.
 * Date:
 */

import java.util.Scanner;

public class Ex1AddingIntegers {
    public static void main (String[] args) {
        //declarations
        Scanner scan = new Scanner (System.in);
        int num, sum = 0;

        //first question to ask the user
        System.out.print("Enter first integer (enter 0 to quit): ");
        num = scan.nextInt();

        //condition
        if (num == 0) // num varibale tested
            System.out.println("No integers were entered.\nbye");
        else {
            do { //loop to use to add every numbers promted
                sum += num;
                System.out.print("Enter an integer (enter 0 to quit): ");
                num = scan.nextInt();
            } while (num!= 0); //sentiniel condition
            System.out.println("Sum of the integers: " + sum + "\nbye");
        }
        
        scan.close();
    }
}
