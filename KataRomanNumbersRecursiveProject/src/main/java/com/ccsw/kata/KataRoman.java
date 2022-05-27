package com.ccsw.kata;

import java.util.HashMap;
import java.util.Map;

/**
 * Main Roman Kata Class
 *
 * @author capgemini
 *
 */
public class KataRoman {

  private static final Map<String, Integer> roman = new HashMap<String, Integer>();

  /**
   * The constructor.
   */
  public KataRoman() {

    roman.put("M", 1000);
    roman.put("CM", 900);
    roman.put("D", 500);
    roman.put("CD", 400);
    roman.put("C", 100);
    roman.put("XC", 90);
    roman.put("L", 50);
    roman.put("XL", 40);
    roman.put("X", 10);
    roman.put("IX", 9);
    roman.put("V", 5);
    roman.put("IV", 4);
    roman.put("I", 1);
  }

  public int kataRomanToDecimal(String numberRoman) {

    if (numberRoman.isEmpty()) {
      return 0;
    }

    String numberCompare = "";

    if (numberRoman.length() > 1) {
      numberCompare = numberRoman.substring(0, 2);
    }
    if (!roman.containsKey(numberCompare)) {
      numberCompare = numberRoman.substring(0, 1);
    }

    return roman.get(numberCompare) + kataRomanToDecimal(numberRoman.substring(numberCompare.length()));

  }

}
