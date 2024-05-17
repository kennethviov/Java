// Description: This program calculates the sum of all elements in a two-dimensional array.
// Name: Viovicente, Kenneth Reniel C.

public class SumOfAllArrayElements {
    public static void main(String[] args) {
        int[][] data = { {3, 2, 5},
                         {1, 4, 4, 8, 13},
                         {9, 1, 0, 2},
                         {0, 2, 6, 3, -1, -8} };

        // Declare the sum variable
        int sum = 0;

        // Compute the sum of all elements in the two-dimensional array
        for (int row = 0; row < data.length; row++) {
            for (int col = 0; col < data[row].length; col++) {
                sum += data[row][col];
            }
        }

        // Print out the sum
        System.out.println("The sum is " + sum);
    }
}