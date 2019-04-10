package com.raychenon.hackerrank.tree;

/**
 * User: raychenon
 * Date: 29/3/19
 * https://www.hackerrank.com/challenges/is-binary-search-tree/problem
 */
public class BinarySearchTree {

    boolean checkBST(Node root) {
        return checkBSTMinMax(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    boolean checkBSTMinMax(Node root, int low, int high) {
        if (root == null) return true;
        return (root.data > low && root.data < high) &&
                checkBSTMinMax(root.left, low, root.data) &&
                checkBSTMinMax(root.right, root.data, high);
    }

}
