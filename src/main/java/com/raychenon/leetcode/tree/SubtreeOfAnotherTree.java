package com.raychenon.leetcode.tree;

/**
 * User: raychenon
 * Date: 8/3/2020
 * https://leetcode.com/problems/subtree-of-another-tree
 */
public class SubtreeOfAnotherTree {

    public boolean isSubtree(TreeNode s, TreeNode t) {
        return traverse(s, t);
    }

    public boolean equals(TreeNode x, TreeNode y) {
        if (x == null && y == null)
            return true;
        if (x == null || y == null)
            return false;
        return x.value == y.value && equals(x.left, y.left) && equals(x.right, y.right);
    }

    public boolean traverse(TreeNode s, TreeNode t) {
        return s != null && (equals(s, t) || traverse(s.left, t) || traverse(s.right, t));
    }

}
