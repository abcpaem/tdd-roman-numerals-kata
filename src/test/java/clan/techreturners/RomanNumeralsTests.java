package clan.techreturners;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsTests {
    @Test
    public void shouldReturnOneWhenRomanNumeralIsOne() {
        // Arrange
        String romanNumber = "I";

        // Act
        int result = RomanNumerals.getArabicNumber(romanNumber);

        // Arrange
        assertEquals(1, result);
    }

    @Test
    public void shouldReturnTwoWhenRomanNumeralIsTwo() {
        // Arrange
        String romanNumber = "II";

        // Act
        int result = RomanNumerals.getArabicNumber(romanNumber);

        // Arrange
        assertEquals(2, result);
    }

    @Test
    public void shouldReturnThreeWhenRomanNumeralIsThree() {
        // Arrange
        String romanNumber = "III";

        // Act
        int result = RomanNumerals.getArabicNumber(romanNumber);

        // Arrange
        assertEquals(3, result);
    }
}
