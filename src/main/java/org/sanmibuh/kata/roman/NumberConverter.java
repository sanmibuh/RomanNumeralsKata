package org.sanmibuh.kata.roman;

public class NumberConverter {

  public String toRoman(final int number) {
    if (number == 5) {
      return "V";
    }
    if (number == 10) {
      return "X";
    }
    if (number == 50) {
      return "L";
    }
    return "I";
  }

}
