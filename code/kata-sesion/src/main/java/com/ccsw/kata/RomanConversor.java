package com.ccsw.kata;

import java.util.Hashtable;

/**
 * Main Roman Kata Class
 *
 * @author ccsw
 *
 */
public class RomanConversor {

    private Hashtable<Character, Integer> mappingRomanNumeral;

    public RomanConversor() {
        mappingRomanNumeral = new Hashtable<Character, Integer>();
        mappingRomanNumeral.put('I', 1);
        mappingRomanNumeral.put('V', 5);
        mappingRomanNumeral.put('X', 10);
        mappingRomanNumeral.put('L', 50);
        mappingRomanNumeral.put('C', 100);
        mappingRomanNumeral.put('D', 500);
        mappingRomanNumeral.put('M', 1000);

    }

    public int convert(String romanNumeral) {
        int totalSum = 0;
        int actualNumber;

        for (int index = 0; index < romanNumeral.length(); index++) {
            Character romanNumber = romanNumeral.charAt(index);
            actualNumber = mappingRomanNumeral.get(romanNumber);

            if (hasNextElement(romanNumeral, index) && actualNumber < mappingRomanNumeral.get(romanNumeral.charAt(index + 1)).intValue())
                totalSum -= actualNumber;
            else
                totalSum += actualNumber;
        }

        return totalSum;
    }

    private boolean hasNextElement(String romanNumeral, int index) {
        return index + 1 < romanNumeral.length();
    }

}
