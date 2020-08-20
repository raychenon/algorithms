package com.raychenon.leetcode.besttimetobuyandsell;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 17/8/2020
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/
 */
public class BestTimetoBuyandSellStock3Test {


    private static BestTimetoBuyandSellStock3 instance;

    @BeforeClass
    public static void setUp() {
        instance = new BestTimetoBuyandSellStock3();
    }

    @Test
    public void example1Test() {
        int[] prices = {3, 3, 5, 0, 0, 3, 1, 4};
        assertBestTimetoBuyandSellStock3(6, prices);
    }

    @Test
    public void example2Test() {
        int[] prices = {1, 2, 3, 4, 5};
        assertBestTimetoBuyandSellStock3(4, prices);
    }

    @Test
    public void example3Test() {
        int[] prices = {7, 6, 4, 3, 1};
        assertBestTimetoBuyandSellStock3(0, prices);
    }

    @Test
    public void sizeLessThan2Test() {
        int[] prices = {1};
        assertBestTimetoBuyandSellStock3(0, prices);
    }
    
    void assertBestTimetoBuyandSellStock3(int expected, int[] prices) {
        assertEquals(expected, instance.maxProfit(prices));
        assertEquals(expected, instance.maxProfitBidirectionalDP(prices));
    }

}
