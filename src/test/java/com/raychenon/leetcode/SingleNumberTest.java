package com.raychenon.leetcode;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 6/4/2020
 * https://leetcode.com/problems/single-number/
 */
public class SingleNumberTest {

    private static SingleNumber singleNumber;

    @BeforeClass
    public static void setUp() {
        singleNumber = new SingleNumber();
    }


    @Test
    public void example1Test() {
        int[] nums = {2, 2, 1};
        assertEquals(1, singleNumber.singleNumber(nums));
    }

    @Test
    public void example2Test() {
        int[] nums = {4, 1, 2, 1, 2};
        assertEquals(4, singleNumber.singleNumber(nums));
    }

}
