import java.util.Scanner;

public class Ex2TirePressure {
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);
        int frontR, frontL, rearR, rearL;

        System.out.println("Input right front pressure");
        frontR = scan.nextInt();
        System.out.println("Input left front pressure");
        frontL = scan.nextInt();
        System.out.println("Input right rear pressure");
        rearR = scan.nextInt();
        System.out.println("Input left rear pressure");
        rearL = scan.nextInt();

        if ((frontR == frontL) && (rearR == rearL))
            System.out.println("Inflation is OK");
        else 
            System.out.println("Inflation is BAD");
        
        scan.close();
    }
}