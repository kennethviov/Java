public class LargestElements {
    public static void main(String[] args) {
        int[][] data = {{3, 2, 5},
                        {1, 4, 4, 8, 13},
                        {9, 1, 0, 2},
                        {0, 2, 6, 3, -1, -8}};

        //decalre and initialize the largest element
        int[] largest = {0, 0, 0, 0};

        //find the largest element
        for (int row = 0; row < data.length; row++){
            for (int col = 0; col < data[row].length; col++){
                if (data[row][col] > largest[row])
                    largest[row] = data[row][col];
            }
        }

        //write out the result
        System.out.println("Largest value per row");
        for (int row = 0; row < data.length; row++){
            System.out.println("Row " + (row + 1) + ": " + largest[row]);
        }
    }
}