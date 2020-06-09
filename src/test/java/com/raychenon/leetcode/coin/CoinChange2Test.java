package com.raychenon.leetcode.coin;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 8/6/2020
 * https://leetcode.com/problems/coin-change-2/
 */
public class CoinChange2Test {

    private static CoinChange2 coinChange2;

    @BeforeClass
    public static void setUp() {
        coinChange2 = new CoinChange2();
    }

    @Test
    public void example1Test() {
        assertEquals(4, coinChange2.change(5, new int[]{1, 2, 5}));
    }

    @Test
    public void example2Test() {
        assertEquals(0, coinChange2.change(3, new int[]{2}));
    }

    @Test
    public void example3Test() {
        assertEquals(1, coinChange2.change(10, new int[]{10}));
    }

}
