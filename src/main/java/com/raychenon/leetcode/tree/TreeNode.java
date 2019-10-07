package com.raychenon.leetcode.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * User: raychenon
 * Date: 2019-10-07
 * https://leetcode.com/problems/merge-two-binary-trees/
 */
public class TreeNode {
    int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

    public StringBuilder preOrderIterative() {
        StringBuilder str = new StringBuilder();
        for (TreeNode node : preOrderIterativeList(this)) {
            str.append(String.format("%d ", node.val));
        }

        return str;
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
