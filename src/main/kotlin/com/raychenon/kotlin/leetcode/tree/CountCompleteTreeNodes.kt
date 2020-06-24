package com.raychenon.kotlin.leetcode.tree

import com.raychenon.leetcode.tree.TreeNode

/**
 * User: raychenon
 * Date: 23/6/2020
 * https://leetcode.com/problems/count-complete-tree-nodes/
 */
object CountCompleteTreeNodes {

    /**
     * https://www.youtube.com/watch?v=i_r2uKbwHCU
     *
     *
     * Use the fact that the tree is a "complete binary tree" every level.
     * In a complete binary tree every level, except possibly the last,
     * is completely filled, and all nodes in the last level are as far left as possible.
     *
     *
     * total number of nodes = (2^h-1) + nb nodes in last level
     * nb nodes in last level is found by binary search
     *
     *
     * Time complexity: O(h^2) ~ O(log2(N)), where h is the height of the tree
     * Space complexity: O(1)
     *
     * @param root
     * @return
     */
    fun countNodesBinarySearch(root: TreeNode?): Int {
        if (root == null) return 0
        var leftNode = root
        var rightNode = root
        var hLeft = 0
        var hRight = 0

        // left node traversal will give the height (hl)
        while (leftNode != null) {
            hLeft += 1
            leftNode = leftNode.left
        }
        while (rightNode != null) {
            hRight += 1
            rightNode = rightNode.right
        }
        return if (hLeft == hRight) {
            (1 shl hLeft) - 1 // left shift (2^hl -1)
        } else 1 + countNodesBinarySearch(root.left) + countNodesBinarySearch(root.right)
    }

    /**
     * Time complexity: O(n), n being the number of Nodes
     * Space complexity: O(d), to keep the recursion stack, where d is a tree depth.
     *
     * @param root
     * @return
     */
    fun countNodesRecursive(root: TreeNode?): Int {
        return root?.let {
            1 + countNodesRecursive(it.left) + countNodesRecursive(it.right)
        } ?: 0
    }
}