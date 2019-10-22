package com.raychenon.kotlin.leetcode.tree

import com.raychenon.leetcode.tree.TreeNode
import junit.framework.Assert.assertEquals
import org.junit.Test

/**
 * User: raychenon
 * Date: 2019-10-08
 * https://leetcode.com/problems/merge-two-binary-trees/
 */
class MergeBinaryTreesTest {

    @Test
    fun mergeBinaryTreesTest() {
        val t1Root = buildT1()
        // compute the tree traversal string, because it is easier to compare a Tree content
        assertEquals("1 3 5 2", t1Root.preOrderIterative())

        val t2Root = buildT2()
        assertEquals("2 1 4 3 7", t2Root.preOrderIterative())

        // use the method buildT*() because t1 node is modified after mergeTrees() method
        val t3 = MergeBinaryTrees.mergeTrees(buildT1(), buildT2())
        val t3Iter = MergeBinaryTrees.mergeTreesIter(buildT1(), buildT2())

        assertEquals("3 4 5 4 5 7", t3!!.preOrderIterative())
        assertEquals("3 4 5 4 5 7", t3Iter!!.preOrderIterative())
    }


    private fun buildT1(): TreeNode {
        val t1Root = TreeNode(1)
        val t1_3 = TreeNode(3)
        val t1_2 = TreeNode(2)
        val t1_5 = TreeNode(5)
        t1Root.left = t1_3
        t1Root.right = t1_2
        t1_3.left = t1_5

        return t1Root
    }

    private fun buildT2(): TreeNode {
        val t2Root = TreeNode(2)
        val t2_1 = TreeNode(1)
        val t2_3 = TreeNode(3)
        val t2_4 = TreeNode(4)
        val t2_7 = TreeNode(7)
        t2Root.left = t2_1
        t2Root.right = t2_3
        t2_1.right = t2_4
        t2_3.right = t2_7

        return t2Root
    }
}