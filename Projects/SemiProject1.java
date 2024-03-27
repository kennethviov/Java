/* This program computes the grades for midterms and finals. The program asks the user to enter the
 * on what they want to compute or exit the program.
 * Name: Viovicente, Kenneth Reniel C.
 * Date: March 26, 2024
 */

import java.util.Scanner;

public class SemiProject1 {
    public static void main (String[] args) {
        // decalarations
        Scanner scan = new Scanner (System.in);
        double quizGrade, labGrade, examGrade, grade;
        boolean response = true;

        System.out.println("GRADING SYSTEM");

        do {
            // providing users with options
            System.out.println("Options:");
            System.out.println("[1] Compute Midterm Grade");
            System.out.println("[2] Compute Final Grade");
            System.out.println("[3] Quit App");
            System.out.print("Select option [1,2,3]: ");
            int option = scan.nextInt();

            switch (option) {
                case 1: // option one to compute midterm grade
                    // inputting the user with the midterm grade
                    System.out.println("Enter your midterm quiz grade: ");
                    quizGrade = scan.nextDouble();
                    System.out.println("Enter your midterm labworks grade: ");
                    labGrade = scan.nextDouble();
                    System.out.println("Enter your midterm exam grade: ");
                    examGrade = scan.nextDouble();

                    // computing the midterm grade
                    grade = (quizGrade * 0.2) + (labGrade * 0.4) + (examGrade * 0.4);
                    System.out.printf("Midterm Grade: %.2f\n", grade);

                    // printing the remarks
                    if (grade <= 3.0)
                        System.out.println("Remarks: PASSED");
                    else
                        System.out.println("Remarks: FAILED");
                break;
                case 2: // option two to compute final grade
                    // inputting the user with the final grade
                    System.out.println("Enter your final quiz grade: ");
                    quizGrade = scan.nextDouble();
                    System.out.println("Enter your final labworks grade: ");
                    labGrade = scan.nextDouble();
                    System.out.println("Enter your final exam grade: ");
                    examGrade = scan.nextDouble();

                    // computing the final grade
                    grade = (quizGrade * 0.2) + (labGrade * 0.4) + (examGrade * 0.4);
                    System.out.printf("Final Grade: %.2f\n", grade);

                    // printing the remarks
                    if (grade <= 3.0)
                        System.out.println("Remarks: PASSED");
                    else
                        System.out.println("Remarks: FAILED");
                break;
                case 3: // option three to exit the program
                    System.out.println("Goodbye!");
                    System.exit(0);
                break;
            }

            // asking the user if they would like to compute another grade
            System.out.println("Would you like to compute another grade? [Y/N] ");
            char key = scan.next().charAt(0);
            if (key == 'Y'|| key == 'y')
                response = true;
            else {
                System.out.println("Goodbye!");
                response = false;
            }
        } while (response == true);

        scan.close();
    }
}