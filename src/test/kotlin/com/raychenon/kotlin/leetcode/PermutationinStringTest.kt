package com.raychenon.kotlin.leetcode

import junit.framework.TestCase
import org.junit.Test

/**
 * User: raychenon
 * Date: 19/5/2020
 * https://leetcode.com/problems/permutation-in-string
 */
class PermutationinStringTest {

    @Test
    fun example1Test() {
        assertPermutationinStringMethods("ab", "eidbaooo", true)
    }

    @Test
    fun example2Test() {
        assertPermutationinStringMethods("ab", "eidboaoo", false)
    }

    @Test
    fun example3Test() {
        assertPermutationinStringMethods("acb", "ooeabidabcoaoo", true)
    }

    private fun assertPermutationinStringMethods(
        s1: String,
        s2: String,
        expected: Boolean
    ) {
        TestCase.assertEquals(
            PermutationinString.checkInclusion(s1, s2),
            expected
        )
    }
}