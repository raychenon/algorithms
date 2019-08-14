package com.raychenon.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * User: raychenon
 * Date: 2019-08-13
 * https://leetcode.com/problems/valid-sudoku
 */
public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        Set set = new HashSet();
        int size = board.length;
        int smallBoardSize = (int) Math.sqrt(size);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                char element = board[i][j];
                if (element != '.') {
                    String b = String.format("(%c)", element);
                    if (!set.add(String.format("%s in row %d", b, i)) ||
                            !set.add(String.format("%s in column %d", b, j)) ||
                            !set.add(String.format("%s in sub-grid %d , %d", b, i / smallBoardSize, j / smallBoardSize)))
                        return false;
                }
            }
        }
        return true;
    }
}
