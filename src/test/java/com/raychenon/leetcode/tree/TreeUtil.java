package com.raychenon.leetcode.tree;

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
        TreeNode root = createTree(values, 0);
        return root;
    }

    private static TreeNode createTree(List<Integer> values, int index) {
        if (index >= values.size()) return null;

        Integer value = values.get(index);
        if (value == null) return null;

        TreeNode tree = new TreeNode(value);

        // tree(index).left = 2 * index + 1
        tree.left = createTree(values, index * 2 + 1);

        // tree(index).right = 2 * index + 2
        tree.right = createTree(values, index * 2 + 2);

        return tree;
    }

}
