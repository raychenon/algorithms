package com.raychenon.hackerrank.tree;

/**
 * User: raychenon
 * Date: 3/3/19
 * https://www.hackerrank.com/challenges/tree-height-of-a-binary-tree/problem
 */
public class BinaryTreeHeight {

    public static int height(Node root) {
        int accHeight = 0;
        if (root.left != null) {
            accHeight = 1 + height(root.left);
        }

        if (root.right != null) {
            accHeight = 1 + height(root.right);
        }
        return accHeight;
    }

}
