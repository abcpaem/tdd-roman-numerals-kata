package clan.techreturners;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsTests {
    @ParameterizedTest(name = "{index}) Roman numeral {0} is {1}")
    @CsvSource(delimiterString = "->", textBlock = """
            I   -> 1
            II  -> 2
            III -> 3
            IV  -> 4
            """)
    public void checkGetArabicNumber(String romanNumeral, Integer expectedArabicNumber) {
        assertEquals(expectedArabicNumber, RomanNumerals.getArabicNumber(romanNumeral));
    }

    @ParameterizedTest(name = "{index}) Roman numeral {0} is {1}")
    @CsvSource(delimiterString = "->", textBlock = """
            i   -> 1
            ii  -> 2
            iii -> 3
            iv  -> 4
            """)
    public void checkGetArabicNumberWhenRomanNumeralIsLowerCase(String romanNumeral, Integer expectedArabicNumber) {
        assertEquals(expectedArabicNumber, RomanNumerals.getArabicNumber(romanNumeral));
    }
}
