package com.raychenon.kotlin.leetcode.coin

import junit.framework.TestCase
import org.junit.Test

/**
 * User: raychenon
 * Date: 8/6/2020
 * https://leetcode.com/problems/coin-change-2/
 */
class CoinChange2Test {


    @Test
    fun example1Test() {
        TestCase.assertEquals(4, CoinChange2.change(5, intArrayOf(1, 2, 5)))
    }

    @Test
    fun example2Test() {
        TestCase.assertEquals(0, CoinChange2.change(3, intArrayOf(2)))
    }

    @Test
    fun example3Test() {
        TestCase.assertEquals(1, CoinChange2.change(10, intArrayOf(10)))
    }
}