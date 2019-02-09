package com.raychenon.kotlin.hackerrank.tree

import java.util.*

/**
 * User: raychenon
 * Date: 9/2/19
 * https://www.hackerrank.com/challenges/tree-inorder-traversal/problem
 */
object TreeInOrderTraversalKotlin {

    fun inOrderRecursive(root: Node?): StringBuilder {
        val str = StringBuilder()
        inOrderRecursive(root, str)
        return str
    }

    /**
     * time complexity : O(n)
     * space complexity : O(h) where h is the Tree's height. A stack is formed from previous recursive call
     */
    private fun inOrderRecursive(root: Node?, str: StringBuilder): StringBuilder {
        if (root == null) {
            return str.append("")
        }

        //   1. Traverse the left subtree, i.e., call Postorder(left-subtree)
        root?.left?.let { inOrderRecursive(it, str) }

        //   2. Visit the root.
        str.append(String.format("%d ", root!!.data))

        //   3. Traverse the right subtree, i.e., call Postorder(right-subtree)
        root?.right?.let { inOrderRecursive(it, str) }

        return str
    }

    fun inOrderIterative(root: Node?): StringBuilder {

        var current = root
        val stack = Stack<Node>()
        val inOderList = mutableListOf<Node>()

        while (current != null || stack.size > 0) {
            // reach the left most Node
            while (current != null) {
                stack.push(current)
                current = current?.left
            }

            current = stack.pop()
            inOderList.add(current)
            current = current?.right
        }

        val str = StringBuilder()
        for (node in inOderList) {
            str.append("${node.data} ")
        }

        return str
    }

}