package com.alph.excercise;

import org.hamcrest.Matchers;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 Given a string, return the sum of the digits 0-9 that appear in the string, ignoring all other characters. Return 0 if there are no digits in the string. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)

 sumDigitsUsingStream("aa1bc2d3") → 6
 sumDigitsUsingStream("aa11b33") → 8
 sumDigitsUsingStream("Chocolate") → 0
 */
public class SumDigitsTest {


    SumDigits sumDigits = new SumDigits();

    @Test
    public void testSomeDigits() throws Exception {

        assertThat(sumDigits.sumDigitsUsingStream("aa1bc2d3"), Matchers.equalTo(6));
        assertThat(sumDigits.sumDigitsUsingStream("aa11b33"), Matchers.equalTo(8));
        assertThat(sumDigits.sumDigitsUsingStream("Chocolate"), Matchers.equalTo(0));
    }
}