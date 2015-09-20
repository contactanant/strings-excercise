package com.alph.excercise;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

/**
 *
 Given a string, return a string where every appearance of the lowercase word "is" has been replaced with "is not". The word "is" should not be immediately preceeded or followed by a letter -- so for example the "is" in "this" does not count. (Note: Character.isLetter(char) tests if a char is a letter.)

 notReplace("is test") → "is not test"
 notReplace("is-is") → "is not-is not"
 notReplace("This is right") → "This is not right"

 */
public class NotReplaceTest {

    NotReplace notReplace = new NotReplace();

    @Test
    public void testReplace() throws Exception {

        assertThat(notReplace.replace("is test"), equalTo("is not test"));
        assertThat(notReplace.replace("is-is"), equalTo("is not-is not"));
        assertThat(notReplace.replace("This is right"), equalTo("This is not right"));
        assertThat(notReplace.replace("This is iston"), equalTo("This is not iston"));
    }
}