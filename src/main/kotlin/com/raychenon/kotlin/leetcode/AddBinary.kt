package com.raychenon.kotlin.leetcode

import java.math.BigInteger

/**
 * User: raychenon
 * Date: 4/3/2020
 * https://leetcode.com/problems/add-binary
 */
object AddBinary {

    fun addBinary(a: String, b: String): String {
        var x = BigInteger(a, 2)
        var y = BigInteger(b, 2)
        var zero = BigInteger("0", 2)
        var carry: BigInteger
        var answer: BigInteger

        while (y.compareTo(zero) != 0) {
            answer = x.xor(y)
            carry = x.and(y).shiftLeft(1)
            x = answer
            y = carry
        }
        return x.toString(2)
    }
}