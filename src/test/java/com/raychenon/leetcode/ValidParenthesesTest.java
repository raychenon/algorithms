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
    public void test_when_validParentheses() {
        assertEquals(true, validParentheses.isValid("()"));
    }

    @Test
    public void startByClosingTest() {
        assertEquals(false, validParentheses.isValid("]["));
    }

    @Test
    public void test_when_coupleOfParentheses() {
        assertEquals(true, validParentheses.isValid("[]()"));
    }

}
