package org.sanmibuh.kata.roman;

import java.util.Collections;
import java.util.stream.Stream;

public class NumberConverter {

  private enum RomanSymbol {
    I(1),
    V(5, true),
    X(10),
    L(50, true),
    C(100),
    D(500, true),
    M(1000);

    private final int value;
    private final boolean by5;

    RomanSymbol(final int value) {
      this(value, false);
    }

    RomanSymbol(final int value, final boolean by5) {
      this.value = value;
      this.by5 = by5;
    }
  }

  private final StringBuilder romanNumber = new StringBuilder();
  private final int number;

  public NumberConverter(final int number) {
    this.number = number;
  }

  public String toRoman() {
    Stream.of(RomanSymbol.values())
        .sorted(Collections.reverseOrder())
        .filter(romanSymbol -> number / romanSymbol.value > 0)
        .findFirst().ifPresent(this::makeRomanNumber);

    return romanNumber.toString();
  }

  private void makeRomanNumber(final RomanSymbol romanSymbol) {
    final int times = number / romanSymbol.value;
    int subtraction = 0;
    if (times == 4) {
      romanNumber.append(romanSymbol);
      romanNumber.append(RomanSymbol.values()[romanSymbol.ordinal() + 1]);
      subtraction = romanSymbol.value * times;
    } else if (romanSymbol.by5) {
      final RomanSymbol previousRomanSymbol = RomanSymbol.values()[romanSymbol.ordinal() - 1];
      final RomanSymbol nextRomanSymbol = RomanSymbol.values()[romanSymbol.ordinal() + 1];
      if (number == nextRomanSymbol.value - previousRomanSymbol.value) {
        romanNumber.append(previousRomanSymbol);
        romanNumber.append(RomanSymbol.values()[previousRomanSymbol.ordinal() + 2]);
        subtraction = previousRomanSymbol.value * 9;
      } else {
        romanNumber.append(romanSymbol);
        subtraction = romanSymbol.value;
      }
    } else {
      for (int i = 0; i < times; i++) {
        romanNumber.append(romanSymbol);
        subtraction += romanSymbol.value;
      }
    }
    romanNumber.append(new NumberConverter(number - subtraction).toRoman());
  }
}
