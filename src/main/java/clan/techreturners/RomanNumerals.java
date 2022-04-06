package clan.techreturners;

import java.security.InvalidParameterException;
import java.util.HashMap;

public class RomanNumerals {
    private static HashMap<Character, Integer> romanToNum = new HashMap<>() {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

    public static int getArabicNumber(String romanNumber) {
        int number = 0;

        // // Replaces some roman numerals for their equivalent in our known roman numerals list
        romanNumber = romanNumber.toUpperCase()
                .replace("IV", "IIII")
                .replace("IX", "VIIII")
                .replace("XL", "XXXX")
                .replace("XC", "LXXXX")
                .replace("CD", "CCCC")
                .replace("CM", "DCCCC");

        try {
            char[] romans = romanNumber.toCharArray();
            for (char c : romans) {
                number += romanToNum.get(c);
            }
        } catch (Exception e) {
            throw new InvalidParameterException("Roman numeral is not valid or not supported");
        }

        return number;
    }
}
