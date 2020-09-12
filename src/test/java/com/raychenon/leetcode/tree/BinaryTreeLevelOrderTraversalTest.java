package com.raychenon.leetcode.tree;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

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

    /**
     * --- 3
     * -- / \
     * - 9   20
     * ---\  / \
     * 15   7
     */
    @Test
    public void example1Test() {
        TreeNode root = TreeUtil.createTree(Arrays.asList(3, 9, 20, null, null, 15, 7));
        List<List<Integer>> expected = List.of(List.of(3), List.of(9, 20), List.of(15, 7));
        assertMethods(expected, root);
    }

    /**
     * --- 4
     * -- / \
     * - 9   0
     * -/ \
     * 5  1
     */
    @Test
    public void example2Test() {
        TreeNode root = TreeUtil.createTree(Arrays.asList(4, 9, 0, 5, 1));
        List<List<Integer>> expected = List.of(List.of(4), List.of(9, 0), List.of(5, 1));
        assertMethods(expected, root);
    }

    @Test
    public void nullRootTest() {
        TreeNode root = null;
        List<List<Integer>> expected = new LinkedList<>();
        assertMethods(expected, root);
    }


    private void assertMethods(List<List<Integer>> expected, TreeNode root) {
        List<List<Integer>> answer = binaryTreeLevelOrderTraversal.levelOrder(root);
        List<List<Integer>> answerRec = binaryTreeLevelOrderTraversal.levelOrderRec(root);
        for (int i = 0; i < expected.size(); i++) {
            for (int j = 0; j < expected.get(i).size(); j++) {
                assertEquals(expected.get(i).get(j), answer.get(i).get(j));
                assertEquals(expected.get(i).get(j), answerRec.get(i).get(j));
            }
        }
    }
}
