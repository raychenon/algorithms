package com.raychenon.leetcode;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 25/7/2020
 * https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
 */
public class FindMinimuminRotatedSortedArrayTest {


    private static FindMinimuminRotatedSortedArray instance;

    @BeforeClass
    public static void setUp() {
        instance = new FindMinimuminRotatedSortedArray();
    }

    @Test
    public void findMinimumTest() {
        int[] array = {3, 4, 5, 1, 2};
        assertMethods(1, array);
    }

    @Test
    public void find0Test() {
        int[] array = {4, 5, 6, 7, 0, 1, 2};
        assertMethods(0, array);
    }

    @Test
    public void findMinimumleftShiftTest() {
        int[] array = {7, 0, 1, 2, 4, 5, 6};
        assertMethods(0, array);
    }

    @Test
    public void uniqueElementTest() {
        int[] array = {3};
        assertMethods(3, array);
    }

    public void assertMethods(int expectedDuplicate, int[] array) {
        assertEquals(expectedDuplicate, instance.findMin(array));
        assertEquals(expectedDuplicate, instance.findMinBF(array));
        assertEquals(expectedDuplicate, instance.findMinBFstream(array));
    }

}
