package com.raychenon.kotlin.leetcode.tree

import com.raychenon.leetcode.tree.TreeNode
import org.junit.Assert
import org.junit.Test

/**
 * User: raychenon
 * https://leetcode.com/problems/invert-binary-tree/
 */
class InvertBinaryTreeTest {

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

        // easier to compare pre order traversal output than to recreate another tree
        Assert.assertEquals("4 7 9 6 2 3 1", InvertBinaryTree.invertTreeRecursive(root)?.preOrderTraversalOutput())

        //  invert again to get the identity, then invert for test
        InvertBinaryTree.invertTreeIter(root)
        Assert.assertEquals("4 7 9 6 2 3 1", InvertBinaryTree.invertTreeIter(root)?.preOrderTraversalOutput())
    }

    @Test
    fun nullTest() {
        val root : TreeNode? = null
        Assert.assertEquals(null, InvertBinaryTree.invertTreeRecursive(root))
        Assert.assertEquals(null, InvertBinaryTree.invertTreeIter(root))
    }
}