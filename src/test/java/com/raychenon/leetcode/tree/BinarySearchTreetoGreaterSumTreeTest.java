package com.raychenon.leetcode.tree;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 2019-10-24
 * https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree
 */
public class BinarySearchTreetoGreaterSumTreeTest {

    private static BinarySearchTreetoGreaterSumTree instance;

    @BeforeClass
    public static void setUp() {
        instance = new BinarySearchTreetoGreaterSumTree();
    }

    @Test
    public void example1Test() {
        TreeNode root = new TreeNode(4);
        TreeNode node1 = new TreeNode(1);
        TreeNode node6 = new TreeNode(6);
        root.left = node1;
        root.right = node6;

        TreeNode node0 = new TreeNode(0);
        TreeNode node2 = new TreeNode(2);
        node1.left = node0;
        node1.right = node2;
        node2.right = new TreeNode(3);

        TreeNode node5 = new TreeNode(5);
        TreeNode node7 = new TreeNode(7);
        node6.left = node5;
        node6.right = node7;
        node7.right = new TreeNode(8);

        assertEquals("30,36,36,35,33,21,26,15,8", instance.bstToGst(root).preOrderPath());
    }

}
