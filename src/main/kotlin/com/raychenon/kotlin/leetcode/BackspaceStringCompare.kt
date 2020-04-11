package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 9/4/2020
 * https://leetcode.com/problems/backspace-string-compare
 */
object BackspaceStringCompare {

    fun backspaceCompare(S: String, T: String): Boolean {
        return backspaced(S).equals(backspaced(T))
    }

    fun backspaced(s: String): String {
        var str = StringBuilder()
        for (i in 0 until s.length) {
            val c = s.get(i)
            if (c == '#') {
                val len = str.length
                if (len > 0) str.deleteCharAt(len - 1)
            } else {
                str.append(c)
            }
        }
        return str.toString()
    }

}