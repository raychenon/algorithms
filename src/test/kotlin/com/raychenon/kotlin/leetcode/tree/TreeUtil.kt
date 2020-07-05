package com.raychenon.kotlin.leetcode.tree

import com.raychenon.leetcode.tree.TreeNode

/**
 * User: raychenon
 * Date: 5/7/2020
 * Time: 10:49 PM
 */
object TreeUtil {

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
    fun createTree(values: List<Int?>?): TreeNode? {
        return if (values == null || values.size == 0) null else createTree(values, 0)
    }

    private fun createTree(values: List<Int?>, index: Int): TreeNode? {
        if (index >= values.size) return null
        val value = values[index] ?: return null
        val tree = TreeNode(value)

        // tree(index).left = 2 * index + 1
        tree.left = createTree(values, index * 2 + 1)

        // tree(index).right = 2 * index + 2
        tree.right = createTree(values, index * 2 + 2)
        return tree
    }
}