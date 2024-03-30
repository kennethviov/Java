/* This program claculates the number of sheeps after the given number of years.
 * Name: Viovicente, Kenneth Reniel C.
 * Date: March 30, 2024
 */

public class Ex1SheepHerdSize {
    public static void main (String[] args) {
        // declarations
        double power = 1;
        double N = 0;

        // for loop that calculates the number of sheep
        int t = 0;
        for (; N <= 80; t++) {
            N = 220 / (1 + 10 * power);
            System.out.println("Number of sheep after " + t + " years: " + (int)N); // prints out the number of sheep per itteration
            power *= 0.83;
        }

        System.out.println("It takes " + (t - 1) + " years to supervise the sheep population until it reaches " + (int)N + " sheeps");
    }
}