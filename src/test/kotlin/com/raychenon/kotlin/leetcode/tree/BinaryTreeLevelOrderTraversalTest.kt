package com.raychenon.kotlin.leetcode.tree

import com.raychenon.leetcode.tree.TreeNode
import com.raychenon.leetcode.tree.TreeUtil
import junit.framework.TestCase
import org.hamcrest.Matchers.contains
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

    private fun assertMethods(expected: List<List<Int>>, root: TreeNode?) {
        val answer = BinaryTreeLevelOrderTraversal.levelOrder(root)
        for (i in 0 until expected.size) {
            TestCase.assertEquals(expected[i], answer[i])
        }

    }

}