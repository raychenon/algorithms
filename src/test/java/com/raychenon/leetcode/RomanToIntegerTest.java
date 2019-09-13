package com.raychenon.leetcode;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 2019-09-13
 * https://leetcode.com/problems/roman-to-integer
 */
public class RomanToIntegerTest {

    private static RomanToInteger romanToInteger;

    @BeforeClass
    public static void setUp() {
        romanToInteger = new RomanToInteger();
    }

    @Test
    public void testIII() {
        assertEquals(3, romanToInteger.romanToInt("III"));
    }

    @Test
    public void testXIV() {
        assertEquals(14, romanToInteger.romanToInt("XIV"));
    }

    @Test
    public void testLVIII() {
        assertEquals(58, romanToInteger.romanToInt("LVIII"));
    }

    @Test
    public void testMCMXCIV() {
        assertEquals(1994, romanToInteger.romanToInt("MCMXCIV"));
    }
}
