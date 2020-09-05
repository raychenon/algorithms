package com.raychenon.kotlin.leetcode

import junit.framework.TestCase
import org.junit.Test

/**
 * User: raychenon
 * Date: 5/9/2020
 * https://leetcode.com/problems/partition-labels
 */
class PartitionLabelsTest {

    @Test
    fun ababcbacadefegdehijhklijTest() {
        evaluatePartitionLabels(listOf<Int>(9, 7, 8), ("ababcbacadefegdehijhklij"))
    }

    @Test
    fun ababcbadefegdehijhklijopopTest() {
        evaluatePartitionLabels(listOf<Int>(7, 7, 8, 4), ("ababcbadefegdehijhklijopop"))
    }

    @Test
    fun abcdefghijklTest() {
        evaluatePartitionLabels(listOf<Int>(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1), ("abcdefghijkl"))
    }

    private fun evaluatePartitionLabels(expected: List<Int>, S: String): Unit {
        TestCase.assertEquals(expected, PartitionLabels.partitionLabelsOriginalSolution(S))
    }
}