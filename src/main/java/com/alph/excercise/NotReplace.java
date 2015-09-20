package com.alph.excercise;

import java.util.stream.Stream;

/**

 Given a string, return a string where every appearance of the lowercase word "is" has been replaced with "is not".
 The word "is" should not be immediately preceded or followed by a letter -- so for example the "is" in "this" does not count.
 (Note: Character.isLetter(char) tests if a char is a letter.)

 notReplace("is test") → "is not test"
 notReplace("is-is") → "is not-is not"
 notReplace("This is right") → "This is not right"

 */
public class NotReplace {

    public String replace(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        return str.replaceAll("(?<!([a-zA-Z]))is(?!([a-zA-Z]))", "is not");
    }

}
