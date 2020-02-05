package com.raychenon.kotlin.leetcode

import junit.framework.Assert
import org.junit.Test

/**
 * User: raychenon
 * Date: 5/2/2020
 * https://leetcode.com/problems/most-common-word/
 */
class MostCommonWordTest {

    @Test
    fun example1Test() {
        Assert.assertEquals(
            "ball", MostCommonWord.mostCommonWord(
                "Bob hit a ball the hit BALL flew far after it was hit.",
                arrayOf("hit")
            )
        )
    }

}