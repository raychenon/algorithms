package com.raychenon.leetcode;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 15/4/2020
 * https://leetcode.com/problems/contiguous-array/
 */
public class ContiguousArrayTest {

    private static ContiguousArray instance;

    @BeforeClass
    public static void setUp() {
        instance = new ContiguousArray();
    }

    @Test
    public void example1Test() {
        assertEquals(2, instance.findMaxLength(new int[]{0, 1}));
    }

    @Test
    public void example2Test() {
        assertEquals(2, instance.findMaxLength(new int[]{0, 1, 0}));
    }

}
