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
    public static TreeNode createTree(int[] values) {
        if (values == null || values.length == 0) return null;

        List<TreeNode> nodes = new LinkedList<>(); // store the list of parent nodes
        TreeNode root = new TreeNode(values[0]);
        TreeNode temp = root;
        for (int i = 1; i < values.length; i = i + 2) {
            insertPreOrderNode(temp, values[i], values[i + 1]);
        }
        return root;
    }

    private static void insertPreOrderNode(TreeNode node, Integer left, Integer right) {
        if (left != null) node.left = new TreeNode(left);
        if (right != null) node.right = new TreeNode(right);
    }

}
