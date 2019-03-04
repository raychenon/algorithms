package com.raychenon.hackerrank.tree;

/**
 * User: raychenon
 * Date: 3/3/19
 * https://www.hackerrank.com/challenges/tree-height-of-a-binary-tree/problem
 */
public class BinaryTreeHeight {

    public static int height(Node root) {
        if (root != null) {
            return 1 + Math.max(height(root.left), height(root.right));
        } else {
            // if both left and right were null then max() will return -1,
            // together they would return 0
            return -1;
        }
    }

}
