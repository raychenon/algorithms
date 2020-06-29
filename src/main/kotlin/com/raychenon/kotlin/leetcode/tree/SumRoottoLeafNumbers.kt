package com.raychenon.kotlin.leetcode.tree

import com.raychenon.leetcode.tree.TreeNode

/**
 * User: raychenon
 * Date: 30/6/2020
 * https://leetcode.com/problems/sum-root-to-leaf-numbers/
 */
object SumRoottoLeafNumbers {

    fun sumNumbersRecursive(root: TreeNode?): Int {
        return traverse(root, 0)
    }

    fun traverse(node: TreeNode?, prefix: Int): Int {
        if (node == null) return prefix

        var current = prefix * 10 + node.value
        var left = 0
        var right = 0

        if (node.left == null && node.right == null) {
            return current
        }

        node.left?.let {
            left = traverse(it, current)
        }
        node.right?.let {
            right = traverse(it, current)
        }

        return left + right
    }
}