package com.ccsw.kata.unit;

import static org.junit.Assert.assertEquals;

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

    assertEquals(this.kataRoman.kataRomanToDecimal("MCCXXXIV"), 1234);
  }

  @Test
  public void testRecursiveZeroRomanToDecimal() {

    assertEquals(this.kataRoman.kataRomanToDecimal(""), 0);
  }

  @Test
  public void testRecursiveDecimalToRoman() {

    assertEquals(1234, this.kataRoman.kataRomanToDecimal("MCCXXXIV"));
  }

  @Test
  public void testRecursiveZeroDecimalToRoman() {

    assertEquals(0, this.kataRoman.kataRomanToDecimal(""));
  }
}
