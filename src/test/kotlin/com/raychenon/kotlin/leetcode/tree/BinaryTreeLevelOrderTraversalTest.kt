package com.raychenon.kotlin.leetcode.tree

import com.raychenon.leetcode.tree.TreeNode
import com.raychenon.leetcode.tree.TreeUtil
import junit.framework.TestCase
import org.junit.Test

/**
 * User: raychenon
 * Date: 9/9/2020
 * https://leetcode.com/problems/binary-tree-level-order-traversal/
 */
class BinaryTreeLevelOrderTraversalTest {

    /**
     * --- 3
     * -- / \
     * - 9   20
     * ---\  / \
     *     15   7
     */
    @Test
    fun example1Test() {
        val root = TreeUtil.createTree(listOf(3, 9, 20, null, null, 15, 7))
        val expected = listOf(listOf(3), listOf(9, 20), listOf(15, 7))
        assertMethods(expected, root)
    }

    /**
     * --- 4
     * -- / \
     * - 9   0
     * -/ \
     *  5  1
     */
    @Test
    fun example2Test() {
        val root = TreeUtil.createTree(listOf(4, 9, 0, 5, 1))
        val expected = listOf(listOf(4), listOf(9, 0), listOf(5, 1))
        assertMethods(expected, root)
    }

    @Test
    fun nullNodeTest() {
        val root = null
        val expected = emptyList<List<Int>>()
        assertMethods(expected, root)
    }

    private fun assertMethods(expected: List<List<Int>>, root: TreeNode?): Unit {
        val answer = BinaryTreeLevelOrderTraversal.levelOrder(root)
        val answerRec = BinaryTreeLevelOrderTraversal.levelOrderRec(root)
        for (i in 0 until expected.size) {
            for (j in 0 until expected[i].size) {
                TestCase.assertEquals(expected[i][j], answer[i][j])
                TestCase.assertEquals(expected[i][j], answerRec[i][j])
            }
        }
    }

}