package com.raychenon.leetcode;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 2019-11-24
 * https://leetcode.com/problems/rotated-digits/
 */
public class RotatedDigitsTest {

    private static RotatedDigits instance;

    @BeforeClass
    public static void setUp() {
        instance = new RotatedDigits();
    }

    @Test
    public void test10() {
        evaluateRotatedDigits(4, 10);
    }

    @Test
    public void test20() {
        evaluateRotatedDigits(9, 20);
    }

    @Test
    public void test1000() {
        evaluateRotatedDigits(316, 1000);
    }


    private void evaluateRotatedDigits(int expected, int N) {
        assertEquals(expected, instance.rotatedDigits(N));
    }

}
