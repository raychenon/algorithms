package com.raychenon.kotlin.leetcode

import java.util.Stack

/**
 * User: raychenon
 * Date: 2019-09-05
 * https://leetcode.com/problems/valid-parentheses/
 */
object ValidParentheses {

    /**
     * time complexity : O(n)
     * space complexity : O(n) for only opening parentheses
     * The trick is to store the different parentheses in FIFO structure: Stack
     * An opening parenthese must be closed by its closing counterpart.
     */
    fun isValid(s: String): Boolean {
        if (s.isEmpty()) return true

        val stack = Stack<Char>()
        val openingSet = setOf('(', '[', '(', '<')
        val map = mapOf(')' to '(', ']' to '[', '>' to '<', ')' to '(')

        for (c in s) {
            // opening parentheses
            if (openingSet.contains(c)) {
                stack.push(c)
            }
            // closing pararentheses
            if (map.containsKey(c)) {
                // De Morgan's laws, complement of (!stack.isEmpty() && map.getValue(c) == stack.peek())
                if (stack.isEmpty() || map.getValue(c) != stack.peek()) {
                    // if more closing parenthese, can already fast-exit
                    return false
                } else {
                    stack.pop()
                }
            }
        }

        return stack.isEmpty()
    }
}
