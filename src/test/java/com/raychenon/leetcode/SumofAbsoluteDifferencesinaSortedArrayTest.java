package com.raychenon.leetcode;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

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
    public void aabbcccTest() {
        evaluate(new int[]{4, 3, 5}, new int[]{2, 3, 5});
    }

    private void evaluate(int[] expected, int[] input) {
        assertEquals(expected, instance.getSumAbsoluteDifferences(input));
    }

}
