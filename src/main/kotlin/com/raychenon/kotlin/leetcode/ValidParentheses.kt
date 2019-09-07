package com.raychenon.kotlin.leetcode

import java.util.*

/**
 * User: raychenon
 * Date: 2019-09-05
 * https://leetcode.com/problems/valid-parentheses/
 */
object ValidParentheses {
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
                if (!stack.isEmpty()) {
                    if (map.getValue(c) == stack.peek()) {
                        stack.pop()
                    }
                } else {
                    return false
                }
            }
        }

        return stack.isEmpty()
    }
}