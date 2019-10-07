package com.raychenon.leetcode.tree;

import java.util.Stack;

/**
 * User: raychenon
 * Date: 2019-10-07
 * https://leetcode.com/problems/merge-two-binary-trees/
 */
public class MergeBinaryTrees {

    /**
     * Preorder traversal is used to create a copy of the tree.
     *
     * @param t1
     * @param t2
     * @return
     */
    public TreeNode mergeTreesRecursive(TreeNode t1, TreeNode t2) {
        if (t1 == null) return t2;
        if (t2 == null) return t1;

        // t2 is copied into t1
        t1.val += t2.val;
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);

        return t1;
    }

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) return t2;

        Stack<PairNode> stack = new Stack<>();
        stack.push(new PairNode(t1, t2));

        while (!stack.isEmpty()) {

            PairNode t = stack.pop();

            if (t.t1 == null || t.t2 == null) {
                continue;
            }
            t.t1.val += t.t2.val;

            // If the left child of the first tree doesn't exist,
            // append the left child(subtree) of the second tree to the current node
            if (t.t1.left == null) {
                t.t1.left = t.t2.left;
            } else {
                // if the left child of the first tree exists, we push the left child(pair) of both the trees onto the stack
                stack.push(new PairNode(t1.left, t2.left));
            }

            if (t.t1.right == null) {
                t.t1.right = t.t2.right;
            } else {
                stack.push(new PairNode(t1.right, t2.right));
            }
        }

        return t1;
    }

    static class PairNode {
        TreeNode t1;
        TreeNode t2;

        PairNode(TreeNode t1, TreeNode t2) {
            this.t1 = t1;
            this.t2 = t2;
        }
    }

}
