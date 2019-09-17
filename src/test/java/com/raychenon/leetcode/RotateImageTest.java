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


}
