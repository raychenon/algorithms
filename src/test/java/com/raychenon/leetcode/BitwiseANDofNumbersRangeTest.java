package com.raychenon.leetcode;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 25/4/2020
 * https://leetcode.com/problems/bitwise-and-of-numbers-range/
 */
public class BitwiseANDofNumbersRangeTest {

    private static BitwiseANDofNumbersRange instance;

    @BeforeClass
    public static void setUp() {
        instance = new BitwiseANDofNumbersRange();
    }

    @Test
    public void and1Test() {
        assertBitwiseANDWithVariousMethods(5, 7, 4);
    }

    @Test
    public void and2Test() {
        assertBitwiseANDWithVariousMethods(0, 1, 0);
    }

    @Test
    public void ANbigRangeTest() {
        assertBitwiseANDWithVariousMethods(0, 2147483647, 0);
    }

    @Test
    public void ANbigRange2Test() {
        assertBitwiseANDWithVariousMethods(2147483646, 2147483647, 2147483646);
    }


    void assertBitwiseANDWithVariousMethods(int m, int n, int expected) {
        assertEquals(expected, instance.rangeBitwiseAnd(m, n));
    }


}
