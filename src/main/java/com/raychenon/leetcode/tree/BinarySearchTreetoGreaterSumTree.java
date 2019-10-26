package com.raychenon.leetcode.tree;

/**
 * User: raychenon
 * Date: 2019-10-24
 * https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/
 */
public class BinarySearchTreetoGreaterSumTree {

    /**
     * Given the root of a binary search tree with distinct values,
     * modify it so that every node has a new value equal to the sum of the values of the original tree that are greater than or equal to node.val.
     * @param root
     * @return
     */
    public TreeNode bstToGst(TreeNode root) {
        int[] sum = new int[1];
        inOrder(root, sum);
        return root;
    }

    public void inOrder(TreeNode root, int[] sum) {
        if (root == null) return;
        // traverse from right to left, to give us reversed in_order traversal
        inOrder(root.right, sum);
        sum[0] += root.value;
        root.value = sum[0];
        inOrder(root.left, sum);
    }
}
