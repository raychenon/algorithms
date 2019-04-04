package com.raychenon.kotlin.hackerrank.tree

import org.junit.Assert
import org.junit.Test

/**
 * User: raychenon
 * Date: 3/4/19
 * https://www.hackerrank.com/challenges/is-binary-search-tree/problem
 */
class BinarySearchTreeTest {

    @Test
    fun assertForNullNode() {
        val nullNode: Node? = null
        Assert.assertEquals(true, BinarySearchTree.checkBST(nullNode))
    }

    @Test
    fun assertBinarySearchSimpleTreeIsCorrect() {
        val root = Node(3)
        root.left = Node(1)
        root.right = Node(5)
        //        3
        //      /    \
        //     1      5
        Assert.assertTrue(BinarySearchTree.checkBST(root))
    }

    @Test
    fun assertBinarySearchTreeIsCorrect() {

        val root = Node(3)

        val nodeLeft = Node(2)
        val nodeRight = Node(5)
        nodeLeft.left = Node(1)

        nodeRight.left = Node(4)
        nodeRight.right = Node(7)

        root.left = nodeLeft
        root.right = nodeRight


        //        3
        //      /    \
        //     2      5
        //    /      / \
        //   1      4   7
        Assert.assertTrue(BinarySearchTree.checkBST(root))
    }


    @Test
    fun assertNotBinarySearchTree() {
        val root = Node(3)

        val nodeLeft = Node(5)
        val nodeRight = Node(2)
        nodeLeft.left = Node(1)
        nodeLeft.right = Node(4)
        nodeRight.left = Node(6)

        root.left = nodeLeft
        root.right = nodeRight
        //        3
        //      /    \
        //     5      2
        //    / \    / \
        //   1   4   6
        Assert.assertEquals(false, BinarySearchTree.checkBST(root))
    }

    @Test
    fun assertBinarySearchTreeOnRightBranch() {

        val root = Node(3)

        val nodeRight = Node(5)
        nodeRight.left = Node(1)
        root.right = nodeRight

        //        3
        //          \
        //           5
        //            \
        //             1

        Assert.assertEquals(false, BinarySearchTree.checkBST(root))
    }

}