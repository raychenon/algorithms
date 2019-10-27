package com.raychenon.kotlin.leetcode.tree

import com.raychenon.leetcode.tree.TreeNode
import junit.framework.Assert
import org.junit.Test

/**
 * User: raychenon
 * Date: 2019-10-27
 * https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/
 */
class BinarySearchTreetoGreaterSumTreeTest {

    @Test
    fun example1Test() {
        val root = TreeNode(4)
        val node1 = TreeNode(1)
        val node6 = TreeNode(6)
        root.left = node1
        root.right = node6

        val node0 = TreeNode(0)
        val node2 = TreeNode(2)
        node1.left = node0
        node1.right = node2
        node2.right = TreeNode(3)

        val node5 = TreeNode(5)
        val node7 = TreeNode(7)
        node6.left = node5
        node6.right = node7
        node7.right = TreeNode(8)

        Assert.assertEquals(
            "30,36,36,35,33,21,26,15,8",
            BinarySearchTreetoGreaterSumTree.bstToGst(root)?.preOrderPath()
        )
    }
}