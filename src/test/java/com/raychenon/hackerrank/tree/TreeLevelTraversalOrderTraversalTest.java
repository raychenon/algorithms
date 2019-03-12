package com.raychenon.hackerrank.tree;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 8/3/19
 * https://www.hackerrank.com/challenges/tree-level-order-traversal/problem
 */
public class TreeLevelTraversalOrderTraversalTest {


    @Test
    public void assertEmptyTreeLevelOrder() {
        Node node = null;
        assertEquals("", TreeLevelTraversalOrder.levelOrder(node));
    }

    @Test
    public void assertTreeLevelOrder() {

        Node node = new Node(1);
        node.insert(node, 2);
        node.insert(node, 5);
        node.insert(node, 6);
        node.insert(node, 3);
        node.insert(node, 4);

        //        1
        //         \
        //          2
        //           \
        //            5
        //           / \
        //          3   6
        //           \
        //            4

        assertEquals("1 2 5 3 6 4", TreeLevelTraversalOrder.levelOrder(node));
    }


    @Test
    public void assertLargeTreeLevelOrder() {

        Node node = new Node(20);
        node.insert(node, 10);
        node.insert(node, 30);
        node.insert(node, 5);
        node.insert(node, 15);
        node.insert(node, 25);
        node.insert(node, 35);
        node.insert(node, 1);
        node.insert(node, 7);
        node.insert(node, 12);
        node.insert(node, 17);
        node.insert(node, 22);
        node.insert(node, 27);
        node.insert(node, 33);
        node.insert(node, 37);

        //               20
        //        /             \
        //       10               30
        //     /    \           /     \
        //    5      15        25      35
        //   / \     /  \      / \    /  \
        //   1  7   12  17    22  27  33  37
        //

        assertEquals("20 10 30 5 15 25 35 1 7 12 17 22 27 33 37", TreeLevelTraversalOrder.levelOrder(node));
    }

}
