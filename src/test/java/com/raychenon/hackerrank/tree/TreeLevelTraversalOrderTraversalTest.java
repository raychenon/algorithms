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
        //          \
        //           4

        assertEquals("1 2 5 6 3 4", TreeLevelTraversalOrder.levelOrder(node));
    }
}
