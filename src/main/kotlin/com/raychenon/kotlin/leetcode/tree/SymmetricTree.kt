package com.raychenon.kotlin.leetcode.tree

import com.raychenon.leetcode.tree.TreeNode
import java.util.*

/**
 * User: raychenon
 * Date: 14/9/2020
 * https://leetcode.com/problems/symmetric-tree/
 */
object SymmetricTree {

    /**
     * Recursive
     * Time complexity: O(n)
     * Space complexity: O(n)
     *
     * @param root
     * @return
     */
    fun isSymmetricRec(root: TreeNode?): Boolean {
        if (root == null) return true
        return isMirror(root.left, root.right)
    }

    private fun isMirror(left: TreeNode?, right: TreeNode?): Boolean {

        // leaf node
        if (left == null && right == null) return true
        // at the same level, one of the other node is null, the other not => no symmetry
        if (left == null || right == null) return false

        return (left!!.value == right!!.value)
                && isMirror(left!!.right, right!!.left)
                && isMirror(left!!.left, right!!.right);
    }


    /**
     * Iterative
     * Time complexity: O(n)
     * Space complexity: O(n)
     *
     * @param root
     * @return
     */
    open fun isSymmetricIter(root: TreeNode): Boolean {
        val q: Queue<TreeNode> = LinkedList()
        q.add(root)
        q.add(root)
        while (!q.isEmpty()) {
            val t1 = q.poll()
            val t2 = q.poll()
            if (t1 == null && t2 == null) {
                continue  // next loop
            }
            if (t1 == null || t2 == null) {
                return false
            }
            q.add(t1.left)
            q.add(t2.right)
            q.add(t1.right)
            q.add(t2.left)
        }
        return true
    }

}