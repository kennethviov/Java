/* This program displays the sum of squares and cubes.
 * Name: Viovicente, Kenneth Reniel
 * Date: 
*/

import java.util.Scanner;

public class Ex2AddingUpSquaresAndCubes {
    public static void main (String[] args) {
        //declarations
        Scanner scan = new Scanner (System.in);
        int n, count = 1, square, cube, lpsqrSum = 0, lpcubSum = 0, sqrSum, cubSum;

        //input
        System.out.println("Enter the limit of numbers from 1 to be sqaured, cubed, and summed up: ");
        n = scan.nextInt();

        //process
        while (count <= n) {
            square = count * count;
            cube = (int)Math.pow((double)count, (double)3);
            lpsqrSum += square;
            lpcubSum += cube;
            count++;
        }

        sqrSum = (n * (n + 1) * (2 * n + 1)) / 6;
        cubSum = ((n * n) * ((n + 1) * (n + 1))) / 4;

        //output
        System.out.println("The sum of Sqaures using the loop    is " + lpsqrSum);
        System.out.println("The sum of Cubes using the loop      is " + lpcubSum);
        System.out.println("The sum of Squares using the formula is " + sqrSum);
        System.out.println("The sum of Cubes using the formula   is " + cubSum);

        scan.close();
    }
}
