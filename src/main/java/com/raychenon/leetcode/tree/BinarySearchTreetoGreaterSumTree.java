package com.raychenon.leetcode.tree;

/**
 * User: raychenon
 * Date: 2019-10-24
 * https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/
 */
public class BinarySearchTreetoGreaterSumTree {

    public TreeNode bstToGst(TreeNode root) {
        int[] sum = new int[1];
        inOrder(root, sum);
        return root;
    }

    public void inOrder(TreeNode root, int[] sum) {
        if (root == null) return;
        inOrder(root.right, sum);
        sum[0] += root.value;
        root.value = sum[0];
        inOrder(root.left, sum);
    }
}
