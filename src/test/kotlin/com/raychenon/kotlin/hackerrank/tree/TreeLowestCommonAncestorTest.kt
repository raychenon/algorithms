package com.raychenon.kotlin.hackerrank.tree

import org.junit.Assert
import org.junit.Test

/**
 * User: raychenon
 * Date: 22/2/19
 * Time: 6:26 PM
 */
class TreeLowestCommonAncestorTest {

    @Test
    fun assertLCAWhenNodeIsSingle() {

        val node = Node(1)

        assertLCA(node, 1, 1, node)
    }

    @Test
    fun assertLCA_testcase_0() {

        val node = Node(4)
        node.insert(node, 2)
        node.insert(node, 3)
        node.insert(node, 1)
        node.insert(node, 7)
        node.insert(node, 6)

        //                   4
        //                /     \
        //               2       7
        //             /   \    /
        //            1     3  6

        assertLCA(node, 1, 7, node)
    }

    @Test
    fun assertLCA_testcase_1() {

        val node = Node(8)
        node.insert(node, 4)
        node.insert(node, 9)
        node.insert(node, 1)
        node.insert(node, 6)
        node.insert(node, 2)
        node.insert(node, 5)
        node.insert(node, 7)
        node.insert(node, 3)

        val node4 = Node(4)
        //                  8
        //                /   \
        //               4     9
        //             /    \
        //            1      6
        //             \    / \
        //              2   5  7
        //               \
        //                3

        assertLCA(node, 1, 7, node4)
    }

    @Test
    fun assertLCA_testcase_2() {

        val node = Node(5)
        node.insert(node, 3)
        node.insert(node, 8)
        node.insert(node, 2)
        node.insert(node, 4)
        node.insert(node, 6)
        node.insert(node, 7)

        //                  5
        //                /    \
        //               3      8
        //             /   \    /
        //            2     4  6
        //                       \
        //                        7

        val node5 = node

        // NOTE v1 < v2
        // this input should be inverted, 3,7 instead of 7,3
        assertLCA(node, 7, 3, node5)
    }


    fun assertLCA(node: Node, v1: Int, v2: Int, expectedNode: Node): Unit {
        Assert.assertEquals(expectedNode.data, TreeLowestCommonAncestorKotlin.lca(node, v1, v2).data)
        Assert.assertEquals(expectedNode.data, TreeLowestCommonAncestorKotlin.lcaIterative(node, v1, v2)?.data)
    }

}