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

    @Test
    fun assertLargeTreeLevelOrder() {

        val node = Node(20)
        node.insert(node, 10)
        node.insert(node, 30)
        node.insert(node, 5)
        node.insert(node, 15)
        node.insert(node, 25)
        node.insert(node, 35)
        node.insert(node, 1)
        node.insert(node, 7)
        node.insert(node, 12)
        node.insert(node, 17)
        node.insert(node, 22)
        node.insert(node, 27)
        node.insert(node, 33)
        node.insert(node, 37)

        //               20
        //        /             \
        //       10               30
        //     /    \           /     \
        //    5      15        25      35
        //   / \     /  \      / \    /  \
        //   1  7   12  17    22  27  33  37
        //

        Assert.assertEquals("20 10 30 5 15 25 35 1 7 12 17 22 27 33 37", TreeLevelTraversalOrderKotlin.levelOrder(node))
    }

}