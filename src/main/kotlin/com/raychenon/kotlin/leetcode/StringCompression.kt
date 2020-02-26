package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 26/2/2020
 * https://leetcode.com/problems/string-compression/
 */
object StringCompression {

    fun compress(chars: CharArray): Int {

        if(chars.isEmpty() || chars.size == 0 ){
            return 0
        }
        
        val DEFAULT_CHAR = ' '
        var accChar: Char = DEFAULT_CHAR
        var accCount: Int = 0
        var str = StringBuilder()
        var i = 0

        while (i++ < chars.size) {
            var c = chars.get(i)
            accChar = c
            while (i < chars.size && chars.get(i++) == accChar) {
                accCount++
            }
            str.append(accChar)

            if (accCount > 1) { str.append(accCount) }
        }

        print("str ${str.toString()}")
        return str.length
    }
}