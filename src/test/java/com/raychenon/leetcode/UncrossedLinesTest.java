package com.raychenon.leetcode;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 26/5/2020
 * https://leetcode.com/problems/uncrossed-lines/
 */
public class UncrossedLinesTest {


    private static UncrossedLines uncrossedLines;

    @BeforeClass
    public static void setUp() {
        uncrossedLines = new UncrossedLines();
    }

    @Test
    public void example1Test() {
        assertUncrossedLines(2, new int[]{1, 4, 2}, new int[]{1, 2, 4});
    }

    @Test
    public void example2Test() {
        assertUncrossedLines(3, new int[]{2, 5, 1, 2, 5}, new int[]{10, 5, 2, 1, 5, 2});
    }

    @Test
    public void example3Test() {
        assertUncrossedLines(2, new int[]{1, 3, 7, 1, 7, 5}, new int[]{1, 9, 2, 5, 1});
    }

    void assertUncrossedLines(int expected, int[] A, int[] B) {
        assertEquals(expected, uncrossedLines.maxUncrossedLines(A, B));
    }


}
