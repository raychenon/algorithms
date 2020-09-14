package com.raychenon.leetcode.tree;

import java.util.LinkedList;
import java.util.Queue;

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
        if (t1 == null && t2 == null) {
            return true;
        }
        if (t1 == null || t2 == null) {
            return false;
        }
        return (t1.value == t2.value)
                && isSymmetricRec(t1.right, t2.left)
                && isSymmetricRec(t1.left, t2.right);

    }


    /**
     * Iterative
     * Time complexity: O(n)
     * Space complexity: O(n)
     *
     * @param root
     * @return
     */
    public boolean isSymmetricIter(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode t1 = q.poll();
            TreeNode t2 = q.poll();

            if (t1 == null && t2 == null) {
                continue; // next loop
            }

            if (t1 == null || t2 == null) {
                return false;
            }

            q.add(t1.left);
            q.add(t2.right);

            q.add(t1.right);
            q.add(t2.left);
        }
        return true;
    }

}
