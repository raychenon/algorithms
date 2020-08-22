package com.raychenon.kotlin.leetcode.graph

import junit.framework.TestCase
import org.junit.Test

/**
 * User: raychenon
 * Date: 22/8/2020
 * https://leetcode.com/contest/biweekly-contest-33/problems/minimum-number-of-vertices-to-reach-all-nodes/
 * https://leetcode.com/problems/minimum-number-of-vertices-to-reach-all-nodes/
 * <p>
 * https://leetcode.com/problems/minimum-number-of-vertices-to-reach-all-nodes/discuss/805830/Intuitive-solution-in-JavaKotlin-.-No-DAG-knowledge-needed
 */
class MinimumNumberofVerticestoReachAllNodesTest {

    @Test
    fun example1Test() {
        evaluteMinimumNumberofVerticestoReachAllNodesTest(
            listOf(0, 3),
            6,
            listOf(
                listOf(0, 1),
                listOf(0, 2),
                listOf(2, 5),
                listOf(3, 4),
                listOf(4, 2)
            )
        )
    }

    @Test
    fun example2Test() {
        // [[0,1],[2,1],[3,1],[1,4],[2,4]]
        evaluteMinimumNumberofVerticestoReachAllNodesTest(
            listOf(0, 2, 3),
            5,
            listOf(
                listOf(0, 1),
                listOf(2, 1),
                listOf(3, 1),
                listOf(1, 4),
                listOf(2, 4)
            )
        )
    }


    private fun evaluteMinimumNumberofVerticestoReachAllNodesTest(
        expectedNbVertices: List<Int>,
        n: Int,
        edges: List<List<Int>>
    ) {
        TestCase.assertEquals(
            expectedNbVertices,
            com.raychenon.kotlin.leetcode.MinimumNumberofVerticestoReachAllNodes.findSmallestSetOfVertices(n, edges)
        )
    }

}