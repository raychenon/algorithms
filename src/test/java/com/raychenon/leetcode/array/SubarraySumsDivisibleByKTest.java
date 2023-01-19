package com.raychenon.leetcode.array;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SubarraySumsDivisibleByKTest {

    private static SubarraySumsDivisibleByK subarraySumsDivisibleByK;

    @BeforeClass
    public static void setUp() {
        subarraySumsDivisibleByK = new SubarraySumsDivisibleByK();
    }


    @Test
    public void assertTest1() {
        var array = new int[]{4, 5, 0, -2, -3, 1};
        assertEquals(7, subarraySumsDivisibleByK.subarraysDivByK(array, 5));
    }

    @Test
    public void assertWithOneElement() {
        var array = new int[]{5};
        assertEquals(0, subarraySumsDivisibleByK.subarraysDivByK(array, 9));
    }

    @Test
    public void assertWithOneElementRightDivider() {
        var array = new int[]{5};
        assertEquals(1, subarraySumsDivisibleByK.subarraysDivByK(array, 5));
    }

}
