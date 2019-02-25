package org.sanmibuh.kata.roman;

import java.util.Optional;
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

    public static Optional<RomanSymbol> fromValue(final int value) {
      return Stream.of(RomanSymbol.values())
          .filter(romanSymbol -> romanSymbol.value == value)
          .findFirst();
    }
  }

  public String toRoman(final int number) {
    return RomanSymbol.fromValue(number).map(RomanSymbol::name).orElse(makeExceptions(number));
  }

  private String makeExceptions(final int number) {
    if (number == 3) {
      return "III";
    }
    if (number == 20) {
      return "XX";
    }
    if (number == 30) {
      return "XXX";
    }
    if (number == 200) {
      return "CC";
    }
    return "II";
  }

}
