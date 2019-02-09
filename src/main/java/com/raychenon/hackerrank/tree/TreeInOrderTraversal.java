package com.raychenon.hackerrank.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * User: raychenon
 * Date: 8/2/19
 * https://www.hackerrank.com/challenges/tree-inorder-traversal/problem
 */
public class TreeInOrderTraversal {


//    public static void inOrder(Node root) {
//
//    }

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

        //   1. Traverse the left subtree, i.e., call inOrder(left-subtree)
        if (root.left != null) {
            inOrderRecursive(root.left, str);
        }
        //   2. Visit the root.
        str.append(String.format("%d ", root.data));

        //   3. Traverse the right subtree  i.e., call inOrder(right-subtree)
        if (root.right != null) {
            inOrderRecursive(root.right, str);
        }

        return str;
    }

    /**
     * time complexity : O(n)
     * space complexity : O(h) for the Stack where h is the height of the Tree
     *      + O(n) for the List. List is optional
     * @param root
     * @return
     */
    public static StringBuilder inOrderIterative(Node root) {
        Node current = root;
        Stack<Node> stack = new Stack<>();
        List<Node> inOrderList = new LinkedList<>();

        while (current != null || stack.size() > 0) {
            // reach the left most node
            while(current != null){
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            inOrderList.add(current);

            current = current.right;
        }

        StringBuilder str = new StringBuilder();
        for (Node node : inOrderList) {
            str.append(String.format("%d ", node.data));
        }

        return str;
    }

}
