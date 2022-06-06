package com.ccsw.kata;

import java.util.HashMap;
import java.util.Map;

/**
 * Main Roman Kata Class
 *
 * @author ccsw
 *
 */
public class KataRoman {

  public Integer kataRomanToDecimal(String numberRoman) {

    Map<Character, Integer> numbersMap = new HashMap<Character, Integer>();
    numbersMap.put('I', 1);
    numbersMap.put('V', 5);
    numbersMap.put('X', 10);
    numbersMap.put('L', 50);
    numbersMap.put('C', 100);
    numbersMap.put('D', 500);
    numbersMap.put('M', 1000);

    int result = 0;

    for (int i = 0; i < numberRoman.length(); i++) {
      char ch = numberRoman.charAt(i); // Current Roman Character

      // Case 1
      if (i > 0 && numbersMap.get(ch) > numbersMap.get(numberRoman.charAt(i - 1))) {
        result += numbersMap.get(ch) - 2 * numbersMap.get(numberRoman.charAt(i - 1));
      }

      // Case 2: just add the corresponding number to result.
      else
        result += numbersMap.get(ch);
    }

    return result;

  }

  public String kataDecimalToRoman(Integer numberDecimal) {

    int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
    String[] romanLiterals = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

    StringBuilder roman = new StringBuilder();

    for (int i = 0; i < values.length; i++) {
      while (numberDecimal >= values[i]) {
        numberDecimal -= values[i];
        roman.append(romanLiterals[i]);
      }
    }

    return roman.toString();

  }

}
