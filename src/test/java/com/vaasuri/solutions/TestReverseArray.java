package com.vaasuri.solutions;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

public class TestReverseArray {

  @Test
  public void testReverseArray() {
    int[] list = {1,2,3};
    int[] result = ReverseArray.reverse(list);
    int[] expected = {3,2,1};
    assertArrayEquals("basic reverse", expected, result);
  }

  @Test
  public void testEmptyReverse() {
    int[] list = {};
    int[] result = ReverseArray.reverse(list);
    assertArrayEquals("empty reverse", list, result);
  }

  @Test
  public void testSingleReverse() {
    int[] list = {3};
    int[] result = ReverseArray.reverse(list);
    assertArrayEquals("single reverse", list, result);
  }

  @Test
  public void testNullReverse() {
    int[] result = ReverseArray.reverse(null);
    assertTrue(result == null);
  }
}

