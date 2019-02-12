package com.raychenon.hackerrank.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * User: raychenon
 * Date: 12/2/19
 * https://www.hackerrank.com/challenges/tree-preorder-traversal/problem
 */
public class TreePreOrderTraversal {

    public static StringBuilder preOrderRecursive(Node root) {
        StringBuilder str = new StringBuilder();
        preOrderRecursive(root, str);
        return str;
    }

    private static StringBuilder preOrderRecursive(Node root, StringBuilder str) {
        if (root == null) {
            return str;
        }

        //  1. Visit the root.
        str.append(String.format("%d ", root.data));

        //  2. Traverse the left subtree, i.e., call Preorder(left-subtree)
        if (root.left != null) {
            preOrderRecursive(root.left, str);
        }

        //  3. Traverse the right subtree, i.e., call Preorder(right-subtree)
        if (root.right != null) {
            preOrderRecursive(root.right, str);
        }

        return str;
    }

    public static StringBuilder preOrderIterative(Node root) {
        StringBuilder str = new StringBuilder();
        for (Node node : preOrderIterativeList(root)) {
            str.append(String.format("%d ", node.data));
        }

        return str;
    }


    private static List<Node> preOrderIterativeList(Node root) {
        Stack<Node> stack = new Stack<>();
        Node currentNode = root;
        List<Node> preOrderList = new LinkedList<Node>();

        if (root == null) {
            return preOrderList;
        } else {
            stack.push(root);
        }

        while (!stack.isEmpty()) {
            currentNode = stack.pop();
            preOrderList.add(currentNode);

            if (currentNode.right != null) {
                stack.push(currentNode.right);
            }
            if (currentNode.left != null) {
                stack.push(currentNode.left);
            }
        }
        return preOrderList;
    }
}
