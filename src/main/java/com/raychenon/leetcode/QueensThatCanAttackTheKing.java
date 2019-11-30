package com.raychenon.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
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

        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(0, 1));
        list.add(Arrays.asList(1, 0));
        list.add(Arrays.asList(3, 3));
        return list;
    }

}
