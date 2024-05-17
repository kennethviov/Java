public class SumOfEachColumn {

    public static void main(String[] args) {
        int[][] data = {{3, 2, 5},
                        {1, 4, 4, 8, 13},
                        {9, 1, 0, 2},
                        {0, 2, 6, 3, -1, -8}};

        // Find the maximum number of columns (longest row)
        int maxCols = 0;
        for (int row = 0; row < data.length; row++) {
            if (data[row].length > maxCols) {
                maxCols = data[row].length;
            }
        }

        // Initialize array to store column sums
        int[] colSums = new int[maxCols];

        // Compute column sums
        for (int row = 0; row < data.length; row++) {
            for (int col = 0; col < data[row].length; col++) {
                colSums[col] += data[row][col];
            }
        }

        // Print column sums
        System.out.println("Column Sums:");
        for (int col = 0; col < colSums.length; col++) {
            System.out.println("Column " + (col + 1) + ": " + colSums[col]);
        }
    }
}