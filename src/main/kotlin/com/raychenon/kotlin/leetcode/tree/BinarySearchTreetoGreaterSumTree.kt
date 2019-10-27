package com.raychenon.kotlin.leetcode.tree

import com.raychenon.leetcode.tree.TreeNode

/**
 * User: raychenon
 * Date: 2019-10-26
 * https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/
 */
object BinarySearchTreetoGreaterSumTree {

    var previous: Int = 0

    fun bstToGst(root: TreeNode?): TreeNode? {
        previous = 0
        inOrder(root)
        return root
    }

    private fun inOrder(root: TreeNode?): TreeNode? {
        root?.right?.apply { inOrder(this) }
        root?.value = previous + root!!.value
        previous = root?.value

        root?.left?.apply { inOrder(this) }
        return root
    }

}