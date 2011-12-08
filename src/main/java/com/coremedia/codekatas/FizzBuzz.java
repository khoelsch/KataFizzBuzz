package com.coremedia.codekatas;

/**
 * "Write a program that prints the numbers from 1 to 100. But for multiples
 * of three print 'Fizz' instead of the number and for the multiples of five
 * print 'Buzz'. For numbers which are multiples of both three and five print
 * 'FizzBuz'!"
 *
 * For more Details see  <a href="http://codingdojo.org/cgi-bin/wiki.pl?back=KataFizzBuzz">the description @ CodingDojo</a>.
 */
public class FizzBuzz {

  public static String[] calcList(int lastConvertedNumber) {
    final String[] list = new String[lastConvertedNumber];

    for (int i=1; i<=lastConvertedNumber; ++i ) {
      list[i-1] = convertNumber(i);
    }

    return list;
  }

  private static String convertNumber(int number) {
    String result = convertMultiple(number);
    if (!"".equals(result)) {
      return result;
    }

    result = convertContains(number);
    if (!"".equals(result)) {
      return result;
    }

    return Integer.valueOf(number).toString();

  }

  // returns "", when converting not possible
  private static String convertContains(int number) {
    int remainingDigits = number;
    do {
      int lastDigit = remainingDigits % 10;
      remainingDigits /= 10;
      if (lastDigit == 3) {
        return "Fizz";
      } else if (lastDigit == 5) {
        return "Buzz";
      }
    } while ( remainingDigits > 0 );

    return "";
  }

  // returns "", when converting not possible
  private static String convertMultiple(int number) {
    boolean multipleOfThree = (number % 3) == 0;
    boolean multipleOfFive = (number % 5) == 0;

    if (multipleOfThree && multipleOfFive) {
      return "FizzBuzz";
    } else if (multipleOfThree) {
      return "Fizz";
    } else if (multipleOfFive) {
      return "Buzz";
    }

    return "";
  }

  public static void printNumbers(int lastConvertedNumber) {
    final String[] list = calcList(lastConvertedNumber);
    for (final String number : list) {
      System.out.println(number);
    }
  }
}
