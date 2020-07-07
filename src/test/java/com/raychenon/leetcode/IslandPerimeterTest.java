package com.raychenon.leetcode;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 7/7/2020
 * https://leetcode.com/problems/island-perimeter/
 */
public class IslandPerimeterTest {

    private static IslandPerimeter islandPerimeter;

    @BeforeClass
    public static void setUp() {
        islandPerimeter = new IslandPerimeter();
    }


    @Test
    public void example1Test() {
        evaluateIslandPerimeter(
                16,
                new int[][]{{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}}
        );
    }

    @Test
    public void emptyTest() {
        evaluateIslandPerimeter(
                0,
                new int[][]{{}}
        );
    }

    @Test
    public void nullTest() {
        evaluateIslandPerimeter(
                0, null
        );
    }

    void evaluateIslandPerimeter(int expected, int[][] grid) {
        assertEquals(expected, islandPerimeter.islandPerimeter(grid));
        assertEquals(expected, islandPerimeter.islandPerimeterCount1by1(grid));
    }
}
