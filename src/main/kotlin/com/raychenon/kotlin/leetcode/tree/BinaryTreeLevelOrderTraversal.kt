package com.raychenon.kotlin.leetcode.tree

import com.raychenon.leetcode.tree.TreeNode
import java.util.*

/**
 * User: raychenon
 * Date: 9/9/2020
 * https://leetcode.com/problems/binary-tree-level-order-traversal/
 */
object BinaryTreeLevelOrderTraversal {

    /**
     * Recursive
     * Time complexity: O(n)
     * Space complexity: O(n)
     *
     * @param root
     * @return
     */
    fun levelOrderRec(root: TreeNode?): List<List<Int>> {
        val list = mutableListOf<MutableList<Int>>()
        if (root == null) {
            return list
        }
        levelOrderRec(root, 0, list)
        return list
    }

    private fun levelOrderRec(node: TreeNode, level: Int, levels: MutableList<MutableList<Int>>): Unit {
        if (levels.size == level) {
            levels.add(LinkedList<Int>())
        }
        levels.get(level).add(node.value)

        node.left?.let {
            levelOrderRec(it, level + 1, levels)
        }
        node.right?.let {
            levelOrderRec(it, level + 1, levels)
        }
    }

    /**
     * Iterative
     * Time complexity: O(n)
     * Space complexity: O(n)
     *
     * @param root
     * @return
     */
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

                curr.left?.let {
                    queue.offer(it)
                }
                curr.right?.let {
                    queue.offer(it)
                }
            }
            list.add(subList)
        }

        return list
    }
}