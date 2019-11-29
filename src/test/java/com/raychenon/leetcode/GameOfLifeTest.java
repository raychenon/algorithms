package com.raychenon.leetcode;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 2019-11-07
 * https://leetcode.com/problems/game-of-life/
 */
public class GameOfLifeTest {


    private static GameOfLife gameOfLife;

    @BeforeClass
    public static void setUp() {
        gameOfLife = new GameOfLife();
    }

    // more tests  http://www.scholarpedia.org/article/Game_of_Life

    @Test
    public void gameOfLifeTest() {
        int[][] grid = new int[][]{
                {0, 1, 0},
                {0, 0, 1},
                {1, 1, 1},
                {0, 0, 0}
        };
        int[][] expected = new int[][]{
                {0, 0, 0},
                {1, 0, 1},
                {0, 1, 1},
                {0, 1, 0}
        };

        compareMethods(expected, grid);
    }

    @Test
    public void gameOfLifeCenterIdentityTest() {
        int[][] grid = new int[][]{
                {0, 0, 0, 0},
                {0, 1, 1, 0},
                {0, 1, 1, 0},
                {0, 0, 0, 0}
        };
        int[][] expected = new int[][]{
                {0, 0, 0, 0},
                {0, 1, 1, 0},
                {0, 1, 1, 0},
                {0, 0, 0, 0}
        };

        compareMethods(expected, grid);
    }

    @Test
    public void gameOfLifeOscillatorTest() {
        int[][] grid = new int[][]{
                {0, 0, 0},
                {1, 1, 1},
                {0, 0, 0}
        };
        int[][] expected = new int[][]{
                {0, 1, 0},
                {0, 1, 0},
                {0, 1, 0}
        };

        compareMethods(expected, grid);
    }


    @Test
    public void gameOfLifeGliderGunTest() {
        int[][] grid = new int[][]{
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 1, 0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0, 0, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 1, 0, 0, 0, 1, 0, 1, 1, 0},
                {0, 1, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 1, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        };
        int[][] expected = new int[][]{
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 1, 0, 0, 0, 0, 0, 0},
                {0, 1, 1, 0, 0, 0, 0, 1, 1, 0},
                {1, 1, 1, 0, 0, 0, 0, 1, 1, 0},
                {0, 1, 1, 0, 0, 0, 0, 1, 1, 0},
                {0, 0, 1, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        };

        compareMethods(expected, grid);
    }


    public void compareMethods(int[][] expected, int[][] grid) {

        int[][] grid1 = new int[grid.length][grid[0].length];
        int[][] grid2 = new int[grid.length][grid[0].length];

        for (int r = 0; r < grid.length; ++r) {
            for (int c = 0; c < grid[0].length; ++c) {
                grid1[r][c] = grid[r][c];
                grid2[r][c] = grid[r][c];
            }
        }

        gameOfLife.gameOfLife(grid1);
        compareBoards(expected, grid1);

        gameOfLife.gameOfLifeConstantSpace(grid2);
        compareBoards(expected, grid2);
    }

    public void compareBoards(int[][] expected, int[][] actual) {
        assertEquals(expected.length, actual.length);
        assertEquals(expected[0].length, actual[0].length);

        for (int i = 0; i < expected.length; ++i) {
            for (int j = 0; j < expected[0].length; ++j) {
                assertEquals(expected[i][j], actual[i][j]);
            }
        }
    }
}
