package com.raychenon.leetcode;

/**
 * User: raychenon
 * Date: 2019-09-18
 * https://github.com/raychenon/algorithms/issues/97
 */
public class FloodFill {

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int currentColor = image[sr][sc];
        if (currentColor != newColor) DFS(image, sr, sc, currentColor, newColor);
        return image;
    }

    private void DFS(int[][] image, int y, int x, int color, int targetColor) {
        if (image[y][x] == color) {
            image[y][x] = targetColor;
            if (y > 0) DFS(image, y - 1, x, color, targetColor); // top
            if (x > 0) DFS(image, y, x - 1, color, targetColor); // left
            if (y < image.length - 1) DFS(image, y + 1, x, color, targetColor);     // top
            if (x < image[0].length - 1) DFS(image, y, x + 1, color, targetColor);  // right
        }
    }

}