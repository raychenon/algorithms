package com.raychenon.leetcode.graph;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 22/8/2020
 * https://leetcode.com/contest/biweekly-contest-33/problems/minimum-number-of-vertices-to-reach-all-nodes/
 * https://leetcode.com/problems/minimum-number-of-vertices-to-reach-all-nodes/
 *
 * https://leetcode.com/problems/minimum-number-of-vertices-to-reach-all-nodes/discuss/805830/Intuitive-solution-in-JavaKotlin-.-No-DAG-knowledge-needed
 */
public class MinimumNumberofVerticestoReachAllNodesTest {

    private static MinimumNumberofVerticestoReachAllNodes minimumNumberofVerticestoReachAllNodes;

    @BeforeClass
    public static void setUp() {
        minimumNumberofVerticestoReachAllNodes = new MinimumNumberofVerticestoReachAllNodes();
    }

    @Test
    public void example1Test() {
        evaluteMinimumNumberofVerticestoReachAllNodesTest(List.of(0, 3), 6, List.of(List.of(0, 1), List.of(0, 2), List.of(2, 5), List.of(3, 4), List.of(4, 2)));
    }

    @Test
    public void example2Test() {
        // [[0,1],[2,1],[3,1],[1,4],[2,4]]
        evaluteMinimumNumberofVerticestoReachAllNodesTest(List.of(0, 2, 3), 5, List.of(List.of(0, 1), List.of(2, 1), List.of(3, 1), List.of(1, 4), List.of(2, 4)));
    }


    private void evaluteMinimumNumberofVerticestoReachAllNodesTest(List<Integer> expectedNbVertices, int n, List<List<Integer>> edges) {
        assertEquals(expectedNbVertices, minimumNumberofVerticestoReachAllNodes.findSmallestSetOfVertices(n, edges));
    }
}
