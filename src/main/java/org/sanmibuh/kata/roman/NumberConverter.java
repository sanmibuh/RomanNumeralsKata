package org.sanmibuh.kata.roman;

public class NumberConverter {

  public String toRoman(final int number) {
    if(2 == number) {
      return "II";
    }
    return "I";
  }
}
