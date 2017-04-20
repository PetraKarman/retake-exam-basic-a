import java.util.ArrayList;

public class MinMaxDiff {
  public static void main(String[] args) {
    // Create a function called `minMaxDiff` that takes a list of numbers as parameter
    // and returns the difference between maximum and minimum values in the list
    // Create basic unit tests for it with at least 3 different test case
  }

  public static int getMinMaxDiff(ArrayList<Integer> listOfNumbers) {
    int max = listOfNumbers.get(0);
    int min = listOfNumbers.get(0);

    for (int actual : listOfNumbers) {
      if (actual > max) {
        max = actual;
      }
      if (actual < min) {
        min = actual;
      }
    }
    return max - min;
  }
}
