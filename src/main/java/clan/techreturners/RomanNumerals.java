package clan.techreturners;

import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class RomanNumerals {

    static final String ROMAN_NUMERAL_REG_EXP = "^M{0,3}(CM|CD|D?C{0,3})?(XC|XL|L?X{0,3})?(IX|IV|V?I{0,3})?$";
    static final String INVALID_ROMAN_NUMERAL = "Roman numeral is not valid or not supported";
    private static HashMap<Character, Integer> romanToNum = new HashMap<>() {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

    private static LinkedHashMap<Integer, String> numToRoman = new LinkedHashMap<>() {{
        put(1000, "M");
        put(900, "CM");
        put(500, "D");
        put(400, "CD");
        put(100, "C");
        put(90, "XC");
        put(50, "L");
        put(40, "XL");
        put(10, "X");
        put(9, "IX");
        put(5, "V");
        put(4, "IV");
        put(1, "I");
    }};

    public static int getArabicNumber(String romanNumber) {
        romanNumber = romanNumber.toUpperCase();

        if (!romanNumber.matches(ROMAN_NUMERAL_REG_EXP))
            throw new InvalidParameterException(INVALID_ROMAN_NUMERAL);

        int number = 0;

        // // Replaces some roman numerals for their equivalent in our known roman numerals list
        romanNumber = romanNumber
                .replace("IV", "IIII")
                .replace("IX", "VIIII")
                .replace("XL", "XXXX")
                .replace("XC", "LXXXX")
                .replace("CD", "CCCC")
                .replace("CM", "DCCCC");

        char[] romans = romanNumber.toCharArray();
        for (char c : romans) {
            number += romanToNum.get(c);
        }

        return number;
    }

    public static String getRomanNumeral(int number) {
        String romanNumeral = "";
        for (Integer num : numToRoman.keySet()) {
            while (number >= num) {
                romanNumeral += numToRoman.get(num);
                number -= num;
            }
        }
        return romanNumeral;
    }
}
