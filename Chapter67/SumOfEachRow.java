// Description: This program calculates the rowSum of each row in a two-dimensional array and prints the results.
// Name: Viovicente, Kenneth Reniel C.

public class SumOfEachRow {
    public static void main(String[] args) {
        int[][] data = { {3, 2, 5},
                         {1, 4, 4, 8, 13},
                         {9, 1, 0, 2},
                         {0, 2, 6, 3, -1, -8} };
        
        // Compute the sums for each row and print the results
        for (int row = 0; row < data.length; row++) {
            int rowSum = 0;
            for (int col = 0; col < data[row].length; col++) {
                rowSum += data[row][col];
            }
            System.out.println("Sum of row " + row + ": " + rowSum);
        }
    }
}