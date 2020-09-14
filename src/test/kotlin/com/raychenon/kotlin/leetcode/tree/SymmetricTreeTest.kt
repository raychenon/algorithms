package com.raychenon.kotlin.leetcode.tree

import com.raychenon.leetcode.tree.TreeNode
import com.raychenon.leetcode.tree.TreeUtil
import junit.framework.TestCase
import org.junit.Test
import java.util.*
import java.util.List

/**
 * User: raychenon
 * Date: 14/9/2020
 * https://leetcode.com/problems/symmetric-tree/
 */
class SymmetricTreeTest {

    @Test
    fun nullNodeTest() {
        val root: TreeNode? = null
        assertSymetricTree(true, root)
    }


    /**
     * ---- 1
     * --- / \
     * -- 2    2
     * - / \  / \
     * 3  4  4  3
     */
    @Test
    fun example1Test() {
        val root = TreeUtil.createTree(List.of(1, 2, 2, 3, 4, 4, 3))
        assertSymetricTree(true, root)
    }

    /**
     * ----1
     * -- / \
     * ---2  2
     * ----\  \
     * -----3  3
     */
    @Test
    fun example2Test() {
        val root = TreeUtil.createTree(Arrays.asList(1, 2, 2, null, 3, null, 3))
        assertSymetricTree(false, root)
    }

    private fun assertSymetricTree(isSymmetric: Boolean, root: TreeNode?) {
        TestCase.assertEquals(isSymmetric, SymmetricTree.isSymmetricRec(root))
        //TestCase.assertEquals(isSymmetric, SymmetricTree.isSymmetricIter(root))
    }
}