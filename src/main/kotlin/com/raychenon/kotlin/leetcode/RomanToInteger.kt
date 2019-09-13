package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 2019-09-13
 * https://leetcode.com/problems/roman-to-integer/
 */
object RomanToInteger {

    private val romanToIntMap: Map<Char, Int> = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )

    /**
     * time complexity: O(n) where n is the length of the String
     * space complexity: 0(1) constant
     */
    fun romanToInt(s: String): Int {

        var sum: Int = 0
        for (i in 0..s.length - 1) {
            val chr = s.get(i)
            val value = convertToInt(chr)
            // Trick: if the next Char has a bigger value then the current int value is negative
            // ex : IV = 4 = -1+5
            // IX = -1+10 = 9
            val signedValue = if ((i + 1) < s.length && value < convertToInt(s.get(i + 1))) -value else value
            sum = sum + signedValue
        }
        return sum
    }

    private fun convertToInt(c: Char): Int {
        return romanToIntMap.getOrDefault(c, 0)
    }

}