package com.raychenon.leetcode;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 21/7/2020
 * https://leetcode.com/problems/word-search/
 */
public class WordSearchTest {

    private static WordSearch wordSearch;

    @BeforeClass
    public static void setUp() {
        wordSearch = new WordSearch();
    }

    char[][] board = new char[][]{
            {'A', 'B', 'C', 'E'},
            {'S', 'F', 'C', 'S'},
            {'A', 'D', 'E', 'E'}
    };

    @Test
    public void givenWordABCCED() {
        evaluateWordExistence(true, board, "ABCCED");
    }

    @Test
    public void givenWordSEE() {
        evaluateWordExistence(true, board, "SEE");
    }

    @Test
    public void givenWordABCB() {
        evaluateWordExistence(false, board, "ABCB");
    }

    private void evaluateWordExistence(boolean expected, char[][] board, String word) {
        assertEquals(expected, wordSearch.exist(board, word));
    }
}
