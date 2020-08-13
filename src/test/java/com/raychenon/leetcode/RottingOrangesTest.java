package com.raychenon.leetcode;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 12/2/2020
 * https://leetcode.com/problems/rotting-oranges/
 */
public class RottingOrangesTest {

    private static RottingOranges instance;

    @BeforeClass
    public static void setUp() {
        instance = new RottingOranges();
    }

    @Test
    public void example1Test() {
        int[][] matrix = new int[][]{
                {2, 1, 1},
                {1, 1, 0},
                {0, 1, 1}
        };

        assertOrangesRotting(4, matrix);
    }

    @Test
    public void example2Test() {
        int[][] matrix = new int[][]{
                {2, 1, 1},
                {0, 1, 1},
                {1, 0, 1}
        };

        assertOrangesRotting(-1, matrix);
    }

    @Test
    public void example3Test() {
        int[][] matrix = new int[][]{
                {0, 2}
        };

        assertOrangesRotting(0, matrix);
    }

    private void assertOrangesRotting(int minutesExpected, int[][] grid) {
        assertEquals(minutesExpected, instance.orangesRottingBFS(grid));
        // the 2nd method modifies in space the grid
        assertEquals(minutesExpected, instance.orangesRotting(grid));
    }

}
