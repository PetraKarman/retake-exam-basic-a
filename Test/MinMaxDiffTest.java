import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class MinMaxDiffTest {
  @Test
  public void getMinMaxDiff_ListOfZeros() throws Exception {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0));
    assertEquals(0, MinMaxDiff.getMinMaxDiff(numbers));
  }

  @Test
  public void getMinMaxDiff_ListOfSameIntegers() throws Exception {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(4, 4, 4, 4, 4));
    assertEquals(0, MinMaxDiff.getMinMaxDiff(numbers));
  }

  @Test
  public void getMinMaxDiff_ListOfPosAndNegIntegers() throws Exception {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(2, -6, 10, 3, 6));
    assertEquals(16, MinMaxDiff.getMinMaxDiff(numbers));
  }

  @Test
  public void getMinMaxDiff_EmptyList() throws Exception {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList());
    assertEquals(0, MinMaxDiff.getMinMaxDiff(numbers));
  }

  @Test
  public void getMinMaxDiff_ListWIthOneInteger() throws Exception {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(4));
    assertEquals(0, MinMaxDiff.getMinMaxDiff(numbers));
  }

}
