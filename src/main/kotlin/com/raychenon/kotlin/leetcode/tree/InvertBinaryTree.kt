package com.raychenon.kotlin.leetcode.tree

import com.raychenon.leetcode.tree.TreeNode
import java.util.*

/**
 * User: raychenon
 * https://leetcode.com/problems/invert-binary-tree/
 */
object InvertBinaryTree {

    /**
     *  swap the left and right child of all nodes in the tree.
     *  Recursive.
     *  time complexity: O(n)
     *  space complexity: O(n)
     */
    fun invertTreeRecursive(root: TreeNode?): TreeNode? {
        if (root == null) return null

        var left = invertTreeRecursive(root?.left)
        var right = invertTreeRecursive(root?.right)

        root.left = right
        root.right = left

        return root
    }

    /**
     *  time complexity: O(n)
     *  space complexity: O(n)
     */
    fun invertTreeIter(root: TreeNode?): TreeNode? {
        if (root == null) return null

        var queue: Queue<TreeNode> = LinkedList<TreeNode>()
        queue.add(root)
        while (queue.isNotEmpty()) {

            var current = queue.poll()
            var temp = current?.left
            current.left = current?.right
            current.right = temp

            // current?.left.let { queue.add(it) }
            // current?.right.let { queue.add(it) }
            if (current.left != null) queue.add(current.left)
            if (current.right != null) queue.add(current.right)
        }
        return root
    }

}