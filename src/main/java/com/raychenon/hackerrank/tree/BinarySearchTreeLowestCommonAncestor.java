package com.raychenon.hackerrank.tree;

/**
 * User: raychenon
 * Date: 20/2/19
 * https://www.hackerrank.com/challenges/binary-search-tree-lowest-common-ancestor/problem
 */
public class BinarySearchTreeLowestCommonAncestor {


    public static Node lca(Node root, int v1, int v2) {

        // in binary tree,
        // - the left contains smaller value
        // - the right contains bigger value

        // if smaller, search the right node
        if (root.data < v1 && root.data < v2) {
            return lca(root.right, v1, v2);
        }

        // bigger than both, search in the left node
        if (root.data > v1 && root.data > v2) {
            return lca(root.left, v1, v2);
        }

        return root;
    }


    public static Node lcaIterative(Node root, int v1, int v2) {

        Node temp = root;
        while (true) {
            if (temp.data < v1 && temp.data < v2) {
                temp = temp.right;
            } else if (temp.data > v1 && temp.data > v2) {
                temp = temp.left;
            } else {
                return temp;
            }
        }
    }

}
