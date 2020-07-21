package com.raychenon.leetcode;

/**
 * User: raychenon
 * Date: 21/7/2020
 * https://leetcode.com/problems/word-search/
 */
public class WordSearch {

    /**
     * Time complexity: O(b*4*w), where b is the number of cells in board and w is the length of wordßßß
     * Space complexity: O(1)
     * https://www.youtube.com/watch?v=X0kX7PMOYi0
     *
     * @param board
     * @param word
     * @return
     */
    public boolean exist(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] == word.charAt(0) &&
                        search(board, i, j, word, 0)) return true;
            }
        }

        return false;
    }

    private boolean search(char[][] board, int i, int j, String word, int idx) {
        if (idx == word.length() - 1) return true;

        board[i][j] -= 65; // upper case to lower to save memory in the same board
        int index = idx + 1;
        // top
        if (i > 0 && board[i - 1][j] == word.charAt(index) && search(board, i - 1, j, word, index)) return true;
        // left
        if (j > 0 && board[i][j - 1] == word.charAt(index) && search(board, i, j - 1, word, index)) return true;
        // bottom
        if (i < board.length - 1 &&
                board[i + 1][j] == word.charAt(index) &&
                search(board, i + 1, j, word, index)) return true;
        // right
        if (j < board[0].length - 1 && board[i][j + 1] == word.charAt(index) && search(board, i, j + 1, word, index))
            return true;


        board[i][j] += 65; // lower case to upper
        return false;
    }
}
