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

    public static TreeNode createTree(List<Integer> values, int index) {
        Integer value = values.get(index);
        TreeNode tree = (value == null) ? null : new TreeNode(value); 
        if (index * 2 < values.size() - 1)
            tree.left = createTree(values, index * 2 + 1);
        if (index * 2 + 1 < values.size() - 1)
            tree.right = createTree(values, index * 2 + 2);
        return tree;
    }

}
