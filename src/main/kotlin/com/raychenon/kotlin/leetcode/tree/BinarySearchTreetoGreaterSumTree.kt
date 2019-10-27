package com.raychenon.kotlin.leetcode.tree

import com.raychenon.leetcode.tree.TreeNode

/**
 * User: raychenon
 * Date: 2019-10-26
 * https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/
 */
class BinarySearchTreetoGreaterSumTree {

    private var previous: Int = 0

    fun bstToGst(root: TreeNode?): TreeNode? {
        if (root == null) return null
        root?.right?.apply { bstToGst(this) }
        root?.value = previous + root?.value
        previous = root?.value

        root?.left?.apply { bstToGst(this) }
        return root
    }

}