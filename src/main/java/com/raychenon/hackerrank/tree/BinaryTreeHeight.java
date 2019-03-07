package com.raychenon.hackerrank.tree;

import java.util.Stack;

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

    public static int heightIterative(Node root) {
        if (root == null) {
            return -1;
        }

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        int left = 0;
        int right = 0;

        while (!stack.isEmpty()) {
            Node currentNode = stack.pop();

            if (currentNode.left != null) {
                left = left + 1;
                stack.push(currentNode.left);
            }

            if (currentNode.right != null) {
                right = right + 1;
                stack.push(currentNode.right);
            }
        }

        return Math.max(left, right);
    }


}
