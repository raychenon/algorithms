package com.raychenon.kotlin.hackerrank.tree

/**
 * User: raychenon
 * Date: 22/2/19
 * https://www.hackerrank.com/challenges/binary-search-tree-lowest-common-ancestor/problem
 */
object TreeLowestCommonAncestorKotlin {

    fun lca(root: Node, v1: Int, v2: Int): Node? {

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

    fun lcaIterative(root: Node, v1: Int, v2: Int): Node? {
        var temp: Node? = root

        while (conditionNodeBiggerThan(temp, v1, v2, false)) {
            temp = temp?.right
        }

        while (conditionNodeBiggerThan(temp, v1, v2, true)) {
            temp = temp?.left
        }
        return temp
    }


    fun conditionNodeBiggerThan(node: Node?, v1: Int, v2: Int, biggerThan: Boolean): Boolean {

        node?.let {
            if (biggerThan) {
                return it.data > v1 && it.data > v2
            } else {
                return it.data < v1 && it.data < v2
            }
        } ?: run {
            return false
        }
    }

}