package com.raychenon.leetcode;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 13/5/2020
 * https://leetcode.com/problems/single-element-in-a-sorted-array/
 */
public class SingleElementinaSortedArrayTest {


    private static SingleElementinaSortedArray singleElementinaSortedArray;

    @BeforeClass
    public static void setUp() {
        singleElementinaSortedArray = new SingleElementinaSortedArray();
    }

    @Test
    public void example1Test() {
        assertSingleNonDuplicateMethods(2, new int[]{1, 1, 2, 3, 3, 4, 4, 8, 8});
    }

    @Test
    public void example2Test() {
        assertSingleNonDuplicateMethods(10, new int[]{3, 3, 7, 7, 10, 11, 11});
    }
    
    @Test
    public void exampleSingleAtLastTest() {
        assertSingleNonDuplicateMethods(12, new int[]{3, 3, 7, 7, 11, 11, 12});
    }

    void assertSingleNonDuplicateMethods(int expectedValue, int[] nums) {
        assertEquals(expectedValue, singleElementinaSortedArray.singleNonDuplicateXOR(nums));
        assertEquals(expectedValue, singleElementinaSortedArray.singleNonDuplicateBrut(nums));
        assertEquals(expectedValue, singleElementinaSortedArray.singleNonDuplicateBinarySearch(nums));
    }


}
