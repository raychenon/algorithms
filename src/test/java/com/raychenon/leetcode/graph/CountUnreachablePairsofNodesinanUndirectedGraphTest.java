package com.raychenon.leetcode.graph;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * https://leetcode.com/problems/count-unreachable-pairs-of-nodes-in-an-undirected-graph/
 */
public class CountUnreachablePairsofNodesinanUndirectedGraphTest {

    private static CountUnreachablePairsofNodesinanUndirectedGraph instance;

    @BeforeClass
    public static void setUp() {
        instance = new CountUnreachablePairsofNodesinanUndirectedGraph();
    }

    @Test
    public void example1Test() {
        int n = 3;
        int[][] edges = {
                {0, 1},
                {0, 2},
                {1, 2}
        };
        assertEquals(0, instance.countPairs(n, edges));
    }


    @Test
    public void example2Test() {
        int n = 7;
        int[][] edges = {
                {0, 2},
                {0, 5},
                {2, 4},
                {1, 6},
                {5, 4}
        };
        assertEquals(14, instance.countPairs(n, edges));
    }
}
