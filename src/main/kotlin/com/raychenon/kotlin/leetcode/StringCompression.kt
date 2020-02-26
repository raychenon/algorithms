package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 26/2/2020
 * https://leetcode.com/problems/string-compression/
 */
object StringCompression {

    fun compress(chars: CharArray): Int {

        if (chars.isEmpty() || chars.size == 0) {
            return 0
        }

        var str = StringBuilder()
        var left = 0
        var right = 0
        val n = chars.size

        while (left < n) {
            while ((right < n) && chars.get(left) == chars.get(right)) {
                right++
            }
            str.append(chars.get(left))
            val freq = right - left
            if (freq > 1) {
                str.append(freq)
            }
            left = right
        }

        // print("compress, str = ${str.toString()} \n")
        return str.length
    }
}