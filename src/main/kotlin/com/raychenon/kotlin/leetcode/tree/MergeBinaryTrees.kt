package com.raychenon.kotlin.leetcode.tree

import com.raychenon.leetcode.tree.TreeNode
import java.util.Stack

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
        t1.left = mergeTrees(t1.left, t2.left)
        t1.right = mergeTrees(t1.right, t2.right)

        return t1
    }

    fun mergeTreesIter(t1: TreeNode?, t2: TreeNode?): TreeNode? {
        if (t1 == null) return t2


        var stack: Stack<Pair<TreeNode, TreeNode>> = Stack()
        stack.push(Pair(t1!!, t2!!))

        while (!stack.isEmpty()) {

            val t = stack.pop()
            if (t.first == null || t.second == null) {
                continue
            } else {
                t.first.value += t.second.value
            }

            if (t.first.right == null) {
                t.first.right = t.second.right
            } else {
                stack.push(Pair(t.first.right, t.second.right))
            }

            // If the left child of the first tree doesn't exist,
            // append the left child(subtree) of the second tree to the current node
            if (t.first.left == null) {
                t.first.left = t.second.left
            } else {
                stack.push(Pair(t.first.left, t.second.left))
            }
        }

        return t1
    }
}