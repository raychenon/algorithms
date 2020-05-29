package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 29/5/2020
 * https://leetcode.com/problems/possible-bipartition/
 */
object PossibleBipartition {

    /**
     * Time complexity : O(E+V) E edges , V vertices
     * Space complexity : O(E*V)
     * <p>
     * Best explanation : https://youtu.be/0ACfAqs8mm0?t=575
     * A bipartite graph can only have even edges. == > odd edges means Not bipartite
     *
     * @param N
     * @param dislikes
     * @return
     */
    fun possibleBipartition(N: Int, dislikes: Array<IntArray>): Boolean {
        val graph = Array(N) { IntArray(N) }
        for (d in dislikes) {
            graph[d[0] - 1][d[1] - 1] = 1
            graph[d[1] - 1][d[0] - 1] = 1
        }
        val group = IntArray(N)
        for (i in 0 until N) {
            if (group[i] == 0 && !dfs(graph, group, i, 1)) return false
        }
        return true
    }


    /**
     * color: parameter is to separate the group of Bipartite (1 or -1) 0  if uninitialized
     */
    fun dfs(graph: Array<IntArray>, group: IntArray, index: Int, color: Int): Boolean {
        group[index] = color
        for (i in 0 until graph.size) {
            if (graph[index][i] == 1) {
                if (group[i] == color) return false
                if (group[i] == 0 &&
                    !dfs(graph, group, index, -color) // -color to flip the value
                ) return false
            }
        }
        return true
    }
}