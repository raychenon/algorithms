package com.raychenon.kotlin.leetcode.graph

import junit.framework.TestCase
import org.junit.Test

class CountUnreachablePairsofNodesinanUndirectedGraphTest {

    @Test
    fun example1Test() {
        val n = 3
        val edges = arrayOf(intArrayOf(0, 1), intArrayOf(0, 2), intArrayOf(1, 2))
        TestCase.assertEquals(0, CountUnreachablePairsofNodesinanUndirectedGraph.countPairs(n, edges))
    }


    @Test
    fun example2Test() {
        val n = 7
        val edges = arrayOf(intArrayOf(0, 2), intArrayOf(0, 5), intArrayOf(2, 4), intArrayOf(1, 6), intArrayOf(5, 4))
        TestCase.assertEquals(14, CountUnreachablePairsofNodesinanUndirectedGraph.countPairs(n, edges))
    }

}