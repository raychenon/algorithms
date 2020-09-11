package com.raychenon.leetcode.tree;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertTrue;

/**
 * User: raychenon
 * Date: 11/9/2020
 * https://leetcode.com/problems/binary-tree-level-order-traversal/
 */
public class BinaryTreeLevelOrderTraversalTest {

    private static BinaryTreeLevelOrderTraversal binaryTreeLevelOrderTraversal;

    @BeforeClass
    public static void setUp() {
        binaryTreeLevelOrderTraversal = new BinaryTreeLevelOrderTraversal();
    }

    @Test
    public void example1Test() {
        TreeNode root = TreeUtil.createTree(List.of(3, 9, 20, null, null, 15, 7));
        List<List<Integer>> expected = List.of(List.of(3), List.of(9, 20), List.of(15, 7));
        assertMethods(expected, root);
    }

    private void assertMethods(List<List<Integer>> expected, TreeNode root) {
        List<List<Integer>> answer = binaryTreeLevelOrderTraversal.levelOrder(root);
        for (int i = 0; i < expected.size(); i++) {
            assertTrue(expected.get(i).contains(answer.get(i)));
        }
    }
}
