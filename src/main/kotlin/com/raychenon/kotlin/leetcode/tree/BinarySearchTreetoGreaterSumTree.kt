package com.raychenon.kotlin.leetcode.tree

import com.raychenon.leetcode.tree.TreeNode

/**
 * User: raychenon
 * Date: 2019-10-26
 * https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/
 */
object BinarySearchTreetoGreaterSumTree {

    fun bstToGst(root: TreeNode?): TreeNode? {
        val sum = IntArray(1)
        inOrder(root, sum)
        return root
    }

    fun inOrder(root: TreeNode?, sum: IntArray): Unit {
        if (root == null) return
        inOrder(root?.right, sum)
        sum[0] = root?.value
        root?.value = sum[0]
        inOrder(root?.left, sum)
    }
}