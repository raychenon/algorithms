package com.raychenon.leetcode.tree;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 8/8/2020
 * https://leetcode.com/problems/vertical-order-traversal-of-a-binary-tree/
 */
public class VerticalOrderTraversalofaBinaryTreeTest {


    private static VerticalOrderTraversalofaBinaryTree instance;

    @BeforeClass
    public static void setUp() {
        instance = new VerticalOrderTraversalofaBinaryTree();
    }

    @Test
    public void example1Test() {
        TreeNode t1Root = TreeUtil.createTree(Arrays.asList(3, 9, 20, null, null, 15, 7));
        // [[9],[3,15],[20],[7]]
        assertVerticalTraversal(Arrays.asList(Arrays.asList(9), Arrays.asList(3, 15), Arrays.asList(20), Arrays.asList(7)), t1Root);
    }

    @Test
    public void example2Test() {
        TreeNode t1Root = TreeUtil.createTree(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        // [[4],[2],[1,5,6],[3],[7]]
        assertVerticalTraversal(Arrays.asList(Arrays.asList(4), Arrays.asList(2), Arrays.asList(1, 5, 6), Arrays.asList(3), Arrays.asList(7)), t1Root);
    }

    private void assertVerticalTraversal(List<List<Integer>> expectedTraversal, TreeNode root) {
        assertEquals(expectedTraversal, instance.verticalTraversal(root));
        assertEquals(expectedTraversal, instance.verticalTraversalDFS(root));
    }
}
