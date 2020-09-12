package com.raychenon.leetcode.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * User: raychenon
 * Date: 11/9/2020
 * https://leetcode.com/problems/binary-tree-level-order-traversal/
 */
public class BinaryTreeLevelOrderTraversal {

    /**
     * Recursive
     * Time complexity: O(n)
     * Space complexity: O(n)
     *
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrderRec(TreeNode root) {
        List<List<Integer>> levels = new LinkedList<List<Integer>>();
        if (root == null) {
            return levels;
        }
        levelOrderRec(root, 0, levels);
        return levels;
    }

    private void levelOrderRec(TreeNode node, int level, List<List<Integer>> levels) {
        if (levels.size() == level) {
            levels.add(new LinkedList<>());
        }
        levels.get(level).add(node.value);

        if (node.left != null) {
            levelOrderRec(node.left, level + 1, levels);
        }

        if (node.right != null) {
            levelOrderRec(node.right, level + 1, levels);
        }
    }


    /**
     * Iterative
     * Time complexity: O(n)
     * Space complexity: O(n)
     *
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levels = new LinkedList<>();
        if (root == null) {
            return levels;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;
        while (!queue.isEmpty()) {
            levels.add(new LinkedList<>());

            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.remove();

                levels.get(level).add(node.value);

                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            level++;
        }

        return levels;
    }
}
