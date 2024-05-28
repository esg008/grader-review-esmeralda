import static org.junit.Assert.*;
import org.junit.*;
import java.util.Arrays;
import java.util.List;

class IsMoon implements StringChecker {
  public boolean checkString(String s) {
    return s.equalsIgnoreCase("moon");
  }
}

public class TestListExamples {
  @Test(timeout = 500)
  public void testMergeRightEnd() {
    List<String> left = Arrays.asList("a", "b", "c");
    List<String> right = Arrays.asList("a", "d");
    List<String> merged = ListExamples.merge(left, right);
    List<String> expected = Arrays.asList("a", "a", "b", "c", "d");
    assertEquals(expected, merged);

    public class TestListExamples {
  @Test(timeout = 500)
  public void testEmptyLists() {
    List<String> left = Arrays.asList();
    List<String> right = Arrays.asList();
    List<String> merged = ListExamples.merge(left, right);
    List<String> expected = Arrays.asList();
    assertEquals(expected, merged);
  }
public class TestListExamples {
  @Test(timeout = 500)
  public void testReverse() {
    List<String> left = Arrays.asList("c", "b", "a");
    List<String> right = Arrays.asList("b", "a");
    List<String> merged = ListExamples.merge(left, right);
    List<String> expected = Arrays.asList("a", "a", "b", "b", "c");
    assertEquals(expected, merged);
  }
public class TestListExamples {
  @Test(timeout = 500)
  public void testCase() {
    List<String> left = Arrays.asList("a", "B", "c");
    List<String> right = Arrays.asList("A", "d");
    List<String> merged = ListExamples.merge(left, right);
    List<String> expected = Arrays.asList("A", "a", "B", "c", "d");
    assertEquals(expected, merged);
  }
}
