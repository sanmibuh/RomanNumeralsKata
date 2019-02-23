package org.sanmibuh.kata.roman;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class NumberConverterTest {

  private NumberConverter numberConverter;

  @Before
  public void setUp() {
    numberConverter = new NumberConverter();
  }

  @Test
  public void testNumber1() {
    final String roman = numberConverter.toRoman(1);
    assertEquals("I", roman);
  }
}
