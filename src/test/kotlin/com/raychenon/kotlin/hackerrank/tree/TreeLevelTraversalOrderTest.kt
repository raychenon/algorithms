package com.raychenon.kotlin.hackerrank.tree

import org.junit.Assert
import org.junit.Test

/**
 * User: raychenon
 * Date: 9/3/19
 * https://www.hackerrank.com/challenges/tree-level-order-traversal/problem
 */
class TreeLevelTraversalOrderTest {


    @Test
    fun assertEmptyTreeLevelOrder() {
        val node: Node? = null
        Assert.assertEquals("", TreeLevelTraversalOrderKotlin.levelOrder(node))
    }

    @Test
    fun assertTreeLevelOrder() {

        val node = Node(1)
        node.insert(node, 2)
        node.insert(node, 5)
        node.insert(node, 6)
        node.insert(node, 3)
        node.insert(node, 4)

        //        1
        //         \
        //          2
        //           \
        //            5
        //           / \
        //          3   6
        //           \
        //            4

        Assert.assertEquals("1 2 5 3 6 4", TreeLevelTraversalOrderKotlin.levelOrder(node))
    }


}