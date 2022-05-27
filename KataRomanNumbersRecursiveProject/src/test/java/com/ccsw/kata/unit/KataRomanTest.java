package com.ccsw.kata.unit;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.ccsw.kata.KataRoman;

/**
 * Kata Roman Test Class
 *
 * @author capgemini
 *
 */
public class KataRomanTest {

  private KataRoman kataRoman = new KataRoman();

  @Test
  public void testRecursiveRomanToDecimal() {

    assertTrue(this.kataRoman.kataRomanToDecimal("MCCXXXIV") == 1234);
  }

  @Test
  public void testRecursiveZeroRomanToDecimal() {

    assertTrue(this.kataRoman.kataRomanToDecimal("") == 0);
  }

  @Test
  public void testRecursiveDecimalToRoman() {

    assertTrue("MCCXXXIV".equals(this.kataRoman.kataDecimalToRoman(1234)));
  }

  @Test
  public void testRecursiveZeroDecimalToRoman() {

    assertTrue(this.kataRoman.kataDecimalToRoman(0).isEmpty());
  }
}
