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

    /**
     * time complexity : O(n)
     * space complexity : O(h) where h is the Tree's height. A stack is formed from previous recursive call
     */
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


    /**
     * time complexity : O(n)
     * space complexity : O(h) for the Stack where h is the height of the Tree
     */
    fun postOrderIterative(root: Node?): StringBuilder {
        val stack = Stack<Node>()
        stack.push(root)
        var parentNode = root
        var childeNode = root

        val postOrderList = mutableListOf<Node>()

        while (!stack.isEmpty() && parentNode != null) {
            parentNode = stack.peek()

            if ((parentNode?.left == null && parentNode?.right == null)
                || (childeNode == parentNode?.left || childeNode == parentNode?.right)
            ) {
                postOrderList.add(parentNode)
                stack.pop()
                childeNode = parentNode
            } else {

                parentNode?.right?.let { stack.push(parentNode?.right) }

                parentNode?.left?.let { stack.push(parentNode?.left) }
            }
        }

        val str = StringBuilder()
        for (node in postOrderList) {
            str.append(String.format("%d ", node!!.data))
        }

        return str
    }
}