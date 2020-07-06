package com.raychenon.leetcode.tree;

/**
 * User: raychenon
 * Date: 27/6/2020
 * https://leetcode.com/problems/sum-root-to-leaf-numbers/
 */
public class SumRoottoLeafNumbers {

    /**
     * Time complexity: O(N) since one has to visit each node.
     * Space complexity: O(H), where H is a tree height.
     *
     * @param root
     * @return
     */
    public int sumNumbersRecursive(TreeNode root) {
        return traverse(root, 0);
    }

    private int traverse(TreeNode node, int prefix) {
        // if (node == null) return prefix;

        int current = prefix * 10 + node.value;
        //System.out.println("current = " + current);
        int left = 0;
        int right = 0;

        if (node.left == null && node.right == null) {
            return current;
        }

        if (node.left != null) {
            left = traverse(node.left, current);
        }
        if (node.right != null) {
            right = traverse(node.right, current);
        }

        //System.out.println("current = " + current + " , left  = " + left + " , right = " + right);
        return left + right;

    }


    /**
     * Morris Preorder Traversal
     * Time complexity: O(n)
     * Space complexity: O(1)
     *
     * @param root
     * @return
     */
    public int sumNumbersMorris(TreeNode root) {
        int rootToLeaf = 0, currNumber = 0;
        int steps;
        TreeNode predecessor;

        while (root != null) {
            // If there is a left child,
            // then compute the predecessor.
            // If there is no link predecessor.right = root --> set it.
            // If there is a link predecessor.right = root --> break it.
            if (root.left != null) {
                // Predecessor node is one step to the left
                // and then to the right till you can.
                predecessor = root.left;
                steps = 1;
                while (predecessor.right != null && predecessor.right != root) {
                    predecessor = predecessor.right;
                    ++steps;
                }

                // Set link predecessor.right = root
                // and go to explore the left subtree
                if (predecessor.right == null) {
                    currNumber = currNumber * 10 + root.value;
                    predecessor.right = root;
                    root = root.left;
                }
                // Break the link predecessor.right = root
                // Once the link is broken,
                // it's time to change subtree and go to the right
                else {
                    // If you're on the leaf, update the sum
                    if (predecessor.left == null) {
                        rootToLeaf += currNumber;
                    }
                    // This part of tree is explored, backtrack
                    for (int i = 0; i < steps; ++i) {
                        currNumber /= 10;
                    }
                    predecessor.right = null;
                    root = root.right;
                }
            }

            // If there is no left child
            // then just go right.
            else {
                currNumber = currNumber * 10 + root.value;
                // if you're on the leaf, update the sum
                if (root.right == null) {
                    rootToLeaf += currNumber;
                }
                root = root.right;
            }
        }
        return rootToLeaf;
    }
}
