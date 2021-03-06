package clan.techreturners.romannumerals.kata;

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

    @ParameterizedTest(name = "{index}) Roman Numeral {0} is invalid or not supported")
    @ValueSource(strings = {"I̅V̅", "K", "XXXX", "XVIIII", " ", "null"})
    void checkGetArabicNumberWhenRomanNumeralIsInvalidOrNotSupported(String romanNumeral) {
        assertThrows(InvalidParameterException.class, () -> {
            RomanNumerals.getArabicNumber(romanNumeral.equals("null") ? null : romanNumeral);
        });
    }

    @ParameterizedTest(name = "{index}) Arabic number {0} is {1}")
    @CsvSource(delimiterString = "->", textBlock = """
            1 -> I
            2 -> II
            3 -> III
            4 -> IV
            5 -> V
            6 -> VI
            7 -> VII
            8 -> VIII
            9 -> IX
            10 -> X
            40 -> XL
            50 -> L
            90 -> XC
            100 -> C
            400 -> CD
            500 -> D
            900 -> CM
            1000 -> M
            3999 -> MMMCMXCIX
            """)
    void checkGetRomanNumber(int number, String expectedRomanNumeral) {
        assertEquals(expectedRomanNumeral, RomanNumerals.getRomanNumeral(number));
    }

    @ParameterizedTest(name = "{index}) Arabic number {0} is invalid or not supported")
    @ValueSource(ints = {0, -1, 4000})
    void checkGetRomanNumberWhenArabicNumberIsInvalidOrNotSupported(int number) {
        assertThrows(InvalidParameterException.class, () -> {
            RomanNumerals.getRomanNumeral(number);
        });
    }
}
