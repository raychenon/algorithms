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

        Assert.assertEquals(result, floodfill.floodFill(image, 1, 1, 2));
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

        Assert.assertEquals(result, floodfill.floodFill(image, 1, 1, 2));
    }

}
