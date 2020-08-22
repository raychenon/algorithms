package com.raychenon.kotlin.leetcode

import java.util.*
import kotlin.collections.HashSet

/**
 * User: raychenon
 * Date: 22/8/2020
 * https://leetcode.com/contest/biweekly-contest-33/problems/minimum-number-of-vertices-to-reach-all-nodes/
 * https://leetcode.com/problems/minimum-number-of-vertices-to-reach-all-nodes/
 * <p>
 * https://leetcode.com/problems/minimum-number-of-vertices-to-reach-all-nodes/discuss/805830/Intuitive-solution-in-JavaKotlin-.-No-DAG-knowledge-needed
 */
object MinimumNumberofVerticestoReachAllNodes {

    fun findSmallestSetOfVertices(n: Int, edges: List<List<Int>>): List<Int> {
        // Hint notice that the unreachable vertices are not destination(2nd element in sublist)
        val destinations: MutableSet<Int> = HashSet()
        val ansSet: MutableSet<Int> = TreeSet() // TreeSet to sort the vertices
        for (edge in edges) {
            destinations.add(edge[1])
        }
        for (edge in edges) {
            val vertex = edge[0]
            if (!destinations.contains(vertex)) {
                ansSet.add(vertex)
            }
        }

        return ansSet.toList()
    }
}