package com.raychenon.kotlin.leetcode.tree

import com.raychenon.leetcode.tree.TreeNode

/**
 * User: raychenon
 * Date: 2019-10-08
 * https://leetcode.com/problems/merge-two-binary-trees/
 */
object MergeBinaryTrees {

    fun mergeTrees(t1: TreeNode?, t2: TreeNode?): TreeNode? {
        if (t1 == null) return t2
        if (t2 == null) return t1

        t1.value += t2.value
        t1.left = mergeTrees(t1.left,t2.left)
        t1.right = mergeTrees(t1.right,t2.right)

        return t1
    }

}