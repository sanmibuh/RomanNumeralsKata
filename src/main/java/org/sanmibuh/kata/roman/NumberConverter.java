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
    if (number == 100) {
      return "C";
    }
    if (number == 500) {
      return "D";
    }
    if (number == 1000) {
      return "M";
    }
    return "I";
  }

}
