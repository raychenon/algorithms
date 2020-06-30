package com.raychenon.leetcode;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 30/6/2020
 * https://leetcode.com/problems/unique-paths/
 */
public class UniquePathsTest {

    private static UniquePaths uniquePaths;

    @BeforeClass
    public static void setUp() {
        uniquePaths = new UniquePaths();
    }

    @Test
    public void example1Test() {
        assertUniquePaths(3, 3, 2);
    }

    @Test
    public void example2Test() {
        assertUniquePaths(28, 7, 3);
    }

    @Test
    public void example3Test() {
        assertUniquePaths(48620, 10, 10);
    }


    void assertUniquePaths(int expected, int m, int n) {
        assertEquals(expected, uniquePaths.uniquePathsDP(m, n));
        assertEquals(expected, uniquePaths.uniquePathsRecursive(m, n));
    }

}
