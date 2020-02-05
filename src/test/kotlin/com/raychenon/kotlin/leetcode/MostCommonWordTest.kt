package com.raychenon.kotlin.leetcode

import junit.framework.TestCase
import org.junit.Test

/**
 * User: raychenon
 * Date: 5/2/2020
 * https://leetcode.com/problems/most-common-word/
 */
class MostCommonWordTest {

    @Test
    fun example1Test() {
        TestCase.assertEquals(
            "ball", MostCommonWord.mostCommonWord(
                "Bob hit a ball, the hit BALL flew far after it was hit.",
                arrayOf("hit")
            )
        )
    }

    @Test
    fun example2Test() {
        TestCase.assertEquals(
            "b", MostCommonWord.mostCommonWord(
                "a, a, a, a, b,b,b,c, c",
                arrayOf("a")
            )
        )
    }

}