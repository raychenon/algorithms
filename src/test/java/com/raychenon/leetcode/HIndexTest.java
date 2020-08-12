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

    @Test
    public void hIndexEqualLengthTest() {
        evaluateHIndex(6, new int[]{12, 7, 8, 9, 10, 11});
    }

    @Test
    public void hIndexValueNotInCitations() {
        evaluateHIndex(5, new int[]{12, 7, 8, 9, 10, 3});
    }


    @Test
    public void only0Test() {
        evaluateHIndex(0, new int[]{0, 0, 0});
    }

    private void evaluateHIndex(int expected, int[] citations) {
        assertEquals(expected, hIndex.hIndex(citations));
        assertEquals(expected, hIndex.hIndexBucketSort(citations));
    }

}
