package com.raychenon.leetcode.tree;

import java.util.LinkedList;
import java.util.List;

/**
 * User: raychenon
 * Date: 27/6/2020
 * Time: 5:10 PM
 */
public class TreeUtil {

    /**
     * Input: [4,9,0,5,1]
     * --- 4
     * ---/ \
     * --9   0
     * -/ \
     * 5   1
     *
     * @param values
     * @return
     */
    public static TreeNode createTree(List<Integer> values) {
        if (values == null || values.size() == 0) return null;

        List<TreeNode> nodes = new LinkedList<>(); // store the list of parent nodes
        TreeNode root = new TreeNode(values.get(0));
        nodes.add(root);
        TreeNode temp = root;
        for (int i = 1; i < values.size(); i = i + 1) {
            if (i % 2 == 1) {
                Integer left = values.get(1);
                if (left != null) temp.left = new TreeNode(left);
            } else {
                Integer right = values.get(1);
                if (right != null) temp.right = new TreeNode(right);

            }
        }
        return root;
    }

    private static void insertPreOrderNode(TreeNode node, Integer left, Integer right) {
        if (left != null) node.left = new TreeNode(left);
        if (right != null) node.right = new TreeNode(right);
    }

}
