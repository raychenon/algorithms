package com.raychenon.leetcode.besttimetobuyandsell;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 29/7/2020
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/
 */
public class BestTimetoBuyandSellStockWithCooldownTest {

    private static BestTimetoBuyandSellStockWithCooldown instance;

    @BeforeClass
    public static void setUp() {
        instance = new BestTimetoBuyandSellStockWithCooldown();
    }

    @Test
    public void example1Test() {
        int[] nums = {1, 2, 3, 0, 2};
        // (-1+2) + (-0+2) = 3
        evaluteMaxProfit(3, nums);
    }


    @Test
    public void example3Test() {
        int[] nums = {1, 2, 3, 0, 2, 5, 6};
        // (-1+2) + (-0+6) = 1+6 = 7
        evaluteMaxProfit(7, nums);
    }


    void evaluteMaxProfit(int expected, int[] array) {
        assertEquals(expected, instance.maxProfitDPWithStateMachine(array));
        assertEquals(expected, instance.maxProfitDP(array));
    }
}
