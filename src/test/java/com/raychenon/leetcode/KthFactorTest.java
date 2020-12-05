package com.raychenon.leetcode;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 5/12/2020
 * https://leetcode.com/problems/the-kth-factor-of-n/
 */
public class KthFactorTest {

    private static KthFactor instance;

    @BeforeClass
    public static void setUp() {
        instance = new KthFactor();
    }


    @Test
    public void example1Test() {
        evaluateKthFactorMethods(3, 12, 3);
    }

    @Test
    public void example2Test() {
        evaluateKthFactorMethods(7, 7, 2);
    }

    @Test
    public void example3Test() {
        evaluateKthFactorMethods(-1, 4, 4);
    }

    void evaluateKthFactorMethods(int expected, int n, int k) {
        assertEquals(expected, instance.kthFactorLinear(n, k));
        assertEquals(expected, instance.kthFactorSqrt(n, k));
    }

}
