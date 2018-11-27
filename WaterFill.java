/**
 * This class solves the problem of computing "how much water a histogram can hold."
 * To visualize the problem, draw a histogram of non-negative numbers.  Now image that
 * you are pouring water over the top of it.  Any water that does not flow out the sides
 * of the histogram is consider to be held by the histogram.  Count how many squares of
 * water this is and return it as your answer.
 *
 * The following histogram of 4, 2, 0, 4, 3 holds 8 cells of water, shown with X characters
 * in the second diagram.  Note that the final ...4, 3 does not hold water, because the water
 * can run off to the right.
 *
 * <pre>
 *
 *    |
 *    +-+   +-+
 *    | |   | +-+
 *    | +-+ | | |
 *    | | | | | |
 *    +-+-+-+-+-+--
 *
 *    |
 *    +-+XXX+-+
 *    | |XXX| +-+
 *    | +-+X| | |
 *    | | |X| | |
 *    +-+-+-+-+-+--
 * </pre>
 */
public class WaterFill {

  public static int fill(int[] histogram) {
    int[] maxRight = new int[histogram.length];
    int[] maxLeft = new int[histogram.length];
    
    int leftMax = 0;
    for (int i = 0; i < histogram.length; i++) {
      if (histogram[i] > leftMax) {
        leftMax = histogram[i];
      }
      maxLeft[i] = leftMax;
    }

    int rightMax = 0;
    for (int i = histogram.length - 1; i >= 0; i--) {
      if (histogram[i] > rightMax) {
        rightMax = histogram[i];
      }
      maxRight[i] = rightMax;
    }
    
    int sum = 0; 
    for (int i = 0; i < histogram.length; i++) {
      int secondHeight = (maxLeft[i] > maxRight[i]) ? maxRight[i] : maxLeft[i];
      sum += secondHeight - histogram[i];
    }

    return sum;
  }

  public static void main(String[] args) {
    int[] histoFirst = {6, 4, 3, 2, 1, 5, 5};
    int[] histoSecond = {3, 1, 4, 1, 3};
    int[] histoThird = {1, 3, 5, 4, 2};
    int expectedFirst = 10;
    int expectedSecond = 4;
    int expectedThird = 0;
    
    System.out.println("Actual: " + fill(histoFirst) + ", expected " + expectedFirst);
    System.out.println("Actual: " + fill(histoSecond) + ", expected " + expectedSecond);
    System.out.println("Actual: " + fill(histoThird) + ", expected " + expectedThird);
  }
  
}