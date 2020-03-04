package com.raychenon.leetcode;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 3/3/2020
 * https://leetcode.com/problems/add-binary
 */
public class AddBinaryTest {
    
    private static AddBinary addBinary;

    @BeforeClass
    public static void setUp() {
        addBinary = new AddBinary();
    }

    @Test
    public void test_100() {
        assertEquals("100", addBinary.addBinary("11", "1"));
    }

    @Test
    public void test_10101() {
        assertEquals("10101", addBinary.addBinary("1010", "1011"));
    }

}