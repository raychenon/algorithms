package com.raychenon.leetcode.tree;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 2019-10-07
 * https://leetcode.com/problems/merge-two-binary-trees
 */
public class MergeBinaryTreesTest {

    private static MergeBinaryTrees instance;

    @BeforeClass
    public static void setUp() {
        instance = new MergeBinaryTrees();
    }

    @Test
    public void mergeBinaryTreesTest() {
        TreeNode t1Root = buildT1();
        // compute the tree traversal string, because it is easier to compare a Tree content
        assertEquals("1 3 5 2", t1Root.preOrderTraversalOutput());

        TreeNode t2Root = buildT2();
        assertEquals("2 1 4 3 7", t2Root.preOrderTraversalOutput());

        // use the method buildT*() because t1 node is modified after mergeTrees() method
        // addition is commutative, merge(t1,t2) == merge(t2,t1)
        TreeNode t3Rec = instance.mergeTreesRecursive(buildT2(), buildT1());
        TreeNode t3 = instance.mergeTrees(buildT1(), buildT2());

        assertEquals("3 4 5 4 5 7", t3Rec.preOrderTraversalOutput());
        assertEquals("3 4 5 4 5 7", t3.preOrderTraversalOutput());
    }

    private TreeNode buildT1() {
        TreeNode t1Root = new TreeNode(1);
        TreeNode t1_3 = new TreeNode(3);
        TreeNode t1_2 = new TreeNode(2);
        TreeNode t1_5 = new TreeNode(5);
        t1Root.left = t1_3;
        t1Root.right = t1_2;
        t1_3.left = t1_5;

        return t1Root;
    }

    private TreeNode buildT2() {
        TreeNode t2Root = new TreeNode(2);
        TreeNode t2_1 = new TreeNode(1);
        TreeNode t2_3 = new TreeNode(3);
        TreeNode t2_4 = new TreeNode(4);
        TreeNode t2_7 = new TreeNode(7);
        t2Root.left = t2_1;
        t2Root.right = t2_3;
        t2_1.right = t2_4;
        t2_3.right = t2_7;

        return t2Root;
    }
}
