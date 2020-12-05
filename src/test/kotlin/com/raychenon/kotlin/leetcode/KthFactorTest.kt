package com.raychenon.kotlin.leetcode

import junit.framework.TestCase
import org.junit.Test

/**
 * User: raychenon
 * Date: 5/12/2020
 * https://leetcode.com/problems/the-kth-factor-of-n/
 */
class KthFactorTest {

    @Test
    fun example1Test() {
        evaluateKthFactorMethods(3, 12, 3)
    }

    @Test
    fun example2Test() {
        evaluateKthFactorMethods(7, 7, 2)
    }

    @Test
    fun example3Test() {
        evaluateKthFactorMethods(-1, 4, 4)
    }

    fun evaluateKthFactorMethods(expected: Int, n: Int, k: Int) {
        TestCase.assertEquals(expected, KthFactor.kthFactorLinear(n, k))
        TestCase.assertEquals(expected, KthFactor.kthFactorSqrt(n, k))
    }
}