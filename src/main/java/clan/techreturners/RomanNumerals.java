package clan.techreturners;

import java.util.HashMap;

public class RomanNumerals {
    private static HashMap<Character, Integer> romanToNum = new HashMap<>() {{
        put('I', 1);
    }};

    public static int getArabicNumber(String romanNumber) {
        int number = 0;
        char[] romans = romanNumber.toCharArray();

        for (char c : romans) {
            number += romanToNum.get(c);
        }

        return number;
    }
}
