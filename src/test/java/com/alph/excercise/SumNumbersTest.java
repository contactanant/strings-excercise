package com.alph.excercise;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

/**
 Given a string, return the sum of the numbers appearing in the string, ignoring all other characters.
 A number is a series of 1 or more digit chars in a row.

 (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)
 sumNumbers("abc123xyz") → 123
 sumNumbers("aa11b33") → 44
 sumNumbers("7 11") → 18
 */
public class SumNumbersTest {

    SumNumbers sumNumbers = new SumNumbers();

    @Test
    public void testSumUsingRegex() throws Exception {

        assertThat(sumNumbers.sumUsingRegex("abc123xyz"), equalTo(123));
        assertThat(sumNumbers.sumUsingRegex("aa11b33"), equalTo(44));
        assertThat(sumNumbers.sumUsingRegex("7 11"), equalTo(18));
    }

    @Test
    public void testSumUsingLogic() throws Exception {

        assertThat(sumNumbers.sum("abc123xyz"), equalTo(123));
        assertThat(sumNumbers.sum("aa11b33"), equalTo(44));
        assertThat(sumNumbers.sum("7 11"), equalTo(18));
    }
}