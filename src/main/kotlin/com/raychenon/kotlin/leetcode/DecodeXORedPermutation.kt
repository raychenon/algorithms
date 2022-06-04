package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 24/1/2021
 * Explanations
 * https://leetcode.com/problems/decode-xored-permutation/discuss/1031840/Explanations-XOR-and-1st-element-Java-Kotlin-Python
 */
object DecodeXORedPermutation {

    /**
     * encoded[i] = perm[i] XOR perm[i + 1] implies
     * perm[i+1] = perm[i] XOR encoded[i]
     * So we can loop to find the next perm element. But se still need to find perm[0].
     *
     * The array "perm" is a permutation of the first n positive integers, where n is always odd.
     *
     * Explanations https://leetcode.com/problems/decode-xored-permutation/discuss/1031840/Explanations-XOR-and-1st-element-Java-Kotlin-Python
     * Time complexity: O(n)
     * Space complexity: O(n)
     */
    fun decode(encoded: IntArray): IntArray {
        var first = 0
        val n = encoded.size + 1
        for (i in 1 until n + 1) {
            first = first xor i
            if (i < n && i % 2 == 1) {
                first = first xor encoded[i]
            }
        }

        val perm = IntArray(n)
        perm[0] = first
        for (i in 0 until n - 1) {
            perm[i + 1] = perm[i] xor encoded[i]
        }

        return perm
    }
}