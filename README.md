# TDD roman numerals kata
Test Driven Development exercise for roman numeral conversions.

### What is a kata?

A Kata in martial arts means “a system of individual training exercises”. Just like in martial arts, coding also requires consistent practise to hone in the skill.

### What is the goal?

Implement the Roman Numerals Kata using Test-Driven Development. 

### Instructions

- Read the Roman Numerals Kata requirements at Coding Dojo: https://codingdojo.org/kata/RomanNumerals
- Solve the Roman Numerals kata in Java programming language.

### Solution:
- The solution is only a class helper with tests.
- I started writing simple tests and at some point they were refactored as parameterised tests for simplification.
- The code also started from a simple solution to make the initial tests pass, then evolving to a more complex code until it reached its refactoring stage.
- Test cases were added for converting Roman numerals to Arabic numbers and from Arabic numbers to Roman numerals.
- More tests were added for testing edge case scenarios, like empty strings, null, zero, negative numbers and numbers from 4000.
- Finally, a console application for user interaction was added.
- Please check the commits to see how was the TDD process.
- Please also feel free to clone the code and run all the tests locally.

To have a quick overview of all the tests passing, please click [here](https://htmlpreview.github.io/?https://github.com/abcpaem/tdd-roman-numerals-kata/blob/main/docs/RomanNumeralsTestsResults.html) or [here](https://htmlview.glitch.me/?https://github.com/abcpaem/tdd-roman-numerals-kata/blob/main/docs/RomanNumeralsTestsResults.html).

Click [here](src/test/java/clan/techreturners/romannumerals/kata/RomanNumeralsTests.java) to see the Roman Numerals tests code.

Click [here](src/main/java/clan/techreturners/romannumerals/kata/RomanNumerals.java) to see the Roman Numerals code.

---
### How to run the application
CD (change directory) to the project root folder in the command line, then:
 
1) ``mvn compile``
2) ``mvn exec:java -Dexec.mainClass=clan.techreturners.romannumerals.kata.Main``

To run tests:
1) ``mvn test``
 
## Technology
This project was built using:
- Java version 17.0.2
- JUnit 5.8.2 for unit testing
- Apache Maven 3.8.5 as project manager
- Community Edition for the IntelliJ 2021.3.2 development environment.
