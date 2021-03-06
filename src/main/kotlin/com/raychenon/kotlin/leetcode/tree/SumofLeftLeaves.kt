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
        return if (isLeaf(root.left)) {
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
            subRoot.left?.run {
                if (isLeaf(this)) {
                    total += this.value
                }
            }

            subRoot.right?.let {
                stack.push(it)
            }

            subRoot.left?.let {
                stack.push(it)
            }
        }
        return total
    }

    private fun isLeaf(node: TreeNode?): Boolean {
        return node != null &&
                node.left == null &&
                node.right == null
    }

    /**
     * Morris Tree Traversal (Pre-order)
     *
     * Time complexity: O(n)
     * Space complexity: O(1)
     *
     * @param root
     * @return
     */
    fun sumOfLeftLeavesMorris(root: TreeNode?): Int {
        var total = 0
        var currentNode = root
        while (currentNode != null) {
            if (currentNode.left == null) {
                currentNode = currentNode.right
            } else {
                var previous = currentNode.left
                if (isLeaf(previous)) {
                    total += previous.value
                }
                while (previous.right != null && previous.right != currentNode) {
                    previous = previous.right
                }
                if (previous.right == null) {
                    previous.right = currentNode
                    currentNode = currentNode.left
                } else {
                    previous.right = null
                    currentNode = currentNode.right
                }
            }
        }
        return total
    }
}