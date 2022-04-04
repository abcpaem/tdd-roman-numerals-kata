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
}
