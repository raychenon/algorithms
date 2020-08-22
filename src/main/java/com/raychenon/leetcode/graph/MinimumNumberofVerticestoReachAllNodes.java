package com.raychenon.leetcode.graph;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * User: raychenon
 * Date: 22/8/2020
 * https://leetcode.com/contest/biweekly-contest-33/problems/minimum-number-of-vertices-to-reach-all-nodes/
 * https://leetcode.com/problems/minimum-number-of-vertices-to-reach-all-nodes/
 * <p>
 * https://leetcode.com/problems/minimum-number-of-vertices-to-reach-all-nodes/discuss/805830/Intuitive-solution-in-JavaKotlin-.-No-DAG-knowledge-needed
 */
public class MinimumNumberofVerticestoReachAllNodes {

    /**
     * Notice that the unreachable vertices(output) are never the vertices destination(2nd element in sublist).
     * <p>
     * It means we only have to find the vertices(integers) that:
     * - are NOT in "to" (index 1) of the edge
     * - are in "from" (index 0) of the edge
     * <p>
     * Time complexity: O(n) , we iterate the edges twice.  n is the size of edges list.
     * Space complexity: O(n)
     *
     * @param n
     * @param edges
     * @return
     */
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        // ** Hint notice that 2nd element(destination) are not in the solutions

        // destination -> start
        //Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> destinations = new HashSet<>();
        Set<Integer> ansSet = new TreeSet<>();

        for (List<Integer> edge : edges) {
            destinations.add(edge.get(1));
        }

        for (List<Integer> edge : edges) {
            Integer vertex = edge.get(0);
            if (!destinations.contains(vertex)) {
                ansSet.add(vertex);
            }
        }

        return ansSet.stream().collect(Collectors.toList());
    }

}
