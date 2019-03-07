package com.raychenon.kotlin.hackerrank.tree

import org.junit.Assert
import org.junit.Test

/**
 * User: raychenon
 * Date: 5/3/19
 * https://www.hackerrank.com/challenges/tree-height-of-a-binary-tree/problem
 */
class BinaryTreeHeightTest {


    @Test
    fun assertHeightNullNode() {
        val nullNode: Node? = null
        Assert.assertEquals(-1, BinaryTreeHeightKotlin.height(nullNode))
    }


    @Test
    fun assertHeightSingleNode() {
        val node: Node = Node(11)
        Assert.assertEquals(0, BinaryTreeHeightKotlin.height(node))
    }


    @Test
    fun assertHeightTree() {
        val node: Node = Node(3)
        node.insert(node, 2)
        node.insert(node, 1)
        node.insert(node, 5)
        node.insert(node, 4)
        node.insert(node, 6)
        node.insert(node, 7)

        //            3
        //           / \
        //          2   5
        //         /    /\
        //         1   4  6
        //                 \
        //                  7

        Assert.assertEquals(3, BinaryTreeHeightKotlin.height(node))
    }

    @Test
    fun assertHeightTreeRightBranch() {
        val node: Node = Node(3)
        node.insert(node, 1)
        node.insert(node, 7)
        node.insert(node, 5)
        node.insert(node, 4)

        //            3
        //           / \
        //          1   4
        //               \
        //                5
        //                 \
        //                  7

        Assert.assertEquals(3, BinaryTreeHeightKotlin.height(node))
    }


    /**
     * the longest height is not on the extreme left or right branch
     */
    @Test
    fun assertHeightTreeWhenLongestHeightIsNotExtremeLeftOrRight() {
        val node: Node = Node(3)
        node.insert(node, 1)
        node.insert(node, 11)
        node.insert(node, 9)
        node.insert(node, 20)
        node.insert(node, 7)
        node.insert(node, 5)

        //            3
        //           / \
        //          1   11
        //              /\
        //             9  20
        //            /
        //           7
        //          /
        //         5

        Assert.assertEquals(4, BinaryTreeHeightKotlin.height(node))
    }

}