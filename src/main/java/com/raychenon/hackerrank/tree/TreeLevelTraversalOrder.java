package com.raychenon.hackerrank.tree;

import java.util.LinkedList;

/**
 * User: raychenon
 * Date: 8/3/19
 * https://www.hackerrank.com/challenges/tree-level-order-traversal/problem
 */
public class TreeLevelTraversalOrder {

    /**
     * In level order traversal, we visit the nodes level by level from left to right.
     * => Breadth First Search ( BFS ) , use a Queue
     *
     * @param root
     * @return String
     */
    public String levelOrder(Node root) {
        if (root == null) {
            return "";
        }

        LinkedList<Node> queue = new LinkedList<Node>();
        queue.add(root);

        StringBuilder str = new StringBuilder();
        while (!queue.isEmpty()) {
            Node n = queue.poll();
            str.append(n.data).append(" ");

            if (n.left != null) {
                queue.add(n.left);
            }

            if (n.right != null) {
                queue.add(n.right);
            }

        }
        return str.deleteCharAt(str.length() - 1).toString();
    }

}
