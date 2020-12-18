package com.raychenon.leetcode;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * User: raychenon
 * Date: 18/12/2020
 * https://leetcode.com/problems/sum-of-absolute-differences-in-a-sorted-array/discuss/969761/Illustrations-for-O(n)-formula-Java-Kotlin-Python
 */
public class SumofAbsoluteDifferencesinaSortedArrayTest {

    private static SumofAbsoluteDifferencesinaSortedArray instance;

    @BeforeClass
    public static void setUp() {
        instance = new SumofAbsoluteDifferencesinaSortedArray();
    }

    @Test
    public void example1() {
        evaluateSumofAbsoluteDifferencesinaSortedArray(new int[]{4, 3, 5}, new int[]{2, 3, 5});
    }

    @Test
    public void example2() {
        evaluateSumofAbsoluteDifferencesinaSortedArray(new int[]{24, 15, 13, 15, 21}, new int[]{1, 4, 6, 8, 10});
    }

    private void evaluateSumofAbsoluteDifferencesinaSortedArray(int[] expected, int[] input) {
        Assert.assertArrayEquals(expected, instance.getSumAbsoluteDifferences(input));
    }

}
