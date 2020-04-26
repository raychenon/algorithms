package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 26/4/2020
 * https://leetcode.com/problems/bitwise-and-of-numbers-range/
 * <p>
 * Given a range [m, n] where 0 <= m <= n <= 2147483647, return the bitwise AND of all numbers in this range, inclusive.
 * Reformulation: "given two integer numbers, we are asked to find the common prefix of their binary strings."
 */
object BitwiseANDofNumbersRange {

    /**
     * 1 right shift both numbers to the right to get their common prefix (most significant bit)
     * 2 left shift by the number of common prefix
     * Time Complexity: O(1), the number of iterations is bounded by the number of bits that an integer has, which is fixed
     * Space Complexity: O(1)
     *
     * @param m
     * @param n
     * @return
     */
    fun rangeBitwiseAndShift(m: Int, n: Int): Int {
        var m = m
        var n = n
        var shift = 0
        while (m < n) {
            m = m shr 1  // shr == shift value right
            n = n shr 1
            shift++
        }
        return m shl shift
    }

    /**
     * Brian Kernighan's Algorithm : n AND (n-1), the rightmost bit is 0
     * Time Complexity: O(1), the number of iterations is bounded by the number of bits that an integer has, which is fixed
     * Space Complexity: O(1)
     *
     * @param m
     * @param n
     * @return the bitwise AND of all numbers in this range, inclusive
     */
    fun rangeBitwiseAndKernighan(m: Int, n: Int): Int {
        var n = n
        while (m < n) {
            n = n and n - 1
        }
        return m and n
    }


}