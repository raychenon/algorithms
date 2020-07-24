package com.raychenon.kotlin.leetcode

import junit.framework.TestCase
import org.junit.Test

/**
 * User: raychenon
 * Date: 23/7/2020
 * https://leetcode.com/problems/word-search/
 */
class WordSearchTest {

    var board = arrayOf(
        charArrayOf('A', 'B', 'C', 'E'),
        charArrayOf('S', 'F', 'C', 'S'),
        charArrayOf('A', 'D', 'E', 'E')
    )

    @Test
    fun givenWordABCCED() {
        evaluateWordExistence(true, board, "ABCCED")
    }

    @Test
    fun givenWordSEE() {
        evaluateWordExistence(true, board, "SEE")
    }

    @Test
    fun givenWordABCB() {
        evaluateWordExistence(false, board, "ABCB")
    }

    @Test
    fun givenWordESEE() {
        evaluateWordExistence(true, board, "ESEE")
    }

    @Test
    fun givenWordSADE() {
        evaluateWordExistence(true, board, "SADE")
    }

    @Test
    fun givenWordCEDFB() {
        evaluateWordExistence(true, board, "CEDFB")
    }

    @Test
    fun givenWordABCDEA() {
        evaluateWordExistence(false, board, "ABCDEA")
    }

    @Test
    fun givenWordSABCESEEDA() {
        evaluateWordExistence(true, board, "SABCESEEDA")
    }

    @Test
    fun givenWordEEDASABCES() {
        // rotate string (4 right shift)
        evaluateWordExistence(true, board, "EEDASABCES")
    }

    private fun evaluateWordExistence(
        expected: Boolean,
        board: Array<CharArray>,
        word: String
    ) {
        TestCase.assertEquals(expected, WordSearch.exist(board, word))
    }
}