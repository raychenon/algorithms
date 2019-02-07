package com.raychenon.hackerrank.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * User: raychenon
 * Date: 6/2/19
 * https://www.hackerrank.com/challenges/tree-postorder-traversal/problem
 */
public class TreePostorderTraversal {

    // IGNORE for codecov.io
//    public static void postOrder(Node root) {
//        System.out.print(postOrderRecursive(root).toString());
//    }

    // easier to test with a String out with Junit
    public static StringBuilder postOrderRecursive(Node root) {
        StringBuilder str = new StringBuilder();
        postOrderRecursive(root, str);
        return str;
    }

    /**
     * time complexity : O(n)
     * space complexity : O(1)
     *
     * @param root
     */
    private static StringBuilder postOrderRecursive(Node root, StringBuilder str) {
        if (root == null) {
            return str.append("");
        }

        //   1. Traverse the left subtree, i.e., call Postorder(left-subtree)
        if (root.left != null) {
            postOrderRecursive(root.left, str);
        }
        //   2. Traverse the right subtree, i.e., call Postorder(right-subtree)
        if (root.right != null) {
            postOrderRecursive(root.right, str);
        }
        //   3. Visit the root.

        return str.append(String.format("%d ", root.data));
    }

    public static StringBuilder postOrderIterative(Node root) {
        Node t = root;
        Stack<Node> stack = new Stack<>();
        stack.push(root);

        List<Node> postOrder = new LinkedList<>();

        while (!stack.isEmpty() && root != null) {
            root = stack.peek();
            if ((root.left == null && root.right == null)
                    || (t == root.left || t == root.right)) {
                postOrder.add(root);
                stack.pop();
                t = root;
            } else {
                if (root.right != null) {
                    stack.push(root.right);
                }

                if (root.left != null) {
                    stack.push(root.left);
                }
            }
        }

        StringBuilder str = new StringBuilder();
        for (Node node : postOrder) {
            str.append(String.format("%d ", node.data));
        }

        return str;
    }


}
