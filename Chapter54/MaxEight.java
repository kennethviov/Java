// Description: This program finds the maximum of eight given numbers by comparing them in three layers.
// Name: Viovicente, Kenneth Reniel C.

public class MaxEight {

    public static int maxEight(int a, int b, int c, int d, int e, int f, int g, int h) {
        // First layer: compare first four elements
        int max1 = a;
        if (b > max1) {
            max1 = b;
        }
        if (c > max1) {
            max1 = c;
        }
        if (d > max1) {
            max1 = d;
        }

        // Second layer: compare last four elements
        int max2 = e;
        if (f > max2) {
            max2 = f;
        }
        if (g > max2) {
            max2 = g;
        }
        if (h > max2) {
            max2 = h;
        }

        // Third layer: compare the two maximums from previous layers
        return max1 > max2 ? max1 : max2;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int num4 = 5;
        int num5 = 15;
        int num6 = 25;
        int num7 = 40;
        int num8 = 8;

        int maximum = maxEight(num1, num2, num3, num4, num5, num6, num7, num8);
        System.out.println("The maximum of the eight numbers is: " + maximum);
    }
}
