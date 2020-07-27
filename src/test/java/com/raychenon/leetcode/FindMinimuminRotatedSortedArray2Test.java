package com.raychenon.leetcode;

import junit.framework.TestCase;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * User: raychenon
 * Date: 27/7/2020
 * https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/
 */
public class FindMinimuminRotatedSortedArray2Test {


    private static FindMinimuminRotatedSortedArray2 instance;

    @BeforeClass
    public static void setUp() {
        instance = new FindMinimuminRotatedSortedArray2();
    }

    @Test
    public void findMinimumTest() {
        int[] array = {4, 5, 5, 6, 6, 7, 0, 1, 2};
        assertFindMin(0, array);
        assertFindMax(7, array);
    }

    @Test
    public void example1Test() {
        int[] array = {1, 3, 5};
        assertFindMin(1, array);
        assertFindMax(5, array);
    }

    @Test
    public void example2Test() {
        int[] array = {2, 2, 2, 0, 1};
        assertFindMin(0, array);
        assertFindMax(2, array);
    }

    void assertFindMin(int expectedDuplicate, int[] array) {
        TestCase.assertEquals(expectedDuplicate, instance.findMin(array));
    }

    void assertFindMax(int expectedDuplicate, int[] array) {
        TestCase.assertEquals(expectedDuplicate, instance.findMax(array));
    }

}
