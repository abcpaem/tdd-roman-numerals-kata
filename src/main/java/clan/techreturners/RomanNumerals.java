package clan.techreturners;

import java.security.InvalidParameterException;
import java.util.HashMap;

public class RomanNumerals {
    private static HashMap<Character, Integer> romanToNum = new HashMap<>() {{
        put('I', 1);
        put('V', 5);
    }};

    public static int getArabicNumber(String romanNumber) {
        int number = 0;

        romanNumber = romanNumber.toUpperCase()
                .replace("IV", "IIII")
                .replace("IX", "VIIII");

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
