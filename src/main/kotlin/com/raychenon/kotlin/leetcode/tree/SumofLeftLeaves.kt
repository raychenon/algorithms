package com.raychenon.kotlin.leetcode.tree

import com.raychenon.leetcode.tree.TreeNode
import java.util.*

/**
 * User: raychenon
 * Date: 24/8/2020
 * https://leetcode.com/problems/sum-of-left-leaves/
 */
object SumofLeftLeaves {


    /**
     *  Time complexity: O(n)
     * Space complexity: O(n)
     */
    fun sumOfLeftLeavesRec1(root: TreeNode?): Int {
        return if (root == null) {
            0
        } else {
            leftLeaf(root.left, true) + leftLeaf(root.right, false)
        }
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

    /**
     * Time complexity: O(n)
     * Space complexity: O(n)
     */
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

    /**
     * Pre-order() traversal DFS
     *
     * Time complexity: O(n)
     * Space complexity: O(n)
     *
     * @param root
     * @return
     */
    fun sumOfLeftLeavesIter(root: TreeNode?): Int {
        if (root == null) return 0
        var total = 0
        val stack = ArrayDeque<TreeNode>()
        stack.push(root)
        while (!stack.isEmpty()) {
            val subRoot = stack.pop()
            subRoot?.left?.run {
                if (isLeaf(this)) {
                    total += this.value
                }
            }

            subRoot?.right?.let { stack.push(it) }

            subRoot?.left?.let { stack.push(it) }
        }
        return total
    }

    private fun isLeaf(node: TreeNode?): Boolean {
        return node != null &&
                node.left == null &&
                node.right == null
    }
}