package com.raychenon.hackerrank.tree;

/**
 * User: raychenon
 * Date: 8/2/19
 * https://www.hackerrank.com/challenges/tree-inorder-traversal/problem
 */
public class TreeInOrderTraversal {


    public static void inOrder(Node root) {

    }

    public static StringBuilder inOrderRecursive(Node root) {
        StringBuilder str = new StringBuilder();
        inOrderRecursive(root, str);
        return str;
    }

    /**
     * time complexity : O(n)
     * space complexity : O(h) where h is the Tree's height. A stack is formed from previous recursive call
     *
     * @param root
     */
    private static StringBuilder inOrderRecursive(Node root, StringBuilder str) {
        if (root == null) {
            return str.append("");
        }

        //   1. Traverse the left subtree, i.e., call Postorder(left-subtree)
        if (root.left != null) {
            inOrderRecursive(root.left, str);
        }
        //   2. Traverse the right subtree, i.e., call Postorder(right-subtree)
        if (root.right != null) {
            inOrderRecursive(root.right, str);
        }
        //   3. Visit the root.

        return str.append(String.format("%d ", root.data));
    }

}
