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
    public void climb2StairsTest() {
        assertEquals(2, climbingStairs.climbStairsRec(2));
    }

    @Test
    public void climb3StairsTest() {
        assertEquals(3, climbingStairs.climbStairsRec(3));
    }

    @Test
    public void climb5StairsTest() {
        assertEquals(8, climbingStairs.climbStairsRec(5));
    }

}
