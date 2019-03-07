package com.raychenon.kotlin.hackerrank.tree

/**
 * User: raychenon
 * Date: 5/3/19
 * https://www.hackerrank.com/challenges/tree-height-of-a-binary-tree/problem
 */
object BinaryTreeHeightKotlin {

    tailrec fun height(root: Node?): Int {
        root?.let {
            val left = 1 + height(root?.left)
            val right = 1 + height(root?.right)
            return Math.max(left, right)
        } ?: run {
            return -1
        }
    }
}