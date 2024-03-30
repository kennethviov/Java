/*  The program prompts the user to enter the effectiveness of the drug as of the a specific date and the percentage of loss of effectiveness
 *  per month. The program then calculates the effectiveness of the drug per month until it is discarded.
 *  Name: Viovicente, Kenneth Reniel C.
 *  Date: Mach 28, 2024
*/

import java.util.Scanner;

public class Ex3DrugPotency {
    public static void main(String[] args) {
        // declarations
        Scanner scan = new Scanner (System.in);
        final double loss;
        double remainingEffect;
        double effectiveness;

        // input
        System.out.println("DRUG POTENCY");
        System.out.println("Enter the effectiveness of the drug as of this date [1-100]: ");
        remainingEffect = scan.nextDouble();
        System.out.println("Enter the pecentage of loss of effectiveness per month [1-100]: ");
        loss = scan.nextDouble() / 100;

        // process
        int month = 0;
        while (remainingEffect > 50) {
            System.out.printf("Month: %d\tEffectiveness: %.2f\n",month, remainingEffect);

            effectiveness = remainingEffect * loss;
            remainingEffect -= effectiveness;
            month++;
        }

        // output
        System.out.printf("Month: %d\tEffectiveness: %.2f\tDISCARDED\n",month, remainingEffect);
        System.out.printf("At month %d, the drug is DISCARDED with the effectivenss of %.2f.", month, remainingEffect);

        scan.close();
    }
}