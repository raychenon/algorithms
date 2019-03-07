package com.raychenon.kotlin.hackerrank.tree

import java.util.*

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

    fun heightIterative(root: Node?): Int {
        val stack = Stack<Node>()

        stack.push(root ?: return -1)

        var right: Int = 0
        var left: Int = 0

        while (stack.isNotEmpty()) {
            val currentNode = stack.pop()

            currentNode.left?.let {
                left = left + 1
                stack.push(it)
            }

            currentNode.right?.let {
                right = right + 1
                stack.push(it)
            }
        }

        return Math.max(left, right)
    }

}