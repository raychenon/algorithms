package com.raychenon.leetcode;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

/**
 * User: raychenon
 * Date: 2019-10-19
 * https://leetcode.com/problems/sort-array-by-parity/
 */
public class SortArrayByParityTest {

    private static SortArrayByParity sortArrayByParity;

    @BeforeClass
    public static void setUp() {
        sortArrayByParity = new SortArrayByParity();
    }

    @Test
    public void example1Test() {
        int[] input = new int[]{3, 1, 2, 4};
        int[] output = new int[]{2, 4, 3, 1};
        Assert.assertTrue(Arrays.equals(output, sortArrayByParity.sortArrayByParity(input)));
    }
}
