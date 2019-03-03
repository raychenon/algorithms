package com.raychenon.hackerrank.tree;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 3/3/19
 * https://www.hackerrank.com/challenges/tree-height-of-a-binary-tree/problem
 */
public class BinaryTreeHeightTest {


    @Test
    public void assertSingleNodeHeight() {

        Node node = new Node(1);
        assertEquals(0, BinaryTreeHeight.height(node));
    }

    @Test
    public void assertTreeHeight() {

        Node node = new Node(3);
        node.insert(node, 2);
        node.insert(node, 1);
        node.insert(node, 5);
        node.insert(node, 4);
        node.insert(node, 6);
        node.insert(node, 7);

        //            3
        //           / \
        //          2   5
        //         /    /\
        //         1   4  6
        //                 \
        //                  7

        assertEquals(3, BinaryTreeHeight.height(node));
    }

}
