package com.raychenon.leetcode;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 24/3/2020
 * https://leetcode.com/problems/contains-duplicate/
 */
public class ContainsDuplicateTest {

    private static ContainsDuplicate instance;

    @BeforeClass
    public static void setUp() {
        instance = new ContainsDuplicate();
    }


    @Test
    public void containsTest() {
        int[] nums = {1, 2, 3, 1};
        assertWithVariousMethods(true, nums);
    }

    @Test
    public void noDuplicateTest() {
        int[] nums = {1, 2, 3, 4};
        assertWithVariousMethods(false, nums);
    }

    @Test
    public void longArrayTest() {
        int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        assertWithVariousMethods(true, nums);
    }

    void assertWithVariousMethods(boolean expected, int[] array) {
        assertEquals(expected, instance.containsDuplicateSort(array));
        assertEquals(expected, instance.containsDuplicateSet(array));
    }


}
