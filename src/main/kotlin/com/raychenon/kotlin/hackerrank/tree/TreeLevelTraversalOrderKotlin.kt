package com.raychenon.kotlin.hackerrank.tree

import java.util.*

/**
 * User: raychenon
 * Date: 9/3/19
 * https://www.hackerrank.com/challenges/tree-level-order-traversal/problem
 */
object TreeLevelTraversalOrderKotlin {

    fun levelOrder(root: Node?): String {
        val queue = LinkedList<Node>()
        queue.add(root ?: return "")

        val str = StringBuilder()
        while (queue.isNotEmpty()) {

            val n = queue.poll()
            str.append(n.data).append(" ")

            n?.left?.let { queue.add(it) }
            n?.right?.let { queue.add(it) }
        }

        return str.deleteCharAt(str.length - 1).toString()
    }
}