// Description: This program calculates the factorial of a given number. It handles negative input and overflow scenarios by returning -1.
// Name: Viovicente, Kenneth Reniel C.

public class FactorialWithErrorFlag {

    public static long factorial(int n) {
      // Function to calculate the factorial of a number
      if (n < 0 || n > 20) {
        return -1; // Handle negative input and overflow
      }
  
      long result = 1;
      for (int i = 1; i <= n; i++) {
        result *= i;
      }
      return result;
    }
  
    public static void main(String[] args) {
      for (int num = 0; num <= 25; num++) {
        long fact = factorial(num);
        if (fact == -1) {
          System.out.println("Error: Factorial not defined for " + num);
        } else {
          System.out.println(num + "! = " + fact);
        }
      }
    }
  }
  