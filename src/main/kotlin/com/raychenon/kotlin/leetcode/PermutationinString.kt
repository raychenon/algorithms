package com.raychenon.kotlin.leetcode

import java.util.*

/**
 * User: raychenon
 * Date: 19/5/2020
 * https://leetcode.com/problems/permutation-in-string
 *
 * Given two strings s1 and s2, write a function to return true if s2 contains the permutation of s1.
 * In other words, one of the first string's permutations is the substring of the second string.
 */
object PermutationinString {

    fun checkInclusion(s1: String, s2: String): Boolean {
        val frequency1 = IntArray(26)
        for (c in s1) {
            frequency1[c - 'a']++
        }

        val n1 = s1.length
        val n2 = s2.length
        val frequency2 = IntArray(26)
        for (i in 0 until n2) {
            frequency2[s2[i] - 'a']++

            if (i >= n1) {
                frequency2[s2[i - n1] - 'a']--
            }

            if (Arrays.equals(frequency1, frequency2)) return true
        }
        return false
    }
}