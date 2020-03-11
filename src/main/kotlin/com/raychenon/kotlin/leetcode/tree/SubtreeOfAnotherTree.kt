package com.raychenon.kotlin.leetcode.tree

import com.raychenon.leetcode.tree.TreeNode

/**
 * User: raychenon
 * Date: 11/3/2020
 * https://leetcode.com/problems/subtree-of-another-tree/
 */

object SubtreeOfAnotherTree {

    fun isSubtree(s: TreeNode?, t: TreeNode?): Boolean {
        val tree1 = preorder(s, true)
        val tree2 = preorder(t, true)
        return tree1.indexOf(tree2) >= 0
    }

    fun preorder(t: TreeNode?, left: Boolean): String {
        t?.also {

            return "#${t.value} ${preorder(t.left, true)} ${preorder(t.right, false)}"
        }.run { return if (left) "lnull" else "rnull" }
    }
}