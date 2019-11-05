package com.raychenon.kotlin.leetcode

import junit.framework.Assert.assertEquals
import org.junit.Test
import java.util.*

/**
 * User: raychenon
 * Date: 2019-11-05
 * https://leetcode.com/problems/generate-parentheses/
 */
class GenerateParenthesesTest {

    @Test
    fun size1Test() {
        val expectedResults = Arrays.asList("()")
        assertEquals(expectedResults, GenerateParentheses.generateParenthesis(1))
    }

    @Test
    fun size3Test() {
        val expectedResults = Arrays.asList(
            "((()))",
            "(()())",
            "(())()",
            "()(())",
            "()()()"
        )
        assertEquals(expectedResults, GenerateParentheses.generateParenthesis(3))
    }
}