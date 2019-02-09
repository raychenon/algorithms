package com.raychenon.kotlin.hackerrank.tree

import org.junit.Assert
import org.junit.Test

/**
 * User: raychenon
 * Date: 9/2/19
 * https://www.hackerrank.com/challenges/tree-inorder-traversal/problem
 */
class TreeInOrderTraversalTest {


    @Test
    fun assertEmptyTreInOrderTraversal() {
        val nullNode: Node? = null
        assertInOrderTravesalTreeNode("", nullNode)
    }

    @Test
    fun assertSingleTreeInOrderTraversal() {
        val singleNode: Node = Node(1)
        assertInOrderTravesalTreeNode("1 ", singleNode)
    }

    @Test
    fun assertTreeInOrderTraversal_testcase_0() {
        val node: Node = Node(1)
        node.insert(node,2)
        node.insert(node,5)
        node.insert(node,3)
        node.insert(node,6)
        node.insert(node,4)
        assertInOrderTravesalTreeNode("1 2 3 4 5 6 ", node)
    }

    @Test
    fun assertTreeInOrderTraversal_testcase_2() {

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

        assertInOrderTravesalTreeNode("1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 ", node)
    }


    fun assertInOrderTravesalTreeNode(expectedValue: String, node: Node?): Unit {
        Assert.assertEquals(expectedValue, TreeInOrderTraversalKotlin.inOrderRecursive(node).toString())
    }
}