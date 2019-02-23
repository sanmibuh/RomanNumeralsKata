package org.sanmibuh.kata.roman;

public class NumberConverter {

  public String toRoman(final int number) {
    final StringBuilder roman = new StringBuilder();
    if(5 == number) {
      return "V";
    }
    if(6 == number) {
      return "VI";
    }
    if(7 == number) {
      return "VII";
    }
    for(int i = 1; i <= number; i++) {
      roman.append("I");
    }
    return roman.toString();
  }

}
