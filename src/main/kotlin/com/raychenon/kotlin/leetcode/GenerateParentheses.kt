package com.raychenon.kotlin.leetcode

import java.util.*

/**
 * User: raychenon
 * Date: 2019-11-05
 * https://leetcode.com/problems/generate-parentheses/
 */
object GenerateParentheses {

    fun generateParenthesisClosureNumber(n: Int): List<String> {
        val ans = LinkedList<String>()
        if (n == 0) {
            ans.add("")
        } else {
            for (i in 0 until n) {
                for (left in generateParenthesisClosureNumber(i)) {
                    for (right in generateParenthesisClosureNumber(n - 1 - i)) {
                        ans.add("(" + left + ")" + right)
                    }
                }
            }
        }
        return ans
    }

    fun generateParenthesis(n: Int): List<String> {
        var list = mutableListOf<String>()
        backtrack(list, "", 0, 0, n)
        return list
    }

    private fun backtrack(list: MutableList<String>, cur: String, open: Int, close: Int, max: Int) {
        if (cur.length == 2 * max) {
            list.add(cur)
            return
        }
        if (open < max) backtrack(list, cur + "(", open + 1, close, max)
        if (close < open) backtrack(list, cur + ")", open, close + 1, max)
    }
}