package com.raychenon.leetcode;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static junit.framework.TestCase.assertTrue;

/**
 * User: raychenon
 * Date: 2019-11-30
 * https://leetcode.com/problems/queens-that-can-attack-the-king/
 */
public class QueensThatCanAttackTheKingTest {

    private static QueensThatCanAttackTheKing queensThatCanAttackTheKing;

    @BeforeClass
    public static void setUp() {
        queensThatCanAttackTheKing = new QueensThatCanAttackTheKing();
    }


    @Test
    public void queens1Test() {
        int[][] queens = new int[][]{
                {0, 1}, {1, 0}, {4, 0}, {0, 4}, {3, 3}, {2, 4}
        };

        int[] king = new int[]{0, 0};

        int[][] expected = new int[][]{
                {0, 1}, {1, 0}, {3, 3}
        };

        compareMethods(expected, queens, king);
    }


    public void compareMethods(int[][] expectedQueens, int[][] queens, int[] king) {

        Set<int[]> expectedQueensSubset = new HashSet<>();
        for (int[] queen : expectedQueens) {
            expectedQueensSubset.add(queen);
        }

        Set<int[]> actualQueensSubset = new HashSet<>();
        for (List<Integer> queenCoordinates : queensThatCanAttackTheKing.queensAttacktheKing(queens, king)) {
            int[] temp = new int[]{queenCoordinates.get(0), queenCoordinates.get(1)};
            actualQueensSubset.add(temp);
        }

        assertTrue(actualQueensSubset.containsAll(expectedQueensSubset));
        assertTrue(expectedQueensSubset.equals(actualQueensSubset));
    }


}
