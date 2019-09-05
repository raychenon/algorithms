package com.raychenon.leetcode;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 2019-09-04
 * https://leetcode.com/problems/valid-parentheses
 */
public class ValidParenthesesTest {

    private static ValidParentheses validParentheses;

    @BeforeClass
    public static void setUp() {
        validParentheses = new ValidParentheses();
    }

    @Test
    public void validAllParenthesesTest() {
        assertEquals(true, validParentheses.isValid("()"));
        assertEquals(true, validParentheses.isValid("[]"));
        assertEquals(true, validParentheses.isValid("{}"));
        assertEquals(true, validParentheses.isValid("<>"));
        // with space
        assertEquals(true, validParentheses.isValid(" ( )"));
    }

    @Test
    public void startByClosingTest() {
        assertEquals(false, validParentheses.isValid("]["));
    }

    @Test
    public void coupleOfParentheses() {
        assertEquals(true, validParentheses.isValid("[]()"));
    }

    @Test
    public void emptyStringTest() {
        assertEquals(true, validParentheses.isValid(null));
    }

}
