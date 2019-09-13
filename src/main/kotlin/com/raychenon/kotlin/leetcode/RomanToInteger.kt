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

    fun romanToInt(s: String): Int {

        var sum: Int = 0
        for (chr in s.toCharArray()) {
            sum = sum + romanToIntMap.getOrDefault(chr, 0)

        }
        return sum
    }
}