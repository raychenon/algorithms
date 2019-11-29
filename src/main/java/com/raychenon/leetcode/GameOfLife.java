package com.raychenon.leetcode;

/**
 * User: raychenon
 * Date: 2019-11-07
 * https://leetcode.com/problems/game-of-life/
 */
public class GameOfLife {

    /**
     * time complexity : O(R*C) R number of rows, C number of columns
     * space complexity : O(R*C) R number of rows, C number of columns
     *
     * @param board
     */
    public void gameOfLife(int[][] board) {
        // Neighbors array to find 8 neighboring cells for a given cell
        int[] neighbors = {0, 1, -1};

        int rows = board.length;
        int cols = board[0].length;

        // Create a copy of the original board
        int[][] copyBoard = new int[rows][cols];

        // Create a copy of the original board
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                copyBoard[row][col] = board[row][col];
            }
        }

        // Iterate through board cell by cell.
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {

                // For each cell count the number of live neighbors.
                int liveNeighbors = 0;

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {

                        if (!(neighbors[i] == 0 && neighbors[j] == 0)) {
                            int r = (row + neighbors[i]);
                            int c = (col + neighbors[j]);

                            // Check the validity of the neighboring cell.
                            // and whether it was originally a live cell.
                            // The evaluation is done against the copy, since that is never updated.
                            if ((r < rows && r >= 0) && (c < cols && c >= 0) && (copyBoard[r][c] == 1)) {
                                liveNeighbors += 1;
                            }
                        }
                    }
                }

                // Rule 1: Any live cell with fewer than two live neighbors dies, as if caused by under-population.
                // Rule 3: Any live cell with more than three live neighbors dies, as if by over-population.
                if ((copyBoard[row][col] == 1) && (liveNeighbors < 2 || liveNeighbors > 3)) {
                    board[row][col] = 0;
                }
                // Rule 4: Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
                if (copyBoard[row][col] == 0 && liveNeighbors == 3) {
                    board[row][col] = 1;
                }
            }
        }
    }


    /**
     * time complexity : O(R*C) R number of rows, C number of columns
     * space complexity : O(1), the board is not copied.
     * Values are replaced by new values to keep the current and next state
     *
     * @param board
     */
    public void gameOfLifeConstantSpace(int[][] board) {
        int[][] dir = {{1, -1}, {1, 0}, {1, 1}, {0, -1}, {0, 1}, {-1, -1}, {-1, 0}, {-1, 1}};

        // 0 -> 00 dead stays dead
        // 1 -> 01 dead cell becomes live
        // 2 -> 10 live cell becomes dead
        // 3 -> 11 live cell stays alive

        for (int row = 0; row < board.length; ++row) {
            for (int col = 0; col < board[0].length; ++col) {
                int live = 0;
                for (int[] d : dir) {
                    if ((d[0] + row < 0) || (d[0] + row >= board.length) ||
                            (d[1] + col < 0) || (d[1] + col >= board[0].length)) {
                        continue;
                    }

                    if (board[d[0] + row][d[1] + col] == 1 || board[d[0] + row][d[1] + col] == 2) live++;
                }

                // Rule 4: Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
                if (board[row][col] == 0 && live == 3) {
                    board[row][col] = 3;
                }

                // Rule 1: Any live cell with fewer than two live neighbors dies, as if caused by under-population.
                // Rule 3: Any live cell with more than three live neighbors dies, as if by over-population.
                if (board[row][col] == 1 && (live < 2 || live > 3)) {
                    board[row][col] = 2;
                }

            }
        }

        for (int row = 0; row < board.length; ++row) {
            for (int col = 0; col < board[0].length; ++col) {
                board[row][col] %= 2;
            }
        }

    }

}
