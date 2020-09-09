package com.raychenon.kotlin.leetcode.tree

import com.raychenon.leetcode.tree.TreeNode
import java.util.*

/**
 * User: raychenon
 * Date: 9/9/2020
 * https://leetcode.com/problems/binary-tree-level-order-traversal/
 */
object BinaryTreeLevelOrderTraversal {

    fun levelOrder(root: TreeNode?): List<List<Int>> {
        val list = mutableListOf<List<Int>>()
        val queue: Queue<TreeNode> = LinkedList<TreeNode>()
        if (root != null) {
            queue.offer(root)
        }
        var curr: TreeNode? = null
        while (!queue.isEmpty()) {
            val size = queue.size
            val subList = mutableListOf<Int>()
            for (i in 0 until size) {
                curr = queue.poll()

                subList.add(curr.value)

                curr?.left?.let { queue.offer(it) }
                curr?.right?.let { queue.offer(it) }
            }
            list.add(subList)
        }

        return list
    }
}