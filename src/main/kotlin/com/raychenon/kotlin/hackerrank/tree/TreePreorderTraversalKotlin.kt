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
        if (root == null) {
            return str.append("")
        }

        //  1. Visit the root.
        str.append("${root.data} ")

        //  2. Traverse the left subtree, i.e., call Preorder(left-subtree)
        root?.left?.let { preOrderRecursive(it, str) }

        //  3. Traverse the right subtree, i.e., call Preorder(right-subtree)
        root?.right?.let { preOrderRecursive(it, str) }

        return str
    }

    /**
     * time complexity : O(n)
     * space complexity : O(h) for the Stack where h is the height of the Tree
     */
    fun preOrderIterative(root: Node?): StringBuilder {
        val stack = Stack<Node>()
        stack.push(root)
        var parentNode = root
        var childNode = root

        val preOrderList = mutableListOf<Node>()


        val str = StringBuilder()

        return str
    }
}