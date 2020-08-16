package com.raychenon.leetcode;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

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
     * Time complexity : O(n), where n is the number of cells in the grid.
     * Space complexity : O(n)
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

    /**
     * by Kevin Naughton Jr. https://www.youtube.com/watch?v=TzoDDOj60zE
     * Time complexity : O(n), where n is the number of cells in the grid.
     * Space complexity : O(n)
     *
     * @param grid
     * @return
     */
    public int orangesRottingBFS(int[][] grid) {
        Set<String> fresh = new HashSet<>();
        Set<String> rotten = new HashSet<>();

        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] == 1) // 1 fresh
                    fresh.add("" + r + c);
                else if (grid[r][c] == 2) { // 2 rotten
                    rotten.add("" + r + c);
                }
            }
        }

        int minutes = 0;
        int[][] directions = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
        while (fresh.size() > 0) {
            Set<String> infected = new HashSet<>();
            for (String s : rotten) {
                int i = s.charAt(0) - '0';
                int j = s.charAt(1) - '0';
                for (int[] dir : directions) {
                    int nextI = i + dir[0];
                    int nextJ = j + dir[1];
                    if (fresh.contains("" + nextI + nextJ)) {
                        fresh.remove("" + nextI + nextJ);
                        infected.add("" + nextI + nextJ);
                    }
                }
            }

            if (infected.size() == 0) {
                return -1;
            }
            rotten = infected;
            minutes++;
        }

        return minutes;
    }

}
