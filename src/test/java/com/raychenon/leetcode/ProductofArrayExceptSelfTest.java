package com.raychenon.leetcode;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * User: raychenon
 * Date: 2019-08-18
 * https://leetcode.com/problems/product-of-array-except-self/
 */
public class ProductofArrayExceptSelfTest {

    private static ProductofArrayExceptSelf instance;

    @BeforeClass
    public static void setUp() {
        instance = new ProductofArrayExceptSelf();
    }

    @Test
    public void testProductOfArray() {
        int input[] = {1, 2, 3, 4};
        int output[] = {24, 12, 8, 6};
        assertArrays(output, instance.productExceptSelf(input));
    }

    @Test
    public void testProductOfArraySizeZero() {
        // Given an array nums of n integers where n > 1
        int input[] = {};
        int output[] = {};
        assertArrays(output, instance.productExceptSelf(input));
    }

    @Test
    public void testProductOfArray_when_containsZero() {
        int input[] = {1, 0};
        int output[] = {0, 1};
        assertArrays(output, instance.productExceptSelf(input));
    }


    public void assertArrays(int[] input, int[] output) {
        assertArrayEquals(output, instance.productExceptSelf(input));
        assertArrayEquals(output, instance.productExceptSelfConstantSpace(input));
    }

}
