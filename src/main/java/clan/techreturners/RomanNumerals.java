package clan.techreturners;

public class RomanNumerals {
    public static int getArabicNumber(String romanNumber) {
        if (romanNumber == "I")
            return 1;
        else if (romanNumber == "II"){
            return 2;
        }

        return 0;
    }
}
