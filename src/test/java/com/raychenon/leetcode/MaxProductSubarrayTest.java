package com.raychenon.leetcode;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 2019-11-13
 * https://leetcode.com/problems/maximum-product-subarray/
 */
public class MaxProductSubarrayTest {


    private static MaxProductSubarray instance;

    @BeforeClass
    public static void setUp() {
        instance = new MaxProductSubarray();
    }

    @Test
    public void example1Test() {
        float[] nums = {2f, 3f, -2f, 4f};
        assertMaxProduct(6f, nums);
    }

    @Test
    public void example2Test() {
        float[] nums = {2f, 3f, 3f, -2f, 4f};
        assertMaxProduct(18f, nums);
    }

    @Test
    public void productSize2Test() {
        float[] nums = {0f, 2f};
        assertMaxProduct(2f, nums);
    }

    @Test
    public void productSize3Test() {
        float[] nums = {-2f, 0.1f, -1f};
        assertMaxProduct(0.2f, nums);
    }

    @Test
    public void onlyPositiveFloatTest() {
        float[] nums = {0.1f, 0.9f, 0.5f};
        assertMaxProduct(0.9f, nums);
    }

    @Test
    public void intNFloatTest() {
        float[] nums = {-50f, -0.1f, 0.9f, -0.8f, 0.5f};
        assertMaxProduct(5f, nums);
    }

    @Test
    public void emptyArrayTest() {
        float[] nums = {};
        assertMaxProduct(0f, nums);
    }

    @Test
    public void nullArrayTest() {
        float[] nums = null;
        assertMaxProduct(0f, nums);
    }

    void assertMaxProduct(Float expected, float[] nums) {
        assertEquals(expected, instance.maxProductBrute(nums));
    }


}
