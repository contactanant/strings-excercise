package com.alph.excercise;

import java.util.Arrays;

/**
 Given a string, return the length of the largest "block" in the string. A block is a run of adjacent chars that are the same.

 maxBlock("hoopla") → 2
 maxBlock("abbCCCddBBBxx") → 3
 maxBlock("") → 0

 */
public class MaxBlock {

    public int getMaxBlockUsingRegex(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        return Arrays.asList(str.split("(?<=(.))(?!\\1)")).stream().filter(c -> c != null).
                max(((a, b) -> Integer.valueOf(a.length()).compareTo(Integer.valueOf(b.length())))).get().length();
    }

    public int getMaxBlock(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        char previousChar = '\u0000';
        int currentCount = 1;
        int maxCount = 0;
        char maxCountChar = '\u0000';

        for (char character : str.toCharArray()) {

            if (previousChar == character) {
                currentCount++;
            } else {
                currentCount = 1;
            }
            if (currentCount > maxCount) {
                maxCount = currentCount;
                maxCountChar = character;
            }
            previousChar = character;
        }

        System.out.println(new String(new char[maxCount]).replace('\u0000', maxCountChar));
        return maxCount;
    }

}
