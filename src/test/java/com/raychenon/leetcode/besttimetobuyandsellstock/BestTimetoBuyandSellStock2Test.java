package com.raychenon.leetcode.besttimetobuyandsellstock;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 5/4/2020
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iiss
 */
public class BestTimetoBuyandSellStock2Test {

    private static BestTimetoBuyandSellStock2 instance;

    @BeforeClass
    public static void setUp() {
        instance = new BestTimetoBuyandSellStock2();
    }


    @Test
    public void example1Test() {
        int[] nums = {7, 1, 5, 3, 6, 4};
        assertWithVariousMethods(7, nums);
    }

    @Test
    public void example2Test() {
        int[] nums = {1, 2, 3, 4, 5};
        assertWithVariousMethods(4, nums);
    }

    @Test
    public void example3Test() {
        int[] nums = {7, 6, 4, 3, 1};
        assertWithVariousMethods(0, nums);
    }


    void assertWithVariousMethods(int expected, int[] array) {
        assertEquals(expected, instance.maxProfit(array));
    }
    
}
