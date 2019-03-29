package com.raychenon.hackerrank.tree;

/**
 * User: raychenon
 * Date: 29/3/19
 * https://www.hackerrank.com/challenges/is-binary-search-tree/problem
 */
public class BinarySearchTree {

    boolean checkBST(Node root) {
        if (root.left != null) {
            if (root.data < root.left.data) {
                return false;
            }
            return checkBST(root.left);
        }

        if (root.right != null) {
            if (root.data > root.right.data) {
                return false;
            }
            return checkBST(root.right);
        }

        return true;
    }

}
