package com.raychenon.kotlin.leetcode.tree

import com.raychenon.leetcode.tree.TreeNode

/**
 * User: raychenon
 * Date: 11/3/2020
 * https://leetcode.com/problems/subtree-of-another-tree/
 */

object SubtreeOfAnotherTree {

    fun isSubtree(s: TreeNode?, t: TreeNode?): Boolean {
        return traverse(s, t)
    }

    fun equals(x: TreeNode?, y: TreeNode?): Boolean {
        if (x == null && y == null) return true
        return if (x == null || y == null) false
        else x.value === y.value && equals(x.left, y.left) && equals(x.right, y.right)
    }

    fun traverse(s: TreeNode?, t: TreeNode?): Boolean {
        return s != null && (equals(s, t) || traverse(s.left, t) || traverse(s.right, t))
    }

}