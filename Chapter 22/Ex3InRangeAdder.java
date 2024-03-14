/* This program asks a range of numbers and gets the sum of the in-range and out-range numbers.
 * Name: Viovicente, Kenneth Reniel C.
 * Date:
*/

import java.util.Scanner;

public class Ex3InRangeAdder {
    public static void main(String[] args) {
        //declarations
        Scanner scan = new Scanner (System.in);
        int lowRange, highRange, num;
        int inRangeSum = 0, outRangeSum = 0;

        System.out.println("In-range Adder");

        //inputs
        System.out.println("Enter low range: ");
        lowRange = scan.nextInt();
        System.out.println("Enter high range: ");
        highRange = scan.nextInt();

        do { //looping the datas
            System.out.println("Enter data: ");
            num = scan.nextInt();
            
            if (num >= lowRange && num <= highRange) //condtion on where to add the promted number
                inRangeSum += num;
            else
                outRangeSum += num;

        } while (num != 0); //loops while the input is not 0

        //output
        System.out.println("Sum of in range values: " + inRangeSum);
        System.out.println("Sum of out of range values: " + outRangeSum);

        scan.close();
    }
}
