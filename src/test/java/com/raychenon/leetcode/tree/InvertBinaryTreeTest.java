package com.raychenon.leetcode.tree;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * https://leetcode.com/problems/invert-binary-tree/
 */
public class InvertBinaryTreeTest {

    private static InvertBinaryTree invertBinaryTree;

    @BeforeClass
    public static void setUp() {
        invertBinaryTree = new InvertBinaryTree();
    }

    @Test
    public void example1Test() {
        TreeNode node4 = new TreeNode(4);
        TreeNode node2 = new TreeNode(2);
        TreeNode node7 = new TreeNode(7);
        node4.left = node2;
        node4.right = node7;
        TreeNode node1 = new TreeNode(1);
        TreeNode node3 = new TreeNode(3);
        node2.left = node1;
        node2.right = node3;
        TreeNode node6 = new TreeNode(6);
        TreeNode node9 = new TreeNode(9);
        node7.left = node6;
        node7.right = node9;

        assertEquals("abba", invertBinaryTree.invertTree(node4));
    }

}
