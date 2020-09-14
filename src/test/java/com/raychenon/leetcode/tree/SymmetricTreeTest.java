package com.raychenon.leetcode.tree;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 14/9/2020
 * https://leetcode.com/problems/symmetric-tree
 */
public class SymmetricTreeTest {

    private static SymmetricTree instance;

    @BeforeClass
    public static void setUp() {
        instance = new SymmetricTree();
    }

    @Test
    public void nullNodeTest() {
        TreeNode root = null;
        assertSymetricTree(true, root);
    }


    /**
     * ---- 1
     * --- / \
     * -- 2    2
     * - / \  / \
     * 3  4  4  3
     */
    @Test
    public void example1Test() {
        TreeNode root = TreeUtil.createTree(List.of(1, 2, 2, 3, 4, 4, 3));
        assertSymetricTree(true, root);
    }

    /**
     * ----1
     * -- / \
     * ---2  2
     * ----\  \
     * -----3  3
     */
    @Test
    public void example2Test() {
        TreeNode root = TreeUtil.createTree(Arrays.asList(1, 2, 2, null, 3, null, 3));
        assertSymetricTree(false, root);
    }

    private void assertSymetricTree(boolean isSymmetric, TreeNode root) {
        assertEquals(isSymmetric, instance.isSymmetricRec(root));
        assertEquals(isSymmetric, instance.isSymmetricIter(root));
    }
}
