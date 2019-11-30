package com.raychenon.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
        List<List<Integer>> ans = new ArrayList<>();

        // From the King perspectice, who can attack horizontally,vertically,diagonally
        // any Queens on these coordinates is on the answer list.

        // vertical
        for (int[] queen : queens) {
            if (king[0] == queen[0]) {
                List<Integer> list = Arrays.stream(queen).boxed().collect(Collectors.toList());
                ans.add(list);
            }
        }

        // horizontal
        for (int[] queen : queens) {
            if (king[1] == queen[1]) {
                List<Integer> list = Arrays.stream(queen).boxed().collect(Collectors.toList());
                ans.add(list);
            }
        }


        // diagonal  \
        for (int[] queen : queens) {
            int row = 0;
            int col = 0;
            while (king[0] + row < 8 && king[0] + row >= 0 && king[1] + col < 8 && king[1] + col >= 0) {
                row++;
                col++;
                if (queen[0] == king[0] + row && queen[1] == king[1] + col) {
                    List<Integer> list = Arrays.stream(queen).boxed().collect(Collectors.toList());
                    ans.add(list);
                }
            }

            row = 0;
            col = 0;
            while (king[0] + row < 8 && king[0] + row >= 0 && king[1] + col < 8 && king[1] + col >= 0) {
                --row;
                --col;
                if (queen[0] == king[0] + row && queen[1] == king[1] + col) {
                    List<Integer> list = Arrays.stream(queen).boxed().collect(Collectors.toList());
                    ans.add(list);
                }
            }
        }


        // diagonal  /
        for (int[] queen : queens) {
            int row = 0;
            int col = 0;
            while (king[0] + row < 8 && king[0] + row >= 0 && king[1] + col < 8 && king[1] + col >= 0) {
                row--;
                col++;
                if (queen[0] == king[0] + row && queen[1] == king[1] + col) {
                    List<Integer> list = Arrays.stream(queen).boxed().collect(Collectors.toList());
                    ans.add(list);
                }
            }

            row = 0;
            col = 0;
            while (king[0] + row < 8 && king[0] + row >= 0 && king[1] + col < 8 && king[1] + col >= 0) {
                ++row;
                --col;
                if (queen[0] == king[0] + row && queen[1] == king[1] + col) {
                    List<Integer> list = Arrays.stream(queen).boxed().collect(Collectors.toList());
                    ans.add(list);
                }
            }
        }

        return ans;
    }


}
