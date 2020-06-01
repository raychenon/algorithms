package com.raychenon.kotlin.leetcode

import junit.framework.TestCase
import org.junit.Test

/**
 * User: raychenon
 * Date: 1/6/2020
 * https://leetcode.com/problems/edit-distance/
 */
class EditDistanceTest {

    @Test
    fun example1Test() {
        assertEditDistance(3, "horse", "ros")
    }

    @Test
    fun example2Test() {
        assertEditDistance(5, "intention", "execution")
    }

    @Test
    fun example3Test() {
        assertEditDistance(10, "zoologicoarchaeologist", "zoogeologist")
    }

    fun assertEditDistance(expected: Int, word1: String, word2: String) {
        TestCase.assertEquals(expected, EditDistance.minDistance(word1, word2))
    }
}