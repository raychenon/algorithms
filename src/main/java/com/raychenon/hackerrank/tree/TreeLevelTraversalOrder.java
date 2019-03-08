package com.raychenon.hackerrank.tree;

import java.util.Stack;

/**
 * User: raychenon
 * Date: 8/3/19
 * https://www.hackerrank.com/challenges/tree-level-order-traversal/problem
 */
public class TreeLevelTraversalOrder {

    /**
     * In level order traversal, we visit the nodes level by level from left to right.
     *
     * @param root
     * @return String
     */
    public static String levelOrder(Node root) {
        if (root == null) {
            return "";
        }

        Stack<Node> stack = new Stack();
        stack.push(root);

        StringBuilder str = new StringBuilder();
        while (!stack.isEmpty()) {
            Node n = stack.pop();
            str.append(n.data).append(" ");

            if (n.left != null) {
                stack.push(n.left);
            }

            if (n.right != null) {
                stack.push(n.right);
            }

        }
        return str.substring(0, str.length() - 1);
    }

}
