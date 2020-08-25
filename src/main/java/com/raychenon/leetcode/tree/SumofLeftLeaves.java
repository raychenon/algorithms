package com.raychenon.leetcode.tree;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * User: raychenon
 * Date: 24/8/2020
 * https://leetcode.com/problems/sum-of-left-leaves/
 */
public class SumofLeftLeaves {

    /**
     * Recursive pass extra information to tell the node is left child
     * <p>
     * Time complexity: O(n)
     * Space complexity: O(n)
     *
     * @param root
     * @return
     */
    public int sumOfLeftLeavesRec1(TreeNode root) {
        if (root == null) return 0;
        return leftLeaf(root, false);
    }

    private int leftLeaf(TreeNode node, boolean isLeft) {
        if (node == null) return 0;
        // left leaf
        if (node.left == null &&
                node.right == null) {
            return isLeft ? node.value : 0;
        }

        // go deeper
        return leftLeaf(node.left, true) + leftLeaf(node.right, false);
    }

    /**
     * Recursive check if the left chil is a leaf node
     * <p>
     * Time complexity: O(n)
     * Space complexity: O(n)
     *
     * @param root
     * @return
     */
    public int sumOfLeftLeavesRec2(TreeNode root) {
        if (root == null) return 0;

        if (root.left != null &&
                (root.left.left == null &&
                        root.left.right == null)) {
            return root.left.value + sumOfLeftLeavesRec2(root.right);
        } else {
            return sumOfLeftLeavesRec2(root.left) + sumOfLeftLeavesRec2(root.right);
        }
    }


    /**
     * Pre-order() traversal DFS
     * <p>
     * Time complexity: O(n)
     * Space complexity: O(n)
     *
     * @param root
     * @return
     */
    public int sumOfLeftLeavesIter(TreeNode root) {
        if (root == null) return 0;

        int total = 0;
        Deque<TreeNode> stack = new ArrayDeque<TreeNode>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode subRoot = stack.pop();
            if (isLeaf(subRoot.left)) {
                total += subRoot.left.value;
            }
            if (subRoot.right != null) {
                stack.push(subRoot.right);
            }
            if (subRoot.left != null) {
                stack.push(subRoot.left);
            }
        }
        return total;
    }

    private boolean isLeaf(TreeNode node) {
        return node != null &&
                (node.left == null &&
                        node.right == null);
    }


    /**
     * Morris Tree Traversal (Pre-order)
     * <p>
     * Time complexity: O(n)
     * Space complexity: O(1)
     *
     * @param root
     * @return
     */
    public int sumOfLeftLeavesMorris(TreeNode root) {
        int total = 0;
        TreeNode currentNode = root;
        while (currentNode != null) {
            if (currentNode.left == null) {
                currentNode = currentNode.right;
            } else {
                TreeNode previous = currentNode.left;
                if (isLeaf(previous)) {
                    total += previous.value;
                }

                while (previous.right != null && !previous.right.equals(currentNode)) {
                    previous = previous.right;
                }

                if (previous.right == null) {
                    previous.right = currentNode;
                    currentNode = currentNode.left;
                } else {
                    previous.right = null;
                    currentNode = currentNode.right;
                }
            }
        }
        return total;
    }
}
