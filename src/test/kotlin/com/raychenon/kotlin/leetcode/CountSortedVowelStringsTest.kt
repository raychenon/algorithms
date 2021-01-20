package com.raychenon.kotlin.leetcode

import junit.framework.TestCase
import org.junit.Test

/**
 * User: raychenon
 * Date: 21/1/2021
 * https://leetcode.com/problems/count-sorted-vowel-strings/
 */
class CountSortedVowelStringsTest {

    @Test
    fun example1Test() {
        assertCountSortedVowel(5, 1)
    }

    @Test
    fun example2Test() {
        assertCountSortedVowel(15, 2)
    }

    @Test
    fun example3Test() {
        assertCountSortedVowel(66045, 33)
    }

    fun assertCountSortedVowel(expected: Int, n: Int) {
        TestCase.assertEquals(expected, CountSortedVowelStrings.countVowelStringsDPBottomUp(n))
        TestCase.assertEquals(expected, CountSortedVowelStrings.countVowelStringsDPBottomUp1D(n))
    }
}