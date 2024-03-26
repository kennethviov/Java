/*  This program assigns default value if the total points assigned to a character exceeds 15
 *  Name: Viovicente, Kenneth Reniel C.
 *  Date: 
*/

import java.util.Scanner;

public class FantasyGame {
    public static void main(String[] args){
        //declarations
        Scanner scan = new Scanner(System.in);
        String name;
        int strength, health, luck;

        //signs and inputs
        System.out.println("Welcome to Yertle's Quest");
        System.out.println("Enter the name of your character:");
        name = scan.nextLine();
        System.out.println("\nEnter points in each characteristic (Strength, Health, Luck)");
        System.out.println("Be careful in assigning points for if the total exceeds 15 points, each characteristic will be assigned 5 points each.");
        System.out.println("\nEnter strength (1 - 10): ");
        strength = scan.nextInt();
        System.out.println("Enter health (1 - 10): ");
        health = scan.nextInt();
        System.out.println("Enter luck (1 - 10): ");
        luck = scan.nextInt();
        System.out.println(" ");

        //conditioned process
        if ((strength + health + luck) > 15){
            System.out.println("You have given your character too many points! Default values have been assigned.");
            strength = 5;
            health = 5;
            luck = 5;
        }
        
        //ouput
        System.out.println(name + ", strength: " + strength + ", health: " + health + ", luck: " + luck);

        scan.close(); //scanner closed to avoid resource leak
    }
}