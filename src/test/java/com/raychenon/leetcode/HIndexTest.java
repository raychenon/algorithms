package com.raychenon.leetcode;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 11/8/2020
 * https://leetcode.com/problems/h-index/
 */
public class HIndexTest {

    private static HIndex hIndex;

    @BeforeClass
    public static void setUp() {
        hIndex = new HIndex();
    }

    @Test
    public void example1Test() {
        evaluateHIndex(3, new int[]{3, 0, 6, 1, 5});
    }

    private void evaluateHIndex(int expected, int[] citations) {
        assertEquals(expected, hIndex.hIndex(citations));
    }

}
