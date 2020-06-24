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
     *
     * Use the fact that the tree is a "complete binary tree" every level.
     * In a complete binary tree every level, except possibly the last,
     * is completely filled, and all nodes in the last level are as far left as possible.
     *
     * total number of nodes = (2^h-1) + nb nodes in last level
     * nb nodes in last level is found by binary search
     * <p>
     * Time complexity: O(h), where h is the height of the tree
     * Space complexity: O(1)
     *
     * @param root
     * @return
     */
    public int countNodesBinarySearch(TreeNode root) {
        if (root == null) return 0;
        TreeNode leftNode = root;
        TreeNode rightNode = root;
        int hl = 0, hr = 0;

        // left node traversal will give the height (hl)
        while (leftNode != null) {
            hl += 1;
            leftNode = leftNode.left;
        }

        while (rightNode != null) {
            hr += 1;
            rightNode = rightNode.right;
        }

        if (hl == hr) {
            return (1 << hl) - 1;  // left shift (2^hl -1)
        }
        return 1 + countNodesBinarySearch(root.left) + countNodesBinarySearch(root.right);
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
