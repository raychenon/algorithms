package com.raychenon.leetcode.tree;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 24/8/2020
 * https://leetcode.com/problems/sum-of-left-leaves/
 */
public class SumofLeftLeavesTest {

    private static SumofLeftLeaves instance;

    @BeforeClass
    public static void setUp() {
        instance = new SumofLeftLeaves();
    }

    @Test
    public void sumofLeftLeavesTest1() {
        TreeNode root = TreeUtil.createTree(Arrays.asList(3, 9, 20, null, null, 15, 7));
        evaluateSumofLeftLeaves(24, root);
    }

    @Test
    public void sumofLeftLeavesTest2() {
        TreeNode root = TreeUtil.createTree(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, null, 10, null, 12, 13, null, 15));
        evaluateSumofLeftLeaves(30, root);
    }

    @Test
    public void sumofLeftLeavesOfEmptyTreeTest() {
        TreeNode parent = null;
        evaluateSumofLeftLeaves(0, parent);
    }

    private void evaluateSumofLeftLeaves(int expectedSum, TreeNode root) {
        assertEquals(expectedSum, instance.sumOfLeftLeavesRec1(root));
        assertEquals(expectedSum, instance.sumOfLeftLeavesRec2(root));
        assertEquals(expectedSum, instance.sumOfLeftLeavesIter(root));
        assertEquals(expectedSum, instance.sumOfLeftLeavesMTT(root));
    }

}
