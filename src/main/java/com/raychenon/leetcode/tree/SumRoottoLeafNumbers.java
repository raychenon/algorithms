package com.raychenon.leetcode.tree;

/**
 * User: raychenon
 * Date: 27/6/2020
 * https://leetcode.com/problems/sum-root-to-leaf-numbers/
 */
public class SumRoottoLeafNumbers {

    /**
     * Time complexity: O(N) since one has to visit each node.
     * Space complexity: O(H), where H is a tree height.
     *
     * @param root
     * @return
     */
    public int sumNumbersRecursive(TreeNode root) {
        return traverse(root, 0);
    }

    private int traverse(TreeNode node, int prefix) {
        if (node == null) return prefix;

        int current = prefix * 10 + node.value;
        //System.out.println("current = " + current);
        int left = 0;
        int right = 0;

        if (node.left == null && node.right == null) {
            return current;
        }

        if (node.left != null) {
            left = traverse(node.left, current);
        }
        if (node.right != null) {
            right = traverse(node.right, current);
        }

        //System.out.println("current = " + current + " , left  = " + left + " , right = " + right);
        return left + right;

    }

}
