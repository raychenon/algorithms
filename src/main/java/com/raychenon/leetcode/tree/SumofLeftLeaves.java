package com.raychenon.leetcode.tree;

import java.util.ArrayDeque;
import java.util.Deque;

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
        if ((root.left == null &&
                root.right == null) &&
                isLeft) {
            return root.value;
        }

        // go deeper
        TreeNode temp = root;
        return leftLeaf(temp.left, true) + leftLeaf(temp.right, false);
    }

    public int sumOfLeftLeavesRec2(TreeNode root) {
        if (root == null) return 0;

        if (root.left != null &&
                (root.left.left == null &&
                        root.left.right == null)) {
            return root.left.value + sumOfLeftLeavesRec2(root.right);
        } else {
            return sumOfLeftLeavesRec2(root.left) + sumOfLeftLeavesRec2(root.right);
        }
    }


    /**
     * Pre-order() traversal DFS
     * <p>
     * Time complexity: O(n)
     * Space complexity: O(n)
     *
     * @param root
     * @return
     */
    public int sumOfLeftLeavesIter(TreeNode root) {
        if (root == null) return 0;

        int total = 0;
        Deque<TreeNode> stack = new ArrayDeque<TreeNode>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode subRoot = stack.pop();
            if (isLeaf(subRoot.left)) {
                total += subRoot.left.value;
            }
            if (subRoot.right != null) {
                stack.push(subRoot.right);
            }
            if (subRoot.left != null) {
                stack.push(subRoot.left);
            }
        }
        return total;
    }

    private boolean isLeaf(TreeNode node) {
        return node != null &&
                (node.left == null &&
                        node.right == null);
    }

}
