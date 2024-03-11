/* This program prints a pine tree
 * Name: Viovicente, Kenneth Reniel C.
 * Date: 
*/

public class Ex5PineTree {
    public static void main (String[] args) {
        int rows = 8;
        int i = 1;
        while (i <= rows) {
            int j = 1;
            while (j <= rows - i) {
                System.out.print(" ");
                j++;
            }
            int k = 1;
            while (k <= 2 * i - 1) {
                System.out.print("*");
                k++;
            }
            System.out.println();
            i++;
        }
        int l = 1;
        while (l <= 3) {
            int m = 1;
            while (m <= i - 3) {
                System.out.print(" ");
                m++;
            }
            int n = 1;
            while (n <= 3) {
                System.out.print("*");
                n++;
            }
            System.out.println();
            l++;
        }
    }
}
