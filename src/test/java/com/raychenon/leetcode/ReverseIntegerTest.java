package com.raychenon.leetcode;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 2019-08-25
 * https://leetcode.com/problems/reverse-integer/solution/
 */
public class ReverseIntegerTest {
    private static ReverseInteger reverseInteger;

    @BeforeClass
    public static void setUp() {
        reverseInteger = new ReverseInteger();
    }

    @Test
    public void testReversePositiveInteger() {
        assertEquals(321, reverseInteger.reverse(123));
    }

    @Test
    public void testReverseNegativeInteger() {
        assertEquals(-321, reverseInteger.reverse(-123));
    }

    @Test
    public void testReverseIntegerWith0Ending() {
        assertEquals(21, reverseInteger.reverse(120));
    }

    @Test
    public void testReverseLargeInteger() {
        assertEquals(2147483641, reverseInteger.reverse(1463847412));
    }

    @Test
    public void testReverseLargeNegativeInteger() {
        assertEquals(-2147483641, reverseInteger.reverse(-1463847412));
    }

    @Test
    public void testReverseVeryLargeInteger() {
        // Integer.MAX_VALUE = 0x7fffffff = 2147483647
        assertEquals(1463847412, reverseInteger.reverse(2147483641));
    }

    @Test
    public void testReverseVeryLargeNegativeInteger() {
        // Integer.MIN_VALUE = 0x80000000 = -2147483648
        assertEquals(-1463847412, reverseInteger.reverse(-2147483641));
    }
}
