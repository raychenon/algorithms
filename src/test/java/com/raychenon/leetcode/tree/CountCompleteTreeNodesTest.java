package com.raychenon.leetcode.tree;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 23/6/2020
 * https://leetcode.com/problems/count-complete-tree-nodes/
 */
public class CountCompleteTreeNodesTest {

    private static CountCompleteTreeNodes completeTreeNodes;

    @BeforeClass
    public static void setUp() {
        completeTreeNodes = new CountCompleteTreeNodes();
    }

    /**
     * --- 1
     * -- / \
     * - 2  3
     * -/ \
     * 4  5
     */
    @Test
    public void example1Test() {
        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        root.left = node2;
        root.right = node3;

        node2.left = new TreeNode(4);
        node2.right = new TreeNode(5);

        assertMethods(5, root);
    }


    /**
     * ---- 4
     * -- /  \
     * - 2    7
     * -/ \  / \
     * 1  3  6  9
     */
    @Test
    public void example2Test() {
        TreeNode root = new TreeNode(4);
        TreeNode node2 = new TreeNode(2);
        TreeNode node7 = new TreeNode(7);
        root.left = node2;
        root.right = node7;
        TreeNode node1 = new TreeNode(1);
        TreeNode node3 = new TreeNode(3);
        node2.left = node1;
        node2.right = node3;
        TreeNode node6 = new TreeNode(6);
        TreeNode node9 = new TreeNode(9);
        node7.left = node6;
        node7.right = node9;

        assertMethods(7, root);
    }

    @Test
    public void nullTest() {
        TreeNode root = null;
        assertMethods(0, root);
    }

    @Test
    public void singleNodeTest() {
        TreeNode root = new TreeNode(2);
        ;
        assertMethods(1, root);
    }


    private void assertMethods(int count, TreeNode root) {
        assertEquals(count, completeTreeNodes.countNodesRecursive(root));
        assertEquals(count, completeTreeNodes.countNodesBFS(root));
        assertEquals(count, completeTreeNodes.countNodesBinarySearch(root));
        assertEquals(count, completeTreeNodes.countNodesBinarySearchLC(root));
    }

}
