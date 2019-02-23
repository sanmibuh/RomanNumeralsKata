package org.sanmibuh.kata.roman;

public class NumberConverter {

  public String toRoman(final int number) {
    final StringBuilder roman = new StringBuilder();
    if(number == 4) {
      return "IV";
    }
    if (number == 10) {
      return "X";
    }
    if(number >= 5) {
      roman.append("V");
      roman.append(toRoman(number - 5));
    }else {
      for (int i = 1; i <= number; i++) {
        roman.append("I");
      }
    }
    return roman.toString();
  }

}
