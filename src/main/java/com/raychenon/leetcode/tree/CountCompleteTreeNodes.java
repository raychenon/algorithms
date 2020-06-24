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
     * https://www.youtube.com/watch?v=i_r2uKbwHCU
     * <p>
     * Time complexity: O(h), where h is the height of the tree
     * Space complexity: O(1)
     *
     * @param root
     * @return
     */
    public int countNodesDepth(TreeNode root) {
        if (root == null) return 0;
        TreeNode left = root;
        TreeNode right = root;
        int hl = 0, hr = 0;

        while (left != null) {
            hl += 1;
            left = left.left;
        }

        while (right != null) {
            hr += 1;
            right = right.right;
        }

        if (hl == hr) {
            return (1 << hl) - 1;
        }
        return 1 + countNodesDepth(root.left) + countNodesDepth(root.right);
    }

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
