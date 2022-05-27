package com.ccsw.kata;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Main Roman Kata Class
 *
 * @author capgemini
 *
 */
public class KataRoman {

  private static final Map<String, Integer> romanDecimal = new HashMap<String, Integer>();

  private static final TreeMap<Integer, String> decimalRoman = new TreeMap<Integer, String>();

  /**
   * The constructor.
   */
  public KataRoman() {

    romanDecimal.put("M", 1000);
    romanDecimal.put("CM", 900);
    romanDecimal.put("D", 500);
    romanDecimal.put("CD", 400);
    romanDecimal.put("C", 100);
    romanDecimal.put("XC", 90);
    romanDecimal.put("L", 50);
    romanDecimal.put("XL", 40);
    romanDecimal.put("X", 10);
    romanDecimal.put("IX", 9);
    romanDecimal.put("V", 5);
    romanDecimal.put("IV", 4);
    romanDecimal.put("I", 1);

    decimalRoman.put(1000, "M");
    decimalRoman.put(900, "CM");
    decimalRoman.put(500, "D");
    decimalRoman.put(400, "CD");
    decimalRoman.put(100, "C");
    decimalRoman.put(90, "XC");
    decimalRoman.put(50, "L");
    decimalRoman.put(40, "XL");
    decimalRoman.put(10, "X");
    decimalRoman.put(9, "IX");
    decimalRoman.put(5, "V");
    decimalRoman.put(4, "IV");
    decimalRoman.put(1, "I");
  }

  public Integer kataRomanToDecimal(String numberRoman) {

    if (numberRoman.isEmpty()) {
      return 0;
    }

    String numberCompare = "";

    if (numberRoman.length() > 1) {
      numberCompare = numberRoman.substring(0, 2);
    }
    if (!romanDecimal.containsKey(numberCompare)) {
      numberCompare = numberRoman.substring(0, 1);
    }

    return romanDecimal.get(numberCompare) + kataRomanToDecimal(numberRoman.substring(numberCompare.length()));

  }

  public String kataDecimalToRoman(Integer numberDecimal) {

    Integer numberMap = decimalRoman.floorKey(numberDecimal);

    if (numberMap == null) {
      return "";
    }

    if (numberDecimal.equals(numberMap)) {
      return decimalRoman.get(numberDecimal);
    }
    return decimalRoman.get(numberMap) + kataDecimalToRoman(numberDecimal - numberMap);

  }

}
