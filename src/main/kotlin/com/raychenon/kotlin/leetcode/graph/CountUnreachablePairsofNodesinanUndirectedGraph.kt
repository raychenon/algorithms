package com.raychenon.kotlin.leetcode.graph

/**
 * https://leetcode.com/problems/count-unreachable-pairs-of-nodes-in-an-undirected-graph/
 */
object CountUnreachablePairsofNodesinanUndirectedGraph {

    fun countPairs(n: Int, edges: Array<IntArray>): Long {
        val len = edges.size
        val graph = mutableMapOf<Int, MutableSet<Int>>()

        for (i in 0 until len) {
            graph.computeIfAbsent(edges[i][0], { mutableSetOf<Int>() }).add(edges[i][1])
            graph.computeIfAbsent(edges[i][1], { mutableSetOf<Int>() }).add(edges[i][0])
        }

        val visited = BooleanArray(n)

        var nbPairs = 0L
        var sizeOfComponents = 0L
        var remainingNodes = n.toLong()
        for (nodeId in 0 until n) {
            if (!visited[nodeId]) {
                sizeOfComponents = dfsEdges(nodeId, graph, visited).toLong()
                nbPairs += sizeOfComponents * (remainingNodes - sizeOfComponents);
                remainingNodes -= sizeOfComponents;
            }
        }

        return nbPairs
    }

    private fun dfsEdges(nodeId: Int, graph: Map<Int, Set<Int>>, visited: BooleanArray): Int {
        var count = 1
        if (visited[nodeId]) return count

        visited[nodeId] = true

        graph.get(nodeId)?.forEach {
            if (!visited[it]) {
                count += dfsEdges(it, graph, visited)
            }
        }

        return count
    }

}