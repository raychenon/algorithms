package com.raychenon.kotlin.leetcode.tree

import com.raychenon.leetcode.tree.TreeNode
import junit.framework.TestCase
import org.junit.Test

/**
 * User: raychenon
 * Date: 30/6/2020
 * https://leetcode.com/problems/sum-root-to-leaf-numbers/
 */
class SumRoottoLeafNumbersTest {

    @Test
    fun example1Test() {
        //  [1,2,3]
        val t1Root = TreeUtil.createTree(1, 2, 3)
        assertSumNumber(25, t1Root)
    }

    @Test
    fun example2Test() {
        //  [4,9,0,5,1]
        val t2Root = TreeUtil.createTree(4, 9, 0, 5, 1)
        assertSumNumber(1026, t2Root)
    }

    @Test
    fun nullNodeTest() {
        //  [4,9,0,null,1]
        val t2Root = TreeUtil.createTree(4, 9, 0, null, 1)
        assertSumNumber(531, t2Root)
    }

    @Test
    fun nullRightNodeTest() {
        //  [4,9,0,null,1]
        val t2Root = TreeUtil.createTree(4, 9, null, 0, 1)
        assertSumNumber(981, t2Root)
    }

    @Test
    fun nullRightandLeftNodeTest() {
        //  [1,2,3,null,4,5,null]
        val root = TreeUtil.createTree(1, 2, 3, null, 4, 5, null)
        assertSumNumber(259, root)
    }


    private fun assertSumNumber(expected: Int, root: TreeNode?) {
        TestCase.assertEquals(expected, SumRoottoLeafNumbers.sumNumbersRecursive(root))
        TestCase.assertEquals(expected, SumRoottoLeafNumbers.sumNumbersMorris(root))
    }

}