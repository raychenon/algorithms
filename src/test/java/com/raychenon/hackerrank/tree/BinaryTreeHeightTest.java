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
        assertHeight(0, node);
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

        assertHeight(3, node);
    }

    @Test
    public void assertTreeHeightOnlyRightBranch() {

        Node node = new Node(3);
        node.insert(node, 1);
        node.insert(node, 7);
        node.insert(node, 5);
        node.insert(node, 4);

        //            3
        //           / \
        //          1   4
        //               \
        //                5
        //                 \
        //                  7

        assertHeight(3, node);
    }

    /**
     * the longest height is not on the extreme left or right branch
     */
    @Test
    public void assertHeightTreeWhenLongestHeightIsNotExtremeLeftOrRight() {

        Node node = new Node(3);
        node.insert(node, 1);
        node.insert(node, 11);
        node.insert(node, 9);
        node.insert(node, 20);
        node.insert(node, 7);
        node.insert(node, 5);

        //            3
        //           / \
        //          1   11
        //              /\
        //             9  20
        //            /
        //           7
        //          /
        //         5

        assertHeight(4, node);
    }


    private void assertHeight(int expectedHeight, Node node) {
        assertEquals(expectedHeight, BinaryTreeHeight.height(node));
        assertEquals(expectedHeight, BinaryTreeHeight.heightIterative(node));
    }
}
