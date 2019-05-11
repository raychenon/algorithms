package com.raychenon.kotlin.hackerrank.warmup

import org.junit.Assert
import org.junit.Test

/**
 * User: raychenon
 * Date: 2019-05-11
 * https://www.hackerrank.com/challenges/bon-appetit/problem
 */
class BonAppetitTest {

    @Test
    fun assertBillIsSplitCorrectly() {
        Assert.assertEquals("Bon Appetit", BonAppetit.calculateBillCharged(arrayOf(3, 10, 2, 9), 1, 7))
    }

    @Test
    fun assertAnnaIsRefundedCorrectly() {
        Assert.assertEquals("5", BonAppetit.calculateBillCharged(arrayOf(3, 10, 2, 9), 1, 12))
    }
}