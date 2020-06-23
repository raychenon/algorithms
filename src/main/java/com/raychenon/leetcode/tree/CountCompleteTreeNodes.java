package com.raychenon.leetcode.tree;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * User: raychenon
 * Date: 23/6/2020
 * https://leetcode.com/problems/count-complete-tree-nodes
 */
public class CountCompleteTreeNodes {
    
    /**
     * Time complexity: O(n), n being the number of Nodes
     * Space complexity: O(d), to keep the recursion stack, where d is a tree depth.
     *
     * @param root
     * @return
     */
    public int countNodesRecursive(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return 1 + countNodesRecursive(root.right) + countNodesRecursive(root.left);
    }

    /**
     * Time complexity: O(n)
     * Space complexity: O(n), n being the number of Nodes
     *
     * @param root
     * @return
     */
    public int countNodesBFS(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
        queue.add(root);
        TreeNode current;
        int counter = 1;

        while (!queue.isEmpty()) {
            current = queue.poll();
            if (current.left != null) {
                queue.add(current.left);
                counter++;
            }
            if (current.right != null) {
                queue.add(current.right);
                counter++;
            }
        }
        return counter;
    }
}
