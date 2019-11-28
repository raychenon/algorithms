package com.raychenon.leetcode;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 2019-10-31
 * https://leetcode.com/problems/climbing-stairs
 */
public class ClimbingStairsTest {

    private static ClimbingStairs climbingStairs;

    @BeforeClass
    public static void setUp() {
        climbingStairs = new ClimbingStairs();
    }

    @Test
    public void climb1StairsTest() {
        assertClimbStairs(1, 1);
    }

    @Test
    public void climb2StairsTest() {
        assertClimbStairs(2, 2);
    }

    @Test
    public void climb3StairsTest() {
        assertClimbStairs(3, 3);
    }

    @Test
    public void climb5StairsTest() {
        assertClimbStairs(8, 5);
    }

    @Test
    public void climb7StairsTest() {
        assertClimbStairs(21, 7);
    }


    private void assertClimbStairs(int expected, int actual) {
        assertEquals(expected, climbingStairs.climbStairsRec(actual));
        assertEquals(expected, climbingStairs.climbStairsDynamic(actual));
        assertEquals(expected, climbingStairs.climbStairsFibonacci(actual));
        assertEquals(expected, climbingStairs.climbStairsFibonacciFormula(actual));
    }
}
