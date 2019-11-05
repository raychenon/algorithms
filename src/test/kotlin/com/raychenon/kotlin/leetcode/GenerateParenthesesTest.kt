package com.raychenon.kotlin.leetcode

import junit.framework.Assert.assertEquals
import junit.framework.Assert.assertTrue
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
        val expectedResults = listOf("()")
        assertEquals(expectedResults, GenerateParentheses.generateParenthesis(1))
        assertEquals(expectedResults, GenerateParentheses.generateParenthesisClosureNumber(1))
    }

    @Test
    fun size3Test() {
        val expectedResults = listOf(
            "((()))",
            "(()())",
            "(())()",
            "()(())",
            "()()()"
        )
        assertEquals(expectedResults, GenerateParentheses.generateParenthesis(3))
        assertTrue(GenerateParentheses.generateParenthesisClosureNumber(3).containsAll(expectedResults))
    }
}