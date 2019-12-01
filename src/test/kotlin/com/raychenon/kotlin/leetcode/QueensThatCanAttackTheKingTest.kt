package com.raychenon.kotlin.leetcode

import junit.framework.TestCase
import org.junit.Test
import java.util.*

/**
 * User: raychenon
 * Date: 2019-12-01
 * https://leetcode.com/problems/queens-that-can-attack-the-king/
 */
class QueensThatCanAttackTheKingTest {


    // |K|A| | |Q| | | |
    // |A| | | | | | | |
    // | | | | |Q| | | |
    // | | | |A| | | | |
    // |Q| | | | | | | |
    // | | | | | | | | |
    // | | | | | | | | |
    // | | | | | | | | |
    @Test
    fun queens1Test() {
        val queens = arrayOf(
            intArrayOf(0, 1),
            intArrayOf(1, 0),
            intArrayOf(4, 0),
            intArrayOf(0, 4),
            intArrayOf(3, 3),
            intArrayOf(2, 4)
        )
        val king = intArrayOf(0, 0)
        val expected = arrayOf(intArrayOf(0, 1), intArrayOf(1, 0), intArrayOf(3, 3))
        compareMethods(expected, queens, king)
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
    fun queens2Test() {
        val queens = arrayOf(
            intArrayOf(0, 0),
            intArrayOf(1, 1),
            intArrayOf(2, 2),
            intArrayOf(3, 4),
            intArrayOf(3, 5),
            intArrayOf(4, 4),
            intArrayOf(4, 5)
        )
        val king = intArrayOf(3, 3)
        val expected = arrayOf(intArrayOf(2, 2), intArrayOf(3, 4), intArrayOf(4, 4))
        compareMethods(expected, queens, king)
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
    fun queens3Test() {
        val queens = arrayOf(
            intArrayOf(5, 6),
            intArrayOf(7, 7),
            intArrayOf(2, 1),
            intArrayOf(0, 7),
            intArrayOf(1, 6),
            intArrayOf(5, 1),
            intArrayOf(3, 7),
            intArrayOf(0, 3),
            intArrayOf(4, 0),
            intArrayOf(1, 2),
            intArrayOf(6, 3),
            intArrayOf(5, 0),
            intArrayOf(0, 4),
            intArrayOf(2, 2),
            intArrayOf(1, 1),
            intArrayOf(6, 4),
            intArrayOf(5, 4),
            intArrayOf(0, 0),
            intArrayOf(2, 6),
            intArrayOf(4, 5),
            intArrayOf(5, 2),
            intArrayOf(1, 4),
            intArrayOf(7, 5),
            intArrayOf(2, 3),
            intArrayOf(0, 5),
            intArrayOf(4, 2),
            intArrayOf(1, 0),
            intArrayOf(2, 7),
            intArrayOf(0, 1),
            intArrayOf(4, 6),
            intArrayOf(6, 1),
            intArrayOf(0, 6),
            intArrayOf(4, 3),
            intArrayOf(1, 7)
        )
        val king = intArrayOf(3, 4)
        val expected = arrayOf(
            intArrayOf(2, 3),
            intArrayOf(1, 4),
            intArrayOf(1, 6),
            intArrayOf(3, 7),
            intArrayOf(4, 3),
            intArrayOf(5, 4),
            intArrayOf(4, 5)
        )
        compareMethods(expected, queens, king)
    }


    fun compareMethods(
        expectedQueens: Array<IntArray>,
        queens: Array<IntArray>,
        king: IntArray
    ) {
        val expectedQueensSubset: MutableSet<QueenCoordinate> = HashSet()
        for (queen in expectedQueens) {
            val coord = QueenCoordinate(queen[0], queen[1])
            expectedQueensSubset.add(coord)
        }
        val actualQueensSubset: MutableSet<QueenCoordinate> = HashSet()
        for (queenCoordinates in QueensThatCanAttackTheKing.queensAttacktheKing(
            queens,
            king
        )) {
            val temp = QueenCoordinate(queenCoordinates[0], queenCoordinates[1])
            actualQueensSubset.add(temp)
        }
        TestCase.assertTrue(actualQueensSubset.containsAll(expectedQueensSubset))
        TestCase.assertTrue(expectedQueensSubset == actualQueensSubset)
    }


    data class QueenCoordinate(val row: Int, val col: Int)
}