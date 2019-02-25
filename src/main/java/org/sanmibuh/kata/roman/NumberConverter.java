package org.sanmibuh.kata.roman;

import java.util.Collections;
import java.util.stream.Stream;

public class NumberConverter {

  private enum RomanSymbol {
    I(1),
    V(5),
    X(10),
    L(50),
    C(100),
    D(500),
    M(1000);

    private final int value;

    RomanSymbol(final int value) {
      this.value = value;
    }
  }

  public String toRoman(final int number) {
    final StringBuilder romanNumber = new StringBuilder();

    Stream.of(RomanSymbol.values())
        .sorted(Collections.reverseOrder())
        .filter(romanSymbol -> number / romanSymbol.value > 0)
        .findFirst().ifPresent(romanSymbol -> {
      final int times = number / romanSymbol.value;
      for (int i = 0; i < times; i++) {
        romanNumber.append(romanSymbol);
      }
      romanNumber.append(toRoman(number - (romanSymbol.value * times)));
    });

    return romanNumber.toString();
  }

}
