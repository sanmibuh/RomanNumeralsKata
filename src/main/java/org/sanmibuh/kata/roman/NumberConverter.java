package org.sanmibuh.kata.roman;

public class NumberConverter {

  public String toRoman(final int number) {
    final StringBuilder roman = new StringBuilder();
    for (int i = 1; i <= number; i++) {
      roman.append("I");
    }
    return roman.toString();
  }

}
