package com.coremedia.codekatas;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
  @AfterClass
  static public void printUpTo100() {
    FizzBuzz.printNumbers(100);
  }

  @Test
  public void calcListForNumbersSmallerThanTen() {
    String[] expected = {
            "1",
            "2",
            "Fizz", // 3
            "4",
            "Buzz", // 5
            "Fizz", // 6
            "7",
            "8",
            "Fizz", // 9
            "Buzz"  // 10
    };

    Assert.assertArrayEquals(expected, FizzBuzz.calcList(10));
  }

  @Test
  public void calcListForNumbersSmallerThan16() {
    String[] expected = {
            "1",
            "2",
            "Fizz",
            "4",
            "Buzz",
            "Fizz",
            "7",
            "8",
            "Fizz",
            "Buzz",
            "11",
            "Fizz",    // 12
            "13",
            "14",
            "FizzBuzz" // 15
    };

    Assert.assertArrayEquals(expected, FizzBuzz.calcList(15));
  }
}
