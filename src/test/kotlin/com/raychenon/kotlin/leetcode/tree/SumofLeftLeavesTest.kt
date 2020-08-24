package com.raychenon.kotlin.leetcode.tree

import com.raychenon.leetcode.tree.TreeNode
import com.raychenon.leetcode.tree.TreeUtil
import junit.framework.TestCase
import org.junit.Test

/**
 * User: raychenon
 * Date: 24/8/2020
 * https://leetcode.com/problems/sum-of-left-leaves/
 */
class SumofLeftLeavesTest {


    @Test
    fun sumofLeftLeavesTest1() {
        val root = TreeUtil.createTree(listOf(3, 9, 20, null, null, 15, 7))
        evaluateSumofLeftLeaves(24, root)
    }

    @Test
    fun sumofLeftLeavesTest2() {
        val root = TreeUtil.createTree(listOf(1, 2, 3, 4, 5, 6, 7, 8, null, 10, null, 12, 13, null, 15))
        evaluateSumofLeftLeaves(30, root)
    }

    @Test
    fun sumofLeftLeavesOfEmptyTreeTest() {
        val parent: TreeNode? = null
        evaluateSumofLeftLeaves(0, parent)
    }

    private fun evaluateSumofLeftLeaves(expectedSum: Int, root: TreeNode?) {
        TestCase.assertEquals(expectedSum, SumofLeftLeaves.sumOfLeftLeavesRec1(root))
        TestCase.assertEquals(expectedSum, SumofLeftLeaves.sumOfLeftLeavesRec2(root))
    }
}