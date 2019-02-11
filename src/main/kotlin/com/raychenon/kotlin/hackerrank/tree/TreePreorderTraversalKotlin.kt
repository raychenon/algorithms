package com.raychenon.kotlin.hackerrank.tree

import java.util.*

/**
 * User: raychenon
 * Date: 10/2/19
 * https://www.hackerrank.com/challenges/tree-preorder-traversal/problem
 */
object TreePreorderTraversalKotlin {


    fun preOrderRecursive(root: Node?): StringBuilder {
        val str = StringBuilder()
        TreePreorderTraversalKotlin.preOrderRecursive(root, str)
        return str
    }

    /**
     * time complexity : O(n)
     * space complexity : O(h) where h is the Tree's height. A stack is formed from previous recursive call
     */
    private fun preOrderRecursive(root: Node?, str: StringBuilder): StringBuilder {

        root?.let {
            //  1. Visit the root.
            str.append("${root.data} ")

            //  2. Traverse the left subtree, i.e., call Preorder(left-subtree)
            preOrderRecursive(root.left, str)

            //  3. Traverse the right subtree, i.e., call Preorder(right-subtree)
            preOrderRecursive(root.right, str)
        }

        return str
    }


    fun preOrderIterative(root: Node?): StringBuilder {
        val preOrderList = preOrderIterativeList(root)
        val str = StringBuilder()
        for (node in preOrderList) {
            str.append("${node.data} ")
        }
        return str
    }

    /**
     * time complexity : O(n)
     * space complexity : O(h) for the Stack where h is the height of the Tree
     */
    private fun preOrderIterativeList(root: Node?): List<Node> {
        val stack = Stack<Node>()
        var currentNode = root
        val preOrderList = mutableListOf<Node>()

        stack.push(root ?: return preOrderList)

        while (stack.isNotEmpty()) {
            val currentNode = stack.pop()
            preOrderList.add(currentNode)

            currentNode.right?.let { stack.push(it) }
            currentNode.left?.let { stack.push(it) }
        }

        return preOrderList
    }
}