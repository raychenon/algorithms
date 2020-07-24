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
        evaluateWordExistence(true, board(), "ABCCED");
    }

    @Test
    public void givenWordSEE() {
        evaluateWordExistence(true, board(), "SEE");
    }

    @Test
    public void givenWordABCB() {
        evaluateWordExistence(false, board(), "ABCB");
    }

    @Test
    public void givenWordESEE() {
        evaluateWordExistence(true, board(), "ESEE");
    }

    @Test
    public void givenWordSADE() {
        evaluateWordExistence(true, board(), "SADE");
    }

    @Test
    public void givenWordCEDFB() {
        evaluateWordExistence(true, board(), "CEDFB");
    }

    @Test
    public void givenWordABCDEA() {
        evaluateWordExistence(false, board(), "ABCDEA");
    }

    @Test
    public void givenWordSABCESEEDA() {
        evaluateWordExistence(true, board(), "SABCESEEDA");
    }

    @Test
    public void givenWordEEDASABCES() {
        // rotate string (4 right shift)
        evaluateWordExistence(true, board(), "EEDASABCES");
    }

    @Test
    public void givenWordCCE_end_bottom() {
        evaluateWordExistence(true, board(), "CEE");
    }

    @Test
    public void givenWordEEDA_end_left() {
        evaluateWordExistence(true, board(), "EED");
    }

    // hack, to be constant space , the methods modifies the board
    // create a new board for each test.
    private char[][] board() {
        return new char[][]{
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
    }

    private void evaluateWordExistence(boolean expected, char[][] board, String word) {
        char[][] boardCopy = copy(board);

        assertEquals(expected, wordSearch.exist(board, word));
        assertEquals(expected, wordSearch.existLP(boardCopy, word));
    }

    private char[][] copy(char[][] source) {
        char[][] destination = new char[source.length][source[0].length];
        for (int i = 0; i < source.length; i++) {
            System.arraycopy(source[i], 0, destination[i], 0, source[i].length);
        }
        return destination;
    }
}
