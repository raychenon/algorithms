package com.raychenon.leetcode;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

/**
 * User: raychenon
 * Date: 11/2/2020
 * https://leetcode.com/problems/rotting-oranges/
 */
public class RottingOranges {

    public static final int EMPTY = 0;
    public static final int FRESH = 1;
    public static final int ROTTEN = 2;

    /**
     * Every minute, any fresh orange that is adjacent (4-directionally) to a rotten orange becomes rotten.
     * Return the minimum number of minutes that must elapse until no cell has a fresh orange.  If this is impossible, return -1 instead.
     * runtime complexity : O(n), where n is the number of cells in the grid.
     * space   complexity : O(n)
     **/
    public int orangesRotting(int[][] grid) {

        int[] dRow = new int[]{-1, 0, 1, 0};
        int[] dCol = new int[]{0, -1, 0, 1};

        int R = grid.length;
        int C = grid[0].length;

        // queue : all starting cells with rotten oranges
        Queue<Integer> queue = new ArrayDeque<>();
        Map<Integer, Integer> depth = new HashMap<>();
        for (int row = 0; row < R; ++row) {
            for (int col = 0; col < C; ++col) {
                if (grid[row][col] == ROTTEN) {
                    int code = row * C + col;
                    queue.add(code);
                    depth.put(code, EMPTY);
                }
            }
        }

        int ans = 0;
        while (!queue.isEmpty()) {
            int code = queue.remove();
            int r = code / C;
            int c = code % C;
            for (int k = 0; k < dRow.length; ++k) {
                int nr = r + dRow[k];
                int nc = c + dCol[k];
                if (0 <= nr && nr < R && 0 <= nc && nc < C && grid[nr][nc] == FRESH) {

                    grid[nr][nc] = ROTTEN;
                    int ncode = nr * C + nc;
                    queue.add(ncode);
                    depth.put(ncode, depth.get(code) + 1);
                    ans = depth.get(ncode);
                }
            }
        }

        for (int[] row : grid) {
            for (int val : row) {
                if (val == FRESH) {
                    return -1;
                }
            }
        }
        return ans;
    }

}
