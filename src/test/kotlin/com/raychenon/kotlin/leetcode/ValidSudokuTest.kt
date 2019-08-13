package com.raychenon.kotlin.leetcode

import org.junit.Assert
import org.junit.Test

/**
 * User: raychenon
 * Date: 2019-08-08
 * https://leetcode.com/problems/valid-sudoku/
 */
class ValidSudokuTest {

    @Test
    fun isExample1Valid() {
        val grid: Array<CharArray> = arrayOf(
            charArrayOf('5', '3', '.', '.', '7', '.', '.', '.', '.'),
            charArrayOf('6', '.', '.', '1', '9', '5', '.', '.', '.'),
            charArrayOf('.', '9', '8', '.', '.', '.', '.', '6', '.'),
            charArrayOf('8', '.', '.', '.', '6', '.', '.', '.', '3'),
            charArrayOf('4', '.', '.', '8', '.', '3', '.', '.', '1'),
            charArrayOf('7', '.', '.', '.', '2', '.', '.', '.', '6'),
            charArrayOf('.', '6', '.', '.', '.', '.', '2', '8', '.'),
            charArrayOf('.', '.', '.', '4', '1', '9', '.', '.', '5'),
            charArrayOf('.', '.', '.', '.', '8', '.', '.', '7', '9')
        )
        Assert.assertEquals(true, ValidSudoku.isValidSudoku(grid))
        Assert.assertEquals(true, ValidSudoku.isValidSudokuBruteForce(grid))
    }

    @Test
    fun isExample2Valid() {
        val grid: Array<CharArray> = arrayOf(
            charArrayOf('8', '3', '.', '.', '7', '.', '.', '.', '.'),
            charArrayOf('6', '.', '.', '1', '9', '5', '.', '.', '.'),
            charArrayOf('.', '9', '8', '.', '.', '.', '.', '6', '.'),
            charArrayOf('8', '.', '.', '.', '6', '.', '.', '.', '3'),
            charArrayOf('4', '.', '.', '8', '.', '3', '.', '.', '1'),
            charArrayOf('7', '.', '.', '.', '2', '.', '.', '.', '6'),
            charArrayOf('.', '6', '.', '.', '.', '.', '2', '8', '.'),
            charArrayOf('.', '.', '.', '4', '1', '9', '.', '.', '5'),
            charArrayOf('.', '.', '.', '.', '8', '.', '.', '7', '9')
        )
        Assert.assertEquals(false, ValidSudoku.isValidSudoku(grid))
        Assert.assertEquals(false, ValidSudoku.isValidSudokuBruteForce(grid))
    }

    @Test
    fun isInvalid_when_SubgridsHaveDuplicates() {
        // invalid, because the su-grid at top right corner contains two '1'
        val grid: Array<CharArray> = arrayOf(
            charArrayOf('.', '.', '.', '.', '5', '.', '.', '1', '.'),
            charArrayOf('.', '4', '.', '3', '.', '.', '.', '.', '.'),
            charArrayOf('.', '.', '.', '.', '.', '3', '.', '.', '1'),
            charArrayOf('8', '.', '.', '.', '.', '.', '.', '2', '.'),
            charArrayOf('.', '.', '2', '.', '7', '.', '.', '.', '.'),
            charArrayOf('.', '1', '5', '.', '.', '.', '.', '.', '.'),
            charArrayOf('.', '.', '.', '.', '.', '2', '.', '.', '.'),
            charArrayOf('.', '2', '.', '9', '.', '.', '.', '.', '.'),
            charArrayOf('.', '.', '4', '.', '.', '.', '.', '.', '.')
        )
        Assert.assertEquals(false, ValidSudoku.isValidSudoku(grid))
        Assert.assertEquals(false, ValidSudoku.isValidSudokuBruteForce(grid))
    }

    @Test
    fun isInvalid_when_RowsHaveDuplicates() {
        val grid: Array<CharArray> = arrayOf(
            charArrayOf('5', '3', '.', '.', '7', '.', '.', '5', '.'),
            charArrayOf('6', '.', '.', '1', '9', '5', '.', '.', '.'),
            charArrayOf('.', '9', '8', '.', '.', '.', '.', '6', '.'),
            charArrayOf('8', '.', '.', '.', '6', '.', '.', '.', '3'),
            charArrayOf('4', '.', '.', '8', '.', '3', '.', '.', '1'),
            charArrayOf('7', '.', '.', '.', '2', '.', '.', '.', '6'),
            charArrayOf('.', '6', '.', '.', '.', '.', '2', '8', '.'),
            charArrayOf('.', '.', '.', '4', '1', '9', '.', '.', '5'),
            charArrayOf('.', '.', '.', '.', '8', '.', '.', '7', '9')
        )
        Assert.assertEquals(false, ValidSudoku.isValidSudoku(grid))
        Assert.assertEquals(false, ValidSudoku.isValidSudokuBruteForce(grid))
    }

    @Test
    fun isInvalid_when_ColumnsHaveDuplicates() {
        val grid: Array<CharArray> = arrayOf(
            charArrayOf('5', '3', '.', '.', '7', '.', '.', '.', '.'),
            charArrayOf('6', '.', '.', '1', '9', '5', '.', '.', '.'),
            charArrayOf('.', '9', '8', '.', '.', '.', '.', '6', '.'),
            charArrayOf('8', '.', '.', '.', '6', '.', '.', '.', '3'),
            charArrayOf('4', '.', '.', '8', '.', '3', '.', '.', '1'),
            charArrayOf('7', '.', '.', '.', '2', '.', '.', '.', '6'),
            charArrayOf('.', '6', '.', '.', '.', '.', '2', '8', '.'),
            charArrayOf('7', '.', '.', '4', '1', '9', '.', '.', '5'),
            charArrayOf('.', '.', '.', '.', '8', '.', '.', '7', '9')
        )
        Assert.assertEquals(false, ValidSudoku.isValidSudoku(grid))
        Assert.assertEquals(false, ValidSudoku.isValidSudokuBruteForce(grid))
    }
}