package com.raychenon.leetcode.tree;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

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
        TreeNode t1Root =  TreeUtil.createTree(Arrays.asList(1,2,3));
        assertEquals(25, instance.sumNumbersRecursive(t1Root));
    }

    @Test
    public void example2Test() {
        //  [4,9,0,5,1]
        TreeNode t2Root = TreeUtil.createTree(Arrays.asList(4, 9, 0, 5, 1));

        assertEquals(1026, instance.sumNumbersRecursive(t2Root));
    }

    @Test
    public void nullNodeTest() {
        //  [4,9,0,null,1]
        TreeNode t2Root = TreeUtil.createTree(Arrays.asList(4,9,0,null,1));

        assertEquals(531, instance.sumNumbersRecursive(t2Root));
    }
}
