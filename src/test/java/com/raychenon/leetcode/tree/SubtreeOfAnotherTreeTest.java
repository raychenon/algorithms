package com.raychenon.leetcode.tree;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 8/3/2020
 * https://leetcode.com/problems/subtree-of-another-tree
 */
public class SubtreeOfAnotherTreeTest {

    private static SubtreeOfAnotherTree instance;

    @BeforeClass
    public static void setUp() {
        instance = new SubtreeOfAnotherTree();
    }


    @Test
    public void subtreeOfAnotherTree_1_Test() {
        TreeNode parent = buildT1();
        TreeNode subTree = buildT1Subtree();

        assertEquals(true, instance.isSubtree(parent, subTree));
    }

    @Test
    public void subtreeOfAnotherTree_2_Test() {
        TreeNode parent = buildT2();
        TreeNode subTree = buildT1Subtree();

        assertEquals(false, instance.isSubtree(parent, subTree));
    }

    private TreeNode buildT1() {
        TreeNode tRoot = new TreeNode(3);
        TreeNode t3_4 = buildT1Subtree();
        TreeNode t3_5 = new TreeNode(5);
        tRoot.left = t3_4;
        tRoot.right = t3_5;

        return tRoot;
    }

    private TreeNode buildT1Subtree() {
        TreeNode tRoot = new TreeNode(4);
        TreeNode t_2 = new TreeNode(2);
        TreeNode t_1 = new TreeNode(1);
        tRoot.left = t_2;
        tRoot.right = t_1;

        return tRoot;
    }


    private TreeNode buildT2() {
        TreeNode tRoot = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        tRoot.left = t4;
        tRoot.right = t5;
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t0 = new TreeNode(0);
        t4.left = t1;
        t4.right = t2;
        t2.left = t0;

        return tRoot;
    }


}
