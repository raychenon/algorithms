package com.raychenon.leetcode.tree;

/**
 * User: raychenon
 * Date: 2019-10-24
 * https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/
 */
public class BinarySearchTreetoGreaterSumTree {

    int previous = 0;

    /**
     * Given the root of a binary search tree with distinct values,
     * modify it so that every node has a new value equal to the sum of the values of the original tree that are greater than or equal to node.val.
     * <p>
     * <p>
     * We need to do the work from biggest to smallest, right to left.
     * "previous" will record the previous value the we get, which the total sum of bigger values.
     * For each node, we update root.val with root.val + pre.
     *
     * @param root
     * @return
     */
    public TreeNode bstToGst(TreeNode root) {
        if (root.right != null) bstToGst(root.right);
        previous = root.value = previous + root.value;
        if (root.left != null) bstToGst(root.left);
        return root;
    }

}
