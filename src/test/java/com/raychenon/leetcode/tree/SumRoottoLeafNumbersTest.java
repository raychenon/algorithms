package com.raychenon.leetcode.tree;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 27/6/2020
 * https://leetcode.com/problems/sum-root-to-leaf-numbers/
 */
public class SumRoottoLeafNumbersTest {

    private static SumRoottoLeafNumbers instance;

    @BeforeClass
    public static void setUp() {
        instance = new SumRoottoLeafNumbers();
    }

    @Test
    public void example1Test() {
        //  [1,2,3]
        TreeNode t1Root = TreeUtil.createTree(Arrays.asList(1, 2, 3));
        assertSumNumber(25, t1Root);
    }

    @Test
    public void example2Test() {
        //  [4,9,0,5,1]
        TreeNode t2Root = TreeUtil.createTree(Arrays.asList(4, 9, 0, 5, 1));
        assertSumNumber(1026, t2Root);
    }

    @Test
    public void nullLeftNodeTest() {
        //  [4,9,0,null,1]
        TreeNode t2Root = TreeUtil.createTree(Arrays.asList(4, 9, 0, null, 1));
        assertSumNumber(531, t2Root);
    }

    @Test
    public void nullRightNodeTest() {
        //  [4,9,0,null,1]
        TreeNode t2Root = TreeUtil.createTree(Arrays.asList(4, 9, null, 0, 1));
        assertSumNumber(981, t2Root);
    }

    @Test
    public void nullRightandLeftNodeTest() {
        //  [1,2,3,null,4,5,null]
        TreeNode t2Root = TreeUtil.createTree(Arrays.asList(1, 2, 3, null, 4, 5, null));
        assertSumNumber(259, t2Root);
    }

    private void assertSumNumber(int expected, TreeNode root) {
        assertEquals(expected, instance.sumNumbersRecursive(root));
        assertEquals(expected, instance.sumNumbersMorris(root));
    }
}
