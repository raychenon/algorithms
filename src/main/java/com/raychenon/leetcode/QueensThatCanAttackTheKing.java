package com.raychenon.leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * User: raychenon
 * Date: 2019-11-30
 * https://leetcode.com/problems/queens-that-can-attack-the-king/
 * <p>
 * <p>
 * On an 8x8 chessboard, there can be multiple Black Queens and one White King.
 * Given an array of integer coordinates queens that represents the positions of the Black Queens,
 * and a pair of coordinates king that represent the position of the White King,
 * return the coordinates of all the queens (in any order) that can attack the King.
 */
public class QueensThatCanAttackTheKing {

    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {

        // From the King position, see who can attack horizontally,vertically,diagonally
        // any Queens on these coordinates is on the answer list.

        int[][] dir = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}, {1, 1}, {1, -1}, {-1, 1}, {-1, -1}};
        boolean[] isVisitedArr = new boolean[dir.length];
        boolean[][] table = new boolean[8][8];
        // copy the queens positions in the 8x8 chessboard
        for (int i = 0; i < queens.length; i++) {
            table[queens[i][0]][queens[i][1]] = true;
        }
        List<List<Integer>> list = new LinkedList<>();

        for (int row = king[0], col = king[1], count = 1; count < 8; count++) {
            for (int k = 0; k < dir.length; k++) {
                int trow = row + dir[k][0] * count;
                int tcol = col + dir[k][1] * count;
                if (trow >= 0 && trow < 8 && tcol >= 0 && tcol < 8 && table[trow][tcol] && !isVisitedArr[k]) {
                    isVisitedArr[k] = true;
                    List<Integer> temp = new LinkedList<>();
                    temp.add(trow);
                    temp.add(tcol);
                    list.add(temp);
                }
            }
        }
        return list;
    }


}
