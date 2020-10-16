package com.raychenon.leetcode.matrix;

import junit.framework.TestCase;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * User: raychenon
 * Date: 16/10/2020
 * https://leetcode.com/problems/search-a-2d-matrix/
 */
public class Search2DMatrixTest {

    private static Search2DMatrix search2DMatrix;

    @BeforeClass
    public static void setUp() {
        search2DMatrix = new Search2DMatrix();
    }


    @Test
    public void example1() {
        int[][] matrix = new int[][]{
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 50}};
        assertSearch2DMatrix(matrix, 1, true);
    }

    @Test
    public void example() {
        int[][] matrix = new int[][]{
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 50}};
        assertSearch2DMatrix(matrix, 13, false);
    }

    @Test
    public void example3() {
        int[][] matrix = new int[][]{{}};
        assertSearch2DMatrix(matrix, 0, false);
    }

    @Test
    public void emptyMatrix() {
        int[][] matrix = new int[][]{};
        assertSearch2DMatrix(matrix, 1, false);
    }

    @Test
    public void targetIsLastElement() {
        int[][] matrix = new int[][]{
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 50}};
        assertSearch2DMatrix(matrix, 50, true);
    }

    @Test
    public void targetIsHigherThanMaxElement() {
        int[][] matrix = new int[][]{
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 50}};
        assertSearch2DMatrix(matrix, 100, false);
    }

    @Test
    public void targetIsLowerThanMinElement() {
        int[][] matrix = new int[][]{
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 50}};
        assertSearch2DMatrix(matrix, 0, false);
    }

    void assertSearch2DMatrix(int[][] matrix, int target, boolean expected) {
        TestCase.assertEquals(expected, search2DMatrix.searchMatrix(matrix, target));
        TestCase.assertEquals(expected, search2DMatrix.searchMatrixBinarySearchTemplate1(matrix, target));
    }
}
