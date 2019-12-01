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


    // |K|A| | |Q| | | |
    // |A| | | | | | | |
    // | | | | |Q| | | |
    // | | | |A| | | | |
    // |Q| | | | | | | |
    // | | | | | | | | |
    // | | | | | | | | |
    // | | | | | | | | |
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

    // |Q| | | | | | | |
    // | |Q| | | | | | |
    // | | |A| | | | | |
    // | | | |K|A|Q| | |
    // | | | | |A|Q| | |
    // | | | | | | | | |
    // | | | | | | | | |
    // | | | | | | | | |
    @Test
    public void queens2Test() {
        int[][] queens = new int[][]{
                {0, 0}, {1, 1}, {2, 2}, {3, 4}, {3, 5}, {4, 4}, {4, 5}
        };

        int[] king = new int[]{3, 3};

        int[][] expected = new int[][]{
                {2, 2}, {3, 4}, {4, 4}
        };

        compareMethods(expected, queens, king);
    }


    // |Q|Q| |Q|Q|Q|Q|Q|
    // |Q|Q|Q| |A| |A|Q|
    // | |Q|Q|A| | |Q|Q|
    // | | | | |K| | |A|
    // |Q| |Q|A| |A|Q| |
    // |Q|Q|Q| |A| |Q| |
    // | |Q| |Q|Q| | | |
    // | | | | | |Q| |Q|
    @Test
    public void queens3Test() {
        int[][] queens = new int[][]{
                {5, 6}, {7, 7}, {2, 1}, {0, 7}, {1, 6}, {5, 1}, {3, 7},
                {0, 3}, {4, 0}, {1, 2}, {6, 3}, {5, 0}, {0, 4}, {2, 2},
                {1, 1}, {6, 4}, {5, 4}, {0, 0}, {2, 6}, {4, 5}, {5, 2},
                {1, 4}, {7, 5}, {2, 3}, {0, 5}, {4, 2}, {1, 0}, {2, 7},
                {0, 1}, {4, 6}, {6, 1}, {0, 6}, {4, 3}, {1, 7}
        };

        int[] king = new int[]{3, 4};

        int[][] expected = new int[][]{
                {2, 3}, {1, 4}, {1, 6}, {3, 7}, {4, 3}, {5, 4}, {4, 5}
        };

        compareMethods(expected, queens, king);
    }


    public void compareMethods(int[][] expectedQueens, int[][] queens, int[] king) {

        Set<QueenCoordinate> expectedQueensSubset = new HashSet<>();
        for (int[] queen : expectedQueens) {
            QueenCoordinate coord = new QueenCoordinate(queen[0], queen[1]);
            expectedQueensSubset.add(coord);
        }

        Set<QueenCoordinate> actualQueensSubset = new HashSet<>();
        for (List<Integer> queenCoordinates : queensThatCanAttackTheKing.queensAttacktheKing(queens, king)) {
            QueenCoordinate temp = new QueenCoordinate(queenCoordinates.get(0), queenCoordinates.get(1));
            actualQueensSubset.add(temp);
        }

        assertTrue(actualQueensSubset.containsAll(expectedQueensSubset));
        assertTrue(expectedQueensSubset.equals(actualQueensSubset));
    }


    class QueenCoordinate {
        private int row;
        private int col;

        public QueenCoordinate(int y, int x) {
            this.row = y;
            this.col = x;
        }

        @Override
        public boolean equals(Object o) {

            if (o == this) return true;
            if (!(o instanceof QueenCoordinate)) {
                return false;
            }

            QueenCoordinate user = (QueenCoordinate) o;

            return user.row == row &&
                    user.col == col;
        }

        @Override
        public int hashCode() {
            int result = 17;
            result = 31 * result + row;
            result = 31 * result + col;
            return result;
        }
    }
}
