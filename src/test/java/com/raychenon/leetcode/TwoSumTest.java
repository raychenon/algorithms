package com.raychenon.leetcode;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * User: raychenon
 * Date: 14/4/2020
 * https://leetcode.com/problems/two-sum/
 */
public class TwoSumTest {


    private static TwoSum twoSum;

    @BeforeClass
    public static void setUp() {
        twoSum = new TwoSum();
    }

    @Test
    public void name() {
    }

    @Test
    public void example1Test() {
        assertArrayEquals(new int[]{0, 1}, twoSum.twoSum(new int[]{2, 7, 11, 15}, 9));
    }

    @Test
    public void example2Test() {
        assertArrayEquals(new int[]{2, 4}, twoSum.twoSum(new int[]{1, 5, 2, 3, 7, 11, 15}, 9));
    }

    @Test
    public void twoSumNotFoundTest() {
        assertArrayEquals(new int[]{}, twoSum.twoSum(new int[]{2, 7, 11, 15}, 0));
    }

}
