package com.raychenon.leetcode;

import junit.framework.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * User: raychenon
 * Date: 2020-02-02
 * https://leetcode.com/problems/merge-intervals/
 */
public class MergeIntervalsTest {

    private static MergeIntervals instance;

    @BeforeClass
    public static void setUp() {
        instance = new MergeIntervals();
    }


    @Test
    public void example1Test() {
        int input[][] = {{1, 3}, {8, 10}, {15, 18}};
        int expectedResult[][] = {{1, 6}, {8, 10}, {15, 18}};
        Assert.assertEquals(expectedResult,
                instance.merge(input)
        );
    }


    @Test
    public void example2Test() {
        int input[][] = {{1, 4}, {4, 5}};
        int expectedResult[][] = {{1, 5}};
        Assert.assertEquals(expectedResult,
                instance.merge(input)
        );
    }


    @Test
    public void example3Test() {
        int input[][] = {{1, 4}, {0, 4}};
        int expectedResult[][] = {{0, 4}};
        Assert.assertEquals(expectedResult,
                instance.merge(input)
        );
    }


    @Test
    public void example4Test() {
        int input[][] = {{1, 4}, {0, 1}};
        int expectedResult[][] = {{0, 4}};
        Assert.assertEquals(expectedResult,
                instance.merge(input)
        );
    }


    @Test
    public void example5Test() {
        int input[][] = {{1, 4}, {0, 0}};
        int expectedResult[][] = {{0, 0}, {1, 4}};
        Assert.assertEquals(expectedResult,
                instance.merge(input)
        );
    }

}
