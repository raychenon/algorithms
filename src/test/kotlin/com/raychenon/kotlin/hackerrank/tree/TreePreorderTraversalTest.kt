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


    @Test
    fun assertTreePreOrderTraversal_testcase_0() {

        val node = Node(1)
        node.insert(node, 2)
        node.insert(node, 5)
        node.insert(node, 3)
        node.insert(node, 6)
        node.insert(node, 4)

        assertPreOrderNode("1 2 5 3 4 6 ", node)
    }
    
    @Test
    fun assertTreePreOrderTraversal_testcase_1() {

        val node = Node(1)
        node.insert(node, 14)
        node.insert(node, 3)
        node.insert(node, 7)
        node.insert(node, 4)
        node.insert(node, 5)
        node.insert(node, 15)
        node.insert(node, 6)
        node.insert(node, 13)
        node.insert(node, 10)
        node.insert(node, 11)
        node.insert(node, 2)
        node.insert(node, 12)
        node.insert(node, 8)
        node.insert(node, 9)

        assertPreOrderNode("1 14 3 2 7 4 5 6 13 10 8 9 11 12 15 ", node)
    }

    fun assertPreOrderNode(expectedValue: String, node: Node?): Unit {

        Assert.assertEquals(expectedValue, TreePreorderTraversalKotlin.preOrderRecursive(node).toString())
    }

}