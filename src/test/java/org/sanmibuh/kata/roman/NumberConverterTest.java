package org.sanmibuh.kata.roman;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class NumberConverterTest {

  private static NumberConverter numberConverter;

  @BeforeAll
  public static void setUp() {
    numberConverter = new NumberConverter();
  }

  private static Stream<Arguments> numbersToConvert() {
    return Stream.of(
        Arguments.of(1, "I"),
        Arguments.of(5, "V"),
        Arguments.of(10, "X"),
        Arguments.of(50, "L"),
        Arguments.of(100, "C"),
        Arguments.of(500, "D")
    );
  }

  @ParameterizedTest
  @MethodSource("numbersToConvert")
  public void shouldToRomanReturnExpectedRomanNumber(final int number, final String expectedRomanNumber) {
    final String roman = numberConverter.toRoman(number);
    assertEquals(expectedRomanNumber, roman);
  }

}
