package com.raychenon.leetcode;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * User: raychenon
 * Date: 2019-08-28
 * https://leetcode.com/problems/powx-n
 */
public class PowTest {

    private static Pow instance;

    @BeforeClass
    public static void setUp() {
        instance = new Pow();
    }

    @Test
    public void testPowExample1() {
        assertPowerMethods(1024.0, 2.0, 10, "test example 1");
    }

    @Test
    public void testPowExample2() {
        assertPowerMethods(9.261, 2.10, 3, "test example 2");
    }

    @Test
    public void testPowerNegativeExponent() {
        assertPowerMethods(0.25, 2.0, -2, "test negative exponent");
    }

    @Test
    public void testPowerofZero() {
        assertPowerMethods(1.0, 0.44528, 0, "test power of zero");
    }

    @Test
    public void testPowerofBigExponent() {
        assertPowerMethods(1.0, 1.0, 2147483647, "test power of big exponent");
    }

    @Test
    public void testPowerofBigNegativeExponent() {
        assertPowerMethods(0.0, 2.0, -2147483648, "test power of big negative exponent");
    }


    private double delta = 0.001;

    private void assertPowerMethods(Double expected, Double x, int n, String msg) {
        Assert.assertEquals(msg, expected, instance.myPowRec(x, n), delta);
    }


}
