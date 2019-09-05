package com.raychenon.kotlin.leetcode

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * User: raychenon
 * Date: 2019-09-05
 * https://leetcode.com/problems/valid-parentheses/
 */
class ValidParenthesesTest {

    @Test
    fun validAllParenthesesTest() {
        assertEquals(true, ValidParentheses.isValid("()"))
        assertEquals(true, ValidParentheses.isValid("[]"))
        assertEquals(true, ValidParentheses.isValid("{}"))
        assertEquals(true, ValidParentheses.isValid("<>"))
        // with space
        assertEquals(true, ValidParentheses.isValid(" ( )"))
    }


    @Test
    fun validNonOnlyParenthesesTest() {
        // with space
        assertEquals(true, ValidParentheses.isValid(" ( )"))
        // with character
        assertEquals(true, ValidParentheses.isValid("[a]"))
    }


    @Test
    fun startByClosingTest() {
        assertEquals(false, ValidParentheses.isValid("]["))
    }

    @Test
    fun coupleOfParentheses() {
        assertEquals(true, ValidParentheses.isValid("[]()"))
    }

    @Test
    fun emptyStringTest() {
        assertEquals(true, ValidParentheses.isValid(""))
    }
}