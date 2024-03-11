/* This program creates a multiplication quiz and scores the user
 * Name: Viovicente, Kenneth Reniel C.
 * Date: 
 */
import java.util.Scanner;
import java.util.Random;

public class Ex9MultiplicationQuiz {
    public static void main (String[] args) {
        //declarations
        Scanner scan = new Scanner (System.in);
        Random random = new Random();
        int num1 = 0; int num2 = 0, score = 0, i = 1;
        int answer, product;

        //loop the questionaire 10 times
        while (i <= 10) {
            //assigning values to two variables to multiply
            num1 = random.nextInt(11); 
            num2 = random.nextInt(11);
            //printing out the question
            System.out.print("\nWhat is " + num1 + " * " + num2 + "? ");
            answer = scan.nextInt();
            product = num1 * num2;
            //comparing answer wether its right or wrong
            if (answer != product) {
                System.out.println("Wrong. " + num1 + " * " + num2 + " is " + product);
            } else {
                System.out.println("Right!");
                score++; //adding scores
            }
            i++;
        }
        //printing the result
        System.out.println("\nYou got " + score + " out of 10 questions correct!");

        scan.close();
    }
}
