package com.raychenon.leetcode;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 2019-08-04
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array
 */
public class RemoveDuplicatesSortedArrayTest {

    private static RemoveDuplicatesSortedArray instance;

    @BeforeClass
    public static void setUp() {
        instance = new RemoveDuplicatesSortedArray();
    }

    @Test
    public void testSizeWithoutDuplicates() {
        int sortedArray[] = {1, 3, 5, 6};
        int size = instance.removeDuplicates(sortedArray);
        assertEquals(4, size);
    }

    @Test
    public void testArraySizeAndElements() {
        int sortedArray[] = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int size = instance.removeDuplicates(sortedArray);

        assertEquals(5, size);

        assertEquals(0, sortedArray[0]);
        assertEquals(1, sortedArray[1]);
        assertEquals(2, sortedArray[2]);
        assertEquals(3, sortedArray[3]);
    }

    @Test
    public void testEmptyArray() {
        int sortedArray[] = {};
        int size = instance.removeDuplicates(sortedArray);
        assertEquals(0, size);
    }

    @Test
    public void testArraySizeOne() {
        int sortedArray[] = {10};
        int size = instance.removeDuplicates(sortedArray);
        assertEquals(1, size);
    }


}
