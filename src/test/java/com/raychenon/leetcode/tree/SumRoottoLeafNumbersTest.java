package com.raychenon.leetcode.tree;

import org.junit.BeforeClass;
import org.junit.Test;

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
        TreeNode t1Root = new TreeNode(1);
        t1Root.left = new TreeNode(2);
        t1Root.right = new TreeNode(3);

        assertEquals(25, instance.sumNumbersRecursive(t1Root));
    }

    @Test
    public void example2Test() {
        //  [4,9,0,5,1]
        TreeNode t2Root = new TreeNode(4);
        t2Root.left = new TreeNode(9);
        t2Root.right = new TreeNode(0);
        t2Root.left.left = new TreeNode(5);
        t2Root.left.right = new TreeNode(1);

        assertEquals(1026, instance.sumNumbersRecursive(t2Root));
    }

    @Test
    public void nullNodeTest() {
        //  [4,9,0,null,1]
        TreeNode t2Root = new TreeNode(4);
        t2Root.left = new TreeNode(9);
        t2Root.right = new TreeNode(0);
        t2Root.left.left = null;
        t2Root.left.right = new TreeNode(1);

        assertEquals(531, instance.sumNumbersRecursive(t2Root));
    }
}
