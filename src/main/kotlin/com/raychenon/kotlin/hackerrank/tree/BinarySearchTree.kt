package com.raychenon.kotlin.hackerrank.tree

/**
 * User: raychenon
 * Date: 3/4/19
 * https://www.hackerrank.com/challenges/is-binary-search-tree/problem
 */
object BinarySearchTree {

    fun checkBST(root: Node?): Boolean {
        return checkBSTMinMax(root, Int.MIN_VALUE, Int.MAX_VALUE)
    }

    private fun checkBSTMinMax(root: Node?, min: Int, max: Int): Boolean {
        // if null 
        root ?: return true

        val data: Int = root!!.data

        return (data > min && data < max) &&
                checkBSTMinMax(root.left, min, data) &&
                checkBSTMinMax(root.right, data, max)
    }
}