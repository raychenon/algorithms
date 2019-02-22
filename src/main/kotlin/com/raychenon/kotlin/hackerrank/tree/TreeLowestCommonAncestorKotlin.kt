package com.raychenon.kotlin.hackerrank.tree

/**
 * User: raychenon
 * Date: 22/2/19
 * https://www.hackerrank.com/challenges/binary-search-tree-lowest-common-ancestor/problem
 */
object TreeLowestCommonAncestorKotlin {

    fun lca(root: Node, v1: Int, v2: Int): Node {

        // if smaller, search the right node
        if (root.data < v1 && root.data < v2) {
            return lca(root.right!!, v1, v2)
        }

        // bigger than both, search in the left node
        if (root.data > v1 && root.data > v2) {
            return lca(root.left!!, v1, v2)
        }

        return root
    }

}