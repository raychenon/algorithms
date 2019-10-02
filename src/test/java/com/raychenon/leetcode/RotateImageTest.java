package com.raychenon.leetcode;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * User: raychenon
 * Date: 2019-09-17
 * Time: 11:39
 */
public class RotateImageTest {
    private static RotateImage rotateImage;

    @BeforeClass
    public static void setUp() {
        rotateImage = new RotateImage();
    }

    @Test
    public void rotate3by3MatrixTest() {
        int[][] matrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] result = new int[][]{
                {7, 4, 1},
                {8, 5, 2},
                {9, 6, 3}
        };
        rotateImage.rotate(matrix);

        Assert.assertEquals(result, matrix);
    }

    @Test
    public void rotate4by4MatrixTest() {
        int[][] matrix = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int[][] result = new int[][]{
                {13, 9, 5, 1},
                {14, 10, 6, 2},
                {15, 11, 7, 3},
                {16, 12, 8, 4}
        };
        rotateImage.rotate(matrix);

        Assert.assertEquals(result, matrix);
    }

}
