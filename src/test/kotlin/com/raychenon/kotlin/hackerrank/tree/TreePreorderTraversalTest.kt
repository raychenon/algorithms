package com.raychenon.kotlin.hackerrank.tree

import org.junit.Assert
import org.junit.Test

/**
 * User: raychenon
 * Date: 10/2/19
 * https://www.hackerrank.com/challenges/tree-preorder-traversal/problem
 */
class TreePreorderTraversalTest {

    @Test
    fun assertEmptyTreePostorderTraversal() {
        val nullNode: Node? = null
        assertPreOrderNode("", nullNode)
    }

    @Test
    fun assertSingleNodeTreePostorderTraversal() {
        val singleNode: Node? = Node(11)
        assertPreOrderNode("11 ", singleNode)
    }

    fun assertPreOrderNode(expectedValue: String, node: Node?): Unit {

        Assert.assertEquals(expectedValue, TreePreorderTraversalKotlin.preOrderRecursive(node).toString())
    }

}