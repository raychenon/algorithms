package com.raychenon.kotlin.hackerrank.tree


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
        if(root == null){
            str.append("")
        }

        //   1. Traverse the left subtree, i.e., call Postorder(left-subtree)
        root?.left?.let { postOrderRecursive(it, str) }

        //   2. Traverse the right subtree, i.e., call Postorder(right-subtree)
        root?.right?.let { postOrderRecursive(it, str) }
        
        //   3. Visit the root.
        
        return str.append(String.format("%d ", root!!.data))
    }
}