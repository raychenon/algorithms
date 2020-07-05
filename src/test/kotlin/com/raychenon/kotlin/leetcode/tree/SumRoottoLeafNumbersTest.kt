package com.raychenon.kotlin.leetcode.tree

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
        val t1Root = TreeUtil.createTree(listOf(1, 2, 3))

        TestCase.assertEquals(25, SumRoottoLeafNumbers.sumNumbersRecursive(t1Root))
    }


    @Test
    fun example2Test() {
        //  [4,9,0,5,1]
        val t2Root = TreeUtil.createTree(listOf(4, 9, 0, 5, 1))
        TestCase.assertEquals(1026, SumRoottoLeafNumbers.sumNumbersRecursive(t2Root))
    }

    @Test
    fun nullNodeTest() {
        //  [4,9,0,null,1]
        val t2Root = TreeUtil.createTree(listOf(4, 9, 0, null, 1))
        TestCase.assertEquals(531, SumRoottoLeafNumbers.sumNumbersRecursive(t2Root))
    }

}