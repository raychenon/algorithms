package com.raychenon.kotlin.leetcode.tree

import com.raychenon.leetcode.tree.TreeNode
import junit.framework.TestCase
import org.junit.Test

/**
 * User: raychenon
 * Date: 11/3/2020
 * https://leetcode.com/problems/subtree-of-another-tree/
 */
class SubtreeOfAnotherTreeTest {

    @Test
    fun subtreeOfAnotherTree_1_Test() {
        val parent = buildT1()
        val subTree = buildT1Subtree()
        TestCase.assertEquals(
            true,
            SubtreeOfAnotherTree.isSubtree(parent, subTree)
        )
    }

    @Test
    fun subtreeOfAnotherTree_2_Test() {
        val parent = buildT2()
        val subTree = buildT1Subtree()
        TestCase.assertEquals(
            false,
            SubtreeOfAnotherTree.isSubtree(parent, subTree)
        )
    }

    private fun buildT1(): TreeNode {
        val tRoot = TreeNode(3)
        val t3_4 = buildT1Subtree()
        val t3_5 = TreeNode(5)
        tRoot.left = t3_4
        tRoot.right = t3_5
        return tRoot
    }

    private fun buildT1Subtree(): TreeNode {
        val tRoot = TreeNode(4)
        val t_2 = TreeNode(2)
        val t_1 = TreeNode(1)
        tRoot.left = t_2
        tRoot.right = t_1
        return tRoot
    }


    private fun buildT2(): TreeNode {
        val tRoot = TreeNode(3)
        val t4 = TreeNode(4)
        val t5 = TreeNode(5)
        tRoot.left = t4
        tRoot.right = t5
        val t1 = TreeNode(1)
        val t2 = TreeNode(2)
        val t0 = TreeNode(0)
        t4.left = t1
        t4.right = t2
        t2.left = t0
        return tRoot
    }

}