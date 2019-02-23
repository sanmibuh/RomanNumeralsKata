package org.sanmibuh.kata.roman;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class NumberConverterTest {

  private static NumberConverter numberConverter;

  @BeforeAll
  public static void setUp() {
    numberConverter = new NumberConverter();
  }

  @Test
  public void testNumber1() {
    final String roman = numberConverter.toRoman(1);
    assertEquals("I", roman);
  }

  @Test
  public void testNumber2() {
    final String roman = numberConverter.toRoman(2);
    assertEquals("II", roman);
  }

}
