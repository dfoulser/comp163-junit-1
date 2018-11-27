import java.util.Scanner;

/**
 * Class to demonstrate computing the factorial of an integer.
 * @author defoulser@ncat.edu
 */
public class Factorial {
  /**
   * Compute the factorial of n.
   *
   * @param n the integer to compute factorial of
   * @return n! n factorial
   */
  public static int factorial(int n) {
    int f = 1; 
    for (int i = 1; i <= n; i++) {
      f *= i;
    }
    return f;
  }
  
  /**
   * Invoke factorial() from the main() method.
   * @param args tokens from the command line
   */
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int m = keyboard.nextInt();
    for (int i = 1; i <= m; i++) {
      int factorial = Factorial.factorial(i);
      System.out.println(factorial);
    }
  }
}