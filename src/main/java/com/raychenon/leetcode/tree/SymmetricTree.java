package com.raychenon.leetcode.tree;

/**
 * User: raychenon
 * Date: 14/9/2020
 * https://leetcode.com/problems/symmetric-tree/
 */
public class SymmetricTree {

    /**
     * Recursive
     * Time complexity: O(n)
     * Space complexity: O(n)
     *
     * @param root
     * @return
     */
    public boolean isSymmetricRec(TreeNode root) {
        if (root == null) return true;
        return isSymmetricRec(root.left, root.right);
    }

    private boolean isSymmetricRec(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return true;
        if (t1 == null || t2 == null) return false;
        return (t1.value == t2.value)
                && isSymmetricRec(t1.right, t2.left)
                && isSymmetricRec(t1.left, t2.right);

    }
}
