import java.util.Scanner;

public class Ex4ThePressureIsBuilding {
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);
        int frontR, frontL, rearR, rearL, frontDiff, rearDiff;

        System.out.println("Input right front pressure");
        frontR = scan.nextInt();
        System.out.println("Input left front pressure");
        frontL = scan.nextInt();
        System.out.println("Input right rear pressure");
        rearR = scan.nextInt();
        System.out.println("Input left rear pressure");
        rearL = scan.nextInt();

        if ((frontR >= 35 && frontR <= 45) && (frontL >= 35 && frontL <= 45) && (rearR >= 35 && rearR <= 45) && (rearL >= 35 && rearL <= 45)) {
            frontDiff = Math.abs(frontR - frontL);
            rearDiff = Math.abs(rearR - rearL);

            if (frontDiff <= 3 && rearDiff <= 3)
                System.out.println("Inflation is OK");
            else
                System.out.println("Inflation is BAD");
        } else 
            System.out.println("One or more tires are out or range.");

        scan.close();
    }
}
