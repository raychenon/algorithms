package com.raychenon.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * User: raychenon
 * Date: 2019-09-18
 * https://github.com/raychenon/algorithms/issues/97
 */
public class FloodFill {

    public int[][] floodFill(int[][] image, int row, int col, int newColor) {
        int currentColor = image[row][col];
        if (currentColor != newColor) DFS(image, row, col, currentColor, newColor);
        return image;
    }

    private void DFS(int[][] image, int row, int col, int color, int targetColor) {
        if (image[row][col] == color) {
            image[row][col] = targetColor;
            if (row > 0) DFS(image, row - 1, col, color, targetColor); // top
            if (col > 0) DFS(image, row, col - 1, color, targetColor); // left
            if (row < image.length - 1) DFS(image, row + 1, col, color, targetColor);     // bottom
            if (col < image[0].length - 1) DFS(image, row, col + 1, color, targetColor);  // right
        }
    }

    public int[][] floodFillIterative(int[][] image, int sr, int sc, int newColor) {
        int oldColor = image[sr][sc];
        if (oldColor == newColor) return image;
        int[] pairs = {1, 0, -1, 0, 1};
        Queue<int[]> q = new LinkedList<>();
        image[sr][sc] = newColor;
        q.add(new int[]{sr, sc});
        while (!q.isEmpty()) {
            int[] rc = q.poll();
            for (int i = 1; i < pairs.length; i++) {
                int r = rc[0] + pairs[i - 1], c = rc[1] + pairs[i];
                if (r < 0 || r >= image.length || c < 0 || c >= image[0].length || image[r][c] != oldColor) continue;
                image[r][c] = newColor;
                q.add(new int[]{r, c});
            }
        }
        return image;
    }

}