package com.raychenon.leetcode;

/**
 * User: raychenon
 * Date: 29/5/2020
 * https://leetcode.com/problems/possible-bipartition/
 */
public class PossibleBipartition {

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
    public boolean possibleBipartition(int N, int[][] dislikes) {
        int[][] graph = new int[N][N];
        for (int[] d : dislikes) {
            graph[d[0] - 1][d[1] - 1] = 1;
            graph[d[1] - 1][d[0] - 1] = 1;
        }
        int[] group = new int[N];
        for (int i = 0; i < N; i++) {
            if (group[i] == 0 && !dfs(graph, group, i, 1)) {
                return false;
            }
        }
        return true;
    }

    private boolean dfs(int[][] graph, int[] group, int index, int g) {
        group[index] = g;
        for (int i = 0; i < graph.length; i++) {
            if (graph[index][i] == 1) {
                if (group[i] == g) {
                    return false;
                }
                if (group[i] == 0 && !dfs(graph, group, i, -g)) {
                    return false;
                }
            }
        }
        return true;
    }
}
