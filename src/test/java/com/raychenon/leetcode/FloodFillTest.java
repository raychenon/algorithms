package com.raychenon.leetcode;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 * User: raychenon
 * Date: 2019-09-18
 * https://leetcode.com/problems/flood-fill/
 */
public class FloodFillTest {

    private static FloodFill floodfill;

    @BeforeClass
    public static void setUp() {
        floodfill = new FloodFill();
    }

    @Test
    public void fillMatrix3x3Test() {
        int[][] image = new int[][]{
                {1, 1, 1},
                {1, 1, 0},
                {1, 0, 1}
        };
        int[][] result = new int[][]{
                {2, 2, 2},
                {2, 2, 0},
                {2, 0, 1}
        };

        compareFloodFillMethods(result, image, 1, 1, 2);
    }

    @Test
    public void fillMatrix4x3Test() {
        int[][] image = new int[][]{
                {1, 1, 1, 1},
                {1, 1, 0, 2},
                {1, 0, 1, 1}
        };
        int[][] result = new int[][]{
                {2, 2, 2, 2},
                {2, 2, 0, 2},
                {2, 0, 1, 1}
        };

        compareFloodFillMethods(result, image, 1, 1, 2);
    }


    private void compareFloodFillMethods(int[][] expected, int[][] image, int row, int col, int newColor) {
        Assert.assertArrayEquals(expected, floodfill.floodFill(image, row, col, newColor));
        Assert.assertArrayEquals(expected, floodfill.floodFillIterative(image, row, col, newColor));
    }
}
