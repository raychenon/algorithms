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
        assertEquals(2, instance.findDuplicate(array));
    }

    @Test
    public void example2Test() {
        int[] array = {3, 1, 3, 4, 2};
        assertEquals(3, instance.findDuplicate(array));
    }

}
