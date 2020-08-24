package com.raychenon.leetcode.tree;

/**
 * User: raychenon
 * Date: 24/8/2020
 * https://leetcode.com/problems/sum-of-left-leaves/
 */
public class SumofLeftLeaves {

    public int sumOfLeftLeavesRec(TreeNode root) {
        if (root == null) return 0;

        if (root.left != null && root.left.left == null && root.left.right == null) {
            return root.left.value + sumOfLeftLeavesRec(root.right);
        } else {
            return sumOfLeftLeavesRec(root.left) + sumOfLeftLeavesRec(root.right);
        }
    }
}
