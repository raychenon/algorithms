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
     * space complexity : O(h) where h is the Tree's height. A stack is formed from previous recursive call
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

    /**
     * time complexity : O(n)
     * space complexity : O(h) for the Stack where h is the height of the Tree
     * + O(n) for the List. List is optional
     *
     * @param root
     * @return
     */
    public static StringBuilder postOrderIterative(Node root) {
        Node previousNode = root;
        Node currentNode = root;
        Stack<Node> stack = new Stack<>();
        stack.push(root);

        List<Node> postOrder = new LinkedList<>();

        while (!stack.isEmpty() && currentNode != null) {
            currentNode = stack.peek();
            // the current node itself is the last to be displayed after left and right
            if ((currentNode.left == null && currentNode.right == null)
                    || (previousNode == currentNode.left || previousNode == currentNode.right)) {
                postOrder.add(currentNode);
                stack.pop();
                previousNode = currentNode;
            } else {
                if (currentNode.right != null) {
                    stack.push(currentNode.right);
                }

                if (currentNode.left != null) {
                    stack.push(currentNode.left);
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
