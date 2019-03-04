package com.raychenon.hackerrank.tree;

/**
 * User: raychenon
 * Date: 3/3/19
 * https://www.hackerrank.com/challenges/tree-height-of-a-binary-tree/problem
 */
public class BinaryTreeHeight {

    public static int height(Node root) {
        if (root == null) {
            // if both left and right were null then max() will return -1,
            // together they would return 0
            return -1;
        }

        int left = 1 + height(root.left);
        int right = 1 + height(root.right);
        return Math.max(left, right);
    }

}
