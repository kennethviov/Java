import java.util.Scanner;

public class DistanceABrickTravel {
    public static void main (String [] args){
        //local declarations
        Scanner scan = new Scanner(System.in);
        double time, distance;

        //input
        System.out.println("Enter the number of seconds: ");
        time = scan.nextDouble();

        //process
        distance = (1.0 / 2.0) * 32.174 * time * time;

        //output
        System.out.println("Distance: " + distance);

        scan.close();

        scan.close(); //closed the scanner to avoid memory leak
    }
}
