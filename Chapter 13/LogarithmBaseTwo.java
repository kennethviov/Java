import java.util.Scanner;

public class LogarithmBaseTwo {
    public static void main (String[] args){
        //local declarations
        Scanner scan = new Scanner (System.in);
        double x, baseTwo;

        //input
        System.out.println("Enter a double: ");
        x = scan.nextDouble();

        //process
        baseTwo = (Math.log(x)) / (Math.log(2));
        
        //output
        System.out.println("Base 2 log of " + x + " is " + baseTwo);

        scan.close(); //closed the scanner to avoid memory leak
    }
}