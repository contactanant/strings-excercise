package com.alph.excercise;

import java.util.stream.Stream;

/**
 Given a string, return the sum of the numbers appearing in the string, ignoring all other characters.
 A number is a series of 1 or more digit chars in a row.
 (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)

 sumNumbers("abc123xyz") → 123
 sumNumbers("aa11b33") → 44
 sumNumbers("7 11") → 18
 */
public class SumNumbers {

    public int sumUsingRegex(String str) {
        if (str == null || !str.matches(".*\\d+.*")) {
            return 0;
        }
        return Stream.of(str.split("\\D+")).filter(c-> !(c == null || c.isEmpty())).mapToInt(Integer::parseInt).sum();
    }

    public int sum(String str) {
        if (str == null || !str.matches(".*\\d+.*")) {
            return 0;
        }

        int sum = 0;
        String number = "";
        boolean lastCharWasDigit = false;

        for (char character : str.toCharArray()) {

            if (Character.isDigit(character)) {
                number += character;
            } else {
                if (lastCharWasDigit) {
                    sum += Integer.parseInt(number);
                }
                number = "";
            }
            lastCharWasDigit = Character.isDigit(character);
        }
        if (lastCharWasDigit){
            sum += Integer.parseInt(number);
        }
        return sum;
    }
}
