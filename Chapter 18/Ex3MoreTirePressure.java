import java.util.Scanner;

public class Ex3MoreTirePressure {
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);
        int frontR, frontL, rearR, rearL;
        boolean goodPressure = true;

        System.out.println("Input right front pressure");
        frontR = scan.nextInt();
        if (frontR < 35 || frontR > 45) {
            System.out.println("Warning: pressure is out of range\n");
            goodPressure = false;
        }
        System.out.println("Input left front pressure");
        frontL = scan.nextInt();
        if (frontL < 35 || frontL > 45) {
            System.out.println("Warning: pressure is out of range\n");
            goodPressure = false;
        }
        System.out.println("Input right rear pressure");
        rearR = scan.nextInt();
        if (rearR < 35 || rearR > 45) {
            System.out.println("Warning: pressure is out of range\n");
            goodPressure = false;
        }
        System.out.println("Input left rear pressure");
        rearL = scan.nextInt();
        if (rearL < 35 || rearL > 45) {
            System.out.println("Warning: pressure is out of range\n");
            goodPressure = false;
        }

        if (goodPressure == true)
            System.out.println("\nInflation is OK");
        else 
            System.out.println("\nInflation is BAD");
        
        scan.close();
    }
}