package com.alph.excercise;

import org.hamcrest.Matchers;
import org.junit.Test;

import static org.junit.Assert.*;

/*
Given a string, return the length of the largest "block" in the string. A block is a run of adjacent chars that are the same.

maxBlock("hoopla") → 2
maxBlock("abbCCCddBBBxx") → 3
maxBlock("") → 0
 */

public class MaxBlockTest {

    MaxBlock maxBlock = new MaxBlock();

    @Test
    public void testMaxBlockRegex() throws Exception {

        assertThat(maxBlock.getMaxBlockUsingRegex("hoopla"), Matchers.equalTo(2));
        assertThat(maxBlock.getMaxBlockUsingRegex("abbCCCddBBBxx"), Matchers.equalTo(3));
        assertThat(maxBlock.getMaxBlockUsingRegex(""), Matchers.equalTo(0));
    }

    @Test
    public void testMaxBlock() throws Exception {

        assertThat(maxBlock.getMaxBlock("hoopla"), Matchers.equalTo(2));
        assertThat(maxBlock.getMaxBlock("abbCCCddBBBxx"), Matchers.equalTo(3));
        assertThat(maxBlock.getMaxBlock(""), Matchers.equalTo(0));
    }
}