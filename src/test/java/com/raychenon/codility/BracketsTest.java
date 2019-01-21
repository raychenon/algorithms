package com.raychenon.codility;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 6/1/19
 * Time: 9:30 PM
 * https://codility.com/programmers/task/brackets/
 */
public class BracketsTest {

    @Test
    public void assertBracketsSolution() {
        assertEquals(Brackets.hasBalancedBrackets("{[()()]}"), true);
        assertEquals(Brackets.hasBalancedBrackets("([)>>()]"), false);
        assertEquals(Brackets.hasBalancedBrackets("([)()]"), false);

        assertEquals(Brackets.hasBalancedBrackets("{[()<>()]}"), true);
        // can contain other characters
        assertEquals(Brackets.hasBalancedBrackets("{an}"), true);
    }

    @Test
    public void assertEmptyBracketsSolution() {

        assertEquals(Brackets.hasBalancedBrackets(""), true);
        assertEquals(Brackets.hasBalancedBrackets(null), true);
    }
}
