package com.raychenon.leetcode.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * User: raychenon
 * Date: 2019-10-21
 * https://leetcode.com/problems/invert-binary-tree/
 */
public class InvertBinaryTree {

    /**
     * swap the left and right child of all nodes in the tree.
     *
     * @param root
     * @return
     */
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        TreeNode right = invertTree(root.right);
        TreeNode left = invertTree(root.left);

        root.left = right;
        root.right = left;

        return root;
    }

    /**
     * Swap the left and right child of all nodes in the tree
     *
     * time complexity: O(n)
     * space complexity: O(n
     * @param root
     * @return
     */
    public TreeNode invertTreeIter(TreeNode root) {
        if (root == null) return null;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            TreeNode temp = current.left;
            current.left = current.right;
            current.right = temp;
            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }

        return root;
    }
}
