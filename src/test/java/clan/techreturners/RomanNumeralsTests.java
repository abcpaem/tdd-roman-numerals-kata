package clan.techreturners;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.security.InvalidParameterException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RomanNumeralsTests {
    @ParameterizedTest(name = "{index}) Roman numeral {0} is {1}")
    @CsvSource(delimiterString = "->", textBlock = """
            I    -> 1
            II   -> 2
            III  -> 3
            IV   -> 4
            V    -> 5
            VI   -> 6
            VII  -> 7
            VIII -> 8
            IX   -> 9
            X    -> 10
            XL   -> 40
            L    -> 50
            XC   -> 90
            C    -> 100
            CD   -> 400
            D    -> 500
            CM   -> 900
            M    -> 1000
            """)
    void checkGetArabicNumber(String romanNumeral, Integer expectedArabicNumber) {
        assertEquals(expectedArabicNumber, RomanNumerals.getArabicNumber(romanNumeral));
    }

    @ParameterizedTest(name = "{index}) Roman numeral {0} is {1}")
    @CsvSource(delimiterString = "->", textBlock = """
            i   -> 1
            ii  -> 2
            iii -> 3
            iv  -> 4
            v   -> 5
            """)
    void checkGetArabicNumberWhenRomanNumeralIsLowerCase(String romanNumeral, Integer expectedArabicNumber) {
        assertEquals(expectedArabicNumber, RomanNumerals.getArabicNumber(romanNumeral));
    }

    @ParameterizedTest(name = "{index}) Roman Numeral {0} is invalid or not supported yet")
    @ValueSource(strings = {"I̅V̅", "K", "XXXX", "XVIIII"})
    void checkGetArabicNumberWhenRomanNumeralIsInvalidOrNotSupported(String romanNumeral) {
        assertThrows(InvalidParameterException.class, () -> {
            RomanNumerals.getArabicNumber(romanNumeral);
        });
    }

    @Test
    void checkGetRomanNumber() {
        // Arrange
        String expectedRoman = "I";

        // Act
        String romanNumber = RomanNumerals.getRomanNumber(1);

        // Assert
        assertEquals(expectedRoman, romanNumber);
    }
}
