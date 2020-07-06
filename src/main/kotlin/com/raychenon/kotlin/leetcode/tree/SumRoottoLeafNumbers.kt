package com.raychenon.kotlin.leetcode.tree

import com.raychenon.leetcode.tree.TreeNode

/**
 * User: raychenon
 * Date: 30/6/2020
 * https://leetcode.com/problems/sum-root-to-leaf-numbers/
 */
object SumRoottoLeafNumbers {

    fun sumNumbersRecursive(root: TreeNode?): Int {
        return traverse(root, 0)
    }

    fun traverse(node: TreeNode?, prefix: Int): Int {
        if (node == null) return prefix

        var current = prefix * 10 + node.value
        var left = 0
        var right = 0

        if (node.left == null && node.right == null) {
            return current
        }

        node.left?.let {
            left = traverse(it, current)
        }
        node.right?.let {
            right = traverse(it, current)
        }

        return left + right
    }

    /**
     * Morris Preorder Traversal
     * Time complexity: O(n)
     * Space complexity: O(1)
     *
     * @param root
     * @return
     */
    fun sumNumbersMorris(root: TreeNode?): Int {
        var root = root
        var rootToLeaf = 0
        var currNumber = 0
        var steps: Int
        var predecessor: TreeNode
        while (root != null) {
            // If there is a left child,
            // then compute the predecessor.
            // If there is no link predecessor.right = root --> set it.
            // If there is a link predecessor.right = root --> break it.
            if (root.left != null) {
                // Predecessor node is one step to the left
                // and then to the right till you can.
                predecessor = root.left
                steps = 1
                while (predecessor.right != null && predecessor.right !== root) {
                    predecessor = predecessor.right
                    ++steps
                }

                // Set link predecessor.right = root
                // and go to explore the left subtree
                if (predecessor.right == null) {
                    currNumber = currNumber * 10 + root.value
                    predecessor.right = root
                    root = root.left
                } else {
                    // If you're on the leaf, update the sum
                    if (predecessor.left == null) {
                        rootToLeaf += currNumber
                    }
                    // This part of tree is explored, backtrack
                    for (i in 0 until steps) {
                        currNumber /= 10
                    }
                    predecessor.right = null
                    root = root.right
                }
            } else {
                currNumber = currNumber * 10 + root.value
                // if you're on the leaf, update the sum
                if (root.right == null) {
                    rootToLeaf += currNumber
                }
                root = root.right
            }
        }
        return rootToLeaf
    }
}