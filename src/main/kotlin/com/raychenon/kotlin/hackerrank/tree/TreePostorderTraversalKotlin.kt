package com.raychenon.kotlin.hackerrank.tree

import java.util.*


/**
 * User: raychenon
 * Date: 7/2/19
 * https://www.hackerrank.com/challenges/tree-postorder-traversal/problem
 */
object TreePostorderTraversalKotlin {

    fun postOrderRecursive(root: Node?): StringBuilder {
        val str = StringBuilder()
        postOrderRecursive(root, str)
        return str
    }

    fun postOrderRecursive(root: Node?, str: StringBuilder): StringBuilder {
        if (root == null) {
            return str.append("")
        }

        //   1. Traverse the left subtree, i.e., call Postorder(left-subtree)
        root?.left?.let { postOrderRecursive(it, str) }

        //   2. Traverse the right subtree, i.e., call Postorder(right-subtree)
        root?.right?.let { postOrderRecursive(it, str) }

        //   3. Visit the root.

        return str.append(String.format("%d ", root!!.data))
    }


    fun postOrderIterative(root: Node?): StringBuilder {
        val stack = Stack<Node>()
        stack.push(root)
        var temp = root
        var nextNode = root

        val postOrderList = mutableListOf<Node>()

        while (!stack.isEmpty() && temp != null) {
            temp = stack.peek()

            if ((temp?.left == null && temp?.right == null) || (nextNode == temp?.left || nextNode == temp?.right)) {
                postOrderList.add(temp)
                stack.pop()
                nextNode = temp
            } else {

                temp?.right?.let { stack.push(temp?.right) }
                temp?.left?.let { stack.push(temp?.left) }
            }
        }

        val str = StringBuilder()
        for (node in postOrderList) {
            str.append(String.format("%d ", node!!.data))
        }

        return str
    }
}