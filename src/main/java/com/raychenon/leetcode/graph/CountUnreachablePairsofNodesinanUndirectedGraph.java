package com.raychenon.leetcode.graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * https://leetcode.com/problems/count-unreachable-pairs-of-nodes-in-an-undirected-graph/
 */
public class CountUnreachablePairsofNodesinanUndirectedGraph {
    public long countPairs(int n, int[][] edges) {
        int len = edges.length;
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        for (int i = 0; i < len; i++) {
            // undirected graph
            graph.computeIfAbsent(edges[i][0], k -> new HashSet<Integer>()).add(edges[i][1]);
            graph.computeIfAbsent(edges[i][1], k -> new HashSet<Integer>()).add(edges[i][0]);
        }

        boolean[] visited = new boolean[n];

        long nbPairs = 0L;
        long sizeOfComponents = 0L;
        long remainingNodes = n;
        for (int nodeId = 0; nodeId < n; nodeId++) {
            if (!visited[nodeId]) {
                sizeOfComponents = dfsEdges(nodeId, graph, visited);
                nbPairs += sizeOfComponents * (remainingNodes - sizeOfComponents);
                remainingNodes -= sizeOfComponents;
            }
        }
        return nbPairs;
    }

    private int dfsEdges(int nodeId, Map<Integer, Set<Integer>> graph, boolean[] visited) {

        int count = 1;
        if (visited[nodeId]) return count;

        visited[nodeId] = true;

        if (!graph.containsKey(nodeId)) return count;

        final Set<Integer> closeNeighbors = graph.get(nodeId);
        for (Integer neig : closeNeighbors) {
            if (!visited[neig]) {
                count += dfsEdges(neig, graph, visited);
            }
        }
        return count;
    }
}
