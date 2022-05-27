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
  public void testRecursive() {

    assertEquals(this.kataRoman.kataRomanToDecimal("MCCXXXIV"), 1234);
  }

  @Test
  public void testRecursiveZero() {

    assertEquals(this.kataRoman.kataRomanToDecimal(""), 0);
  }
}
