package com.raychenon.leetcode.tree;

import kotlin.Pair;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;

/**
 * User: raychenon
 * Date: 8/8/2020
 * https://leetcode.com/problems/vertical-order-traversal-of-a-binary-tree/
 */
public class VerticalOrderTraversalofaBinaryTree {

    /**
     * Time complexity: O(n*log(n/k))
     * Space complexity: O(n)
     *
     * @param root
     * @return
     */
    public List<List<Integer>> verticalTraversalDFS(TreeNode root) {
        List<List<Integer>> output = new ArrayList<>();
        if (root == null) return output;

        this.DFS(root, 0, 0);
        for (int i = minColumn; i <= maxColumn; ++i) {
            Collections.sort(columnTable.get(i), new Comparator<Pair<Integer, Integer>>() {
                @Override
                public int compare(Pair<Integer, Integer> p1, Pair<Integer, Integer> p2) {
                    if (p1.getFirst().equals(p2.getFirst()))
                        return p1.getSecond() - p2.getSecond();
                    else
                        return p1.getFirst() - p2.getFirst();
                }
            });

            List<Integer> sortedColumn = new ArrayList<>();
            for (Pair<Integer, Integer> p : columnTable.get(i)) {
                sortedColumn.add(p.getSecond());
            }
            output.add(sortedColumn);
        }

        return output;
    }

    Map<Integer, ArrayList<Pair<Integer, Integer>>> columnTable = new HashMap();
    int minColumn = 0, maxColumn = 0;

    private void DFS(TreeNode node, Integer row, Integer column) {
        if (node == null)
            return;

        if (!columnTable.containsKey(column)) {
            this.columnTable.put(column, new ArrayList<Pair<Integer, Integer>>());
        }

        this.columnTable.get(column).add(new Pair<Integer, Integer>(row, node.value));
        this.minColumn = Math.min(minColumn, column);
        this.maxColumn = Math.max(maxColumn, column);
        // preorder DFS traversal
        this.DFS(node.left, row + 1, column - 1);
        this.DFS(node.right, row + 1, column + 1);
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        dfs(root, 0, 0, map);
        List<List<Integer>> output = new ArrayList<>();
        for (TreeMap<Integer, PriorityQueue<Integer>> ys : map.values()) {
            output.add(new ArrayList<>());
            for (PriorityQueue<Integer> nodes : ys.values()) {
                while (!nodes.isEmpty()) {
                    output.get(output.size() - 1).add(nodes.poll());
                }
            }
        }
        return output;
    }

    private void dfs(TreeNode root, int x, int y, TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map) {
        if (root == null) return;

        if (!map.containsKey(x)) {
            map.put(x, new TreeMap<>());
        }

        if (!map.get(x).containsKey(y)) {
            map.get(x).put(y, new PriorityQueue<>());
        }

        map.get(x).get(y).offer(root.value);
        dfs(root.left, x - 1, y + 1, map);
        dfs(root.right, x + 1, y + 1, map);
    }
}
