import java.util.Scanner;

public class HarmonicMean {
    public static void main (String [] args){
        //local declarations
        Scanner scan = new Scanner (System.in);
        int num1, num2;
        double arithMean, harmMean;

        //input
        System.out.println("Enter X: ");
        num1 = scan.nextInt();
        System.out.println("Enter Y: ");
        num2 = scan.nextInt();

        //process
        arithMean = (num1 + num2) /2;
        harmMean = 2.0 / ((1.0 / num1) + (1.0 / num2));

        //output
        System.out.print("Arithmetic mean: " + arithMean + "\nHarmonic mean: " + harmMean);

        scan.close(); //closed the scanner to avoid memory leak
    }
}