package com.raychenon.leetcode.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

/**
 * User: raychenon
 * Date: 2019-10-07
 * https://leetcode.com/problems/merge-two-binary-trees/
 * https://leetcode.com/problems/invert-binary-tree/
 */
public class TreeNode {
    public int value;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        value = x;
    }

    private String getValue() {
        return String.valueOf(value);
    }

    public String preOrderPath() {
        TreeNode root = this;
        Stack<TreeNode> stack = new Stack<>();

        if (root == null) {
            return "";
        } else {
            stack.push(root);
        }

        TreeNode currentNode = root;
        List<TreeNode> preOrderList = new LinkedList<TreeNode>();

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
        return preOrderList.stream().map(TreeNode::getValue).collect(Collectors.joining(","));
    }

    public String preOrderTraversalOutput() {
        return preOrderIterativeList(this).stream().map(TreeNode::getValue).collect(Collectors.joining(" "));
    }

    /**
     * time complexity : O(n)
     * space complexity : O(h) for the Stack where h is the height of the Tree
     */
    private List<TreeNode> preOrderIterativeList(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode currentNode = root;
        List<TreeNode> preOrderList = new LinkedList<TreeNode>();

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
