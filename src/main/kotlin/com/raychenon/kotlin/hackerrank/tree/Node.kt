package com.raychenon.kotlin.hackerrank.tree

/**
 * User: raychenon
 * Date: 7/2/19
 */
class Node(internal var data: Int) {
    internal var left: Node?
    internal var right: Node?

    init {
        this.data = data
        this.left = null
        this.right = null
    }

    fun insert(root: Node?, data: Int): Node {
        if (root == null) {
            return Node(data)
        } else {
            val cur: Node
            if (data <= root.data) {
                cur = insert(root.left, data)
                root.left = cur
            } else {
                cur = insert(root.right, data)
                root.right = cur
            }
            return root
        }
    }
}