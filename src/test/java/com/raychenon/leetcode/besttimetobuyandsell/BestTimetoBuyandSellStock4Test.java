package com.raychenon.leetcode.besttimetobuyandsell;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 19/10/2020
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iv
 */
public class BestTimetoBuyandSellStock4Test {

    private static BestTimetoBuyandSellStock4 instance;

    @BeforeClass
    public static void setUp() {
        instance = new BestTimetoBuyandSellStock4();
    }


    @Test
    public void example1Test() {
        int[] prices = {2, 4, 1};
        assertBestTimetoBuyandSellStock4(2, prices, 2);
    }

    @Test
    public void example2Test() {
        int[] prices = {3, 2, 6, 5, 0, 3};
        assertBestTimetoBuyandSellStock4(2, prices, 7);
    }

    void assertBestTimetoBuyandSellStock4(int k, int[] prices, int expectedProfit) {
        assertEquals(expectedProfit, instance.maxProfit(k, prices));
    }

}
