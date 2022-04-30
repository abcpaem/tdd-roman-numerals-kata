package clan.techreturners.romannumerals.kata;

import java.security.InvalidParameterException;
import java.util.Scanner;

public class Main {
    public static final String TEXT_RESET = "\u001B[0m";
    public static final String TEXT_RED = "\u001B[31m";
    public static final String TEXT_GREEN = "\u001B[32m";

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String input = null;

        while (!"q".equals(input)) {
            System.out.println("\nRoman numeral converters:\n");
            System.out.println(" 1 - Roman to Arabic");
            System.out.println(" 2 - Arabic to Roman");
            System.out.println();
            System.out.println("Which one do you want to run (type 'q' to quit)?:");

            input = reader.nextLine().trim();
            System.out.println();

            try {
                if (input.equals("1")) {
                    System.out.println("\nEnter the Roman numeral:\n");

                    System.out.println(TEXT_GREEN + RomanNumerals.getArabicNumber(reader.nextLine().trim()) + TEXT_RESET);

                } else if (input.equals("2")) {
                    System.out.println("\nEnter the Arabic number:\n");

                    System.out.println(TEXT_GREEN + RomanNumerals.getRomanNumeral(Integer.parseInt(reader.nextLine().trim())) + TEXT_RESET);
                }
            } catch (InvalidParameterException e) {
                System.out.println(TEXT_RED + e.getMessage() + TEXT_RESET);
            } catch (NumberFormatException e) {
                System.out.println(TEXT_RED + "There was an error. " + e.getMessage() + TEXT_RESET + " Please make sure you enter a number.");
            }
        }
    }
}
