package com.raychenon.kotlin.leetcode.tree

import com.raychenon.leetcode.tree.TreeNode
import junit.framework.TestCase
import org.junit.Test

/**
 * User: raychenon
 * Date: 23/6/2020
 * https://leetcode.com/problems/count-complete-tree-nodes/
 */
class CountCompleteTreeNodesTest {

    @Test
    fun example1Test() {
        val root = TreeNode(4)
        val node2 = TreeNode(2)
        val node7 = TreeNode(7)
        root.left = node2
        root.right = node7
        val node1 = TreeNode(1)
        val node3 = TreeNode(3)
        node2.left = node1
        node2.right = node3
        val node6 = TreeNode(6)
        val node9 = TreeNode(9)
        node7.left = node6
        node7.right = node9

        assertMethods(7, root)
    }

    @Test
    fun nullTest() {
        val root: TreeNode? = null
        assertMethods(0, root)
    }

    private fun assertMethods(count: Int, root: TreeNode?) {
        TestCase.assertEquals(
            count,
            CountCompleteTreeNodes.countNodesRecursive(root)
        )
    }
}