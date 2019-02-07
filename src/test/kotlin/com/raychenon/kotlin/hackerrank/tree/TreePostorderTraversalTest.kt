package com.raychenon.kotlin.hackerrank.tree

import org.junit.Assert
import org.junit.Test

/**
 * User: raychenon
 * Date: 7/2/19
 * https://www.hackerrank.com/challenges/tree-postorder-traversal/problem
 */
class TreePostorderTraversalTest {

    @Test
    fun assertEmptyTreePostorderTraversal() {

        val nullNode: Node? = null
        assertNode("", nullNode)
    }


    @Test
    fun assertSingleTreePostorderTraversal() {

        val node = Node(1)
        assertNode("1 ", node)
    }

    @Test
    fun assertTreePostorderTraversal_testcase_0() {

        val node = Node(1)
        node.insert(node, 2)
        node.insert(node, 5)
        node.insert(node, 3)
        node.insert(node, 6)
        node.insert(node, 4)

        assertNode("4 3 6 5 2 1 ", node)
    }

    @Test
    fun assertTreePostorderTraversal_testcase_1() {

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

        assertNode("2 6 5 4 9 8 12 11 10 13 7 3 15 14 1 ", node)
    }

    fun assertNode(expectedValue: String, node: Node?): Unit{
        Assert.assertEquals(expectedValue,TreePostorderTraversalKotlin.postOrderRecursive(node).toString())
    }

}