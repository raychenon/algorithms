package com.raychenon.leetcode.tree;

/**
 * User: raychenon
 * Date: 24/8/2020
 * https://leetcode.com/problems/sum-of-left-leaves/
 */
public class SumofLeftLeaves {

    public int sumOfLeftLeavesRec1(TreeNode root) {
        if (root == null) return 0;
        return leftLeaf(root.left, true) + leftLeaf(root.right, false);
    }

    private int leftLeaf(TreeNode root, boolean isLeft) {
        if (root == null) return 0;
        // left leaf
        if (isLeft && (root.left == null && root.right == null)) return root.value;

        // go deeper
        TreeNode temp = root;
        return leftLeaf(temp.left, true) + leftLeaf(temp.right, false);
    }

    public int sumOfLeftLeavesRec2(TreeNode root) {
        if (root == null) return 0;

        if (root.left != null && root.left.left == null && root.left.right == null) {
            return root.left.value + sumOfLeftLeavesRec2(root.right);
        } else {
            return sumOfLeftLeavesRec2(root.left) + sumOfLeftLeavesRec2(root.right);
        }
    }


}
