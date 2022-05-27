package com.capgemini.kata.unit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.capgemini.kata.KataRoman;

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
}
