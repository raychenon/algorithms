package com.raychenon.leetcode;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 28/3/2020
 * https://leetcode.com/problems/find-the-duplicate-number/
 */
public class FindTheDuplicateNumberTest {

    private static FindTheDuplicateNumber instance;

    @BeforeClass
    public static void setUp() {
        instance = new FindTheDuplicateNumber();
    }

    @Test
    public void example1Test() {
        int[] array = {1, 3, 4, 2, 2};
        assertMethods(2, array);
    }

    @Test
    public void example2Test() {
        int[] array = {3, 1, 3, 4, 2};
        assertMethods(3, array);
    }

    @Test
    public void noDuplicateTest() {
        int[] array = {3};
        assertMethods(-1, array);
    }

    public void assertMethods(int expectedDuplicate, int[] array) {
        assertEquals(expectedDuplicate, instance.findDuplicate(array));
        assertEquals(expectedDuplicate, instance.findDuplicateMemory(array));
    }
}
