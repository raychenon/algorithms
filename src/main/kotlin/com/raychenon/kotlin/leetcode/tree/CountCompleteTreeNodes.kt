package com.raychenon.kotlin.leetcode.tree

import com.raychenon.leetcode.tree.TreeNode

/**
 * User: raychenon
 * Date: 23/6/2020
 * https://leetcode.com/problems/count-complete-tree-nodes/
 */
object CountCompleteTreeNodes {

    /**
     * Time complexity: O(n), n being the number of Nodes
     * Space complexity: O(d), to keep the recursion stack, where d is a tree depth.
     */
    fun countNodesRecursive(root: TreeNode?): Int {
        return root?.let {
            1 + countNodesRecursive(it.left) + countNodesRecursive(it.right)
        } ?: 0
    }
}