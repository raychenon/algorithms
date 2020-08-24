package com.raychenon.kotlin.leetcode.tree

import com.raychenon.leetcode.tree.TreeNode

/**
 * User: raychenon
 * Date: 24/8/2020
 * https://leetcode.com/problems/sum-of-left-leaves/
 */
object SumofLeftLeaves {


    fun sumOfLeftLeavesRec1(root: TreeNode?): Int {
        return if (root == null) 0 else leftLeaf(root.left, true) + leftLeaf(root.right, false)
    }

    private fun leftLeaf(root: TreeNode?, isLeft: Boolean): Int {
        if (root == null) return 0
        if (root.left == null &&
            root.right == null &&
            isLeft
        ) {
            return root.value
        }

        val temp: TreeNode = root
        return leftLeaf(temp.left, true) + leftLeaf(temp.right, false)
    }

    fun sumOfLeftLeavesRec2(root: TreeNode?): Int {
        if (root == null) return 0
        return if (root.left != null &&
            root.left.left == null &&
            root.left.right == null
        ) {
            root.left.value + sumOfLeftLeavesRec2(root.right)
        } else {
            sumOfLeftLeavesRec2(root.left) + sumOfLeftLeavesRec2(root.right)
        }
    }
}