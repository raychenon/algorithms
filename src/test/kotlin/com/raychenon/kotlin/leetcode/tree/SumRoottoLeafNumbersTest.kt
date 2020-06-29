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
        val t1Root = TreeNode(1)
        t1Root.left = TreeNode(2)
        t1Root.right = TreeNode(3)
        TestCase.assertEquals(
            25,
            SumRoottoLeafNumbers.sumNumbersRecursive(t1Root)
        )
    }

}