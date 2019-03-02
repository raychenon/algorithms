package com.raychenon.hackerrank.tree;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 21/2/19
 * https://www.hackerrank.com/challenges/binary-search-tree-lowest-common-ancestor/problem
 */
public class BinarySearchTreeLowestCommonAncestorTest {

    @Test
    public void assertLCAWhenNodeIsSingle() {

        Node node = new Node(1);

        assertEquals(node, BinarySearchTreeLowestCommonAncestor.lca(node, 1, 1));
    }

    @Test
    public void assertLCA_testcase_0() {

        Node node = new Node(4);
        node.insert(node, 2);
        node.insert(node, 3);
        node.insert(node, 1);
        node.insert(node, 7);
        node.insert(node, 6);

        //                   4
        //                /     \
        //               2       7
        //             /   \    /
        //            1     3  6

        assertLCA(node, 1, 7, node);
    }


    @Test
    public void assertLCA_testcase_1() {

        Node node = new Node(8);
        node.insert(node, 4);
        node.insert(node, 9);
        node.insert(node, 1);
        node.insert(node, 6);
        node.insert(node, 2);
        node.insert(node, 5);
        node.insert(node, 7);
        node.insert(node, 3);

        //                  8
        //                /   \
        //               4     9
        //             /    \
        //            1      6
        //             \    / \
        //              2   5  7
        //               \
        //                3

        Node node4 = new Node(4);
        assertLCA(node, 2, 5, node4);
        assertLCA(node, 3, 7, node4);

        Node node8 = new Node(8);
        assertLCA(node, 1, 9, node8);
    }

    @Test
    public void assertLCA_testcase_2() {

        Node node = new Node(5);
        node.insert(node, 3);
        node.insert(node, 8);
        node.insert(node, 2);
        node.insert(node, 4);
        node.insert(node, 6);
        node.insert(node, 7);

        //                  5
        //                /    \
        //               3      8
        //             /   \    / 
        //            2     4  6
        //                       \
        //                        7

        Node node5 = new Node(5);

        // NOTE v1 < v2
        // this input should be inverted, 3,7 instead of 7,3
        assertLCA(node, 7, 3, node5);
    }

    @Test
    public void assertLCA_right_branch() {
        Node node = new Node(5);
        node.insert(node, 6);
        node.insert(node, 7);
        node.insert(node, 8);
        node.insert(node, 9);

        //       5
        //        \
        //         6
        //          \
        //           7
        //            \
        //             8

        Node expectedNode = new Node(6);
        assertLCA(node, 6, 8, expectedNode);
    }

    private void assertLCA(Node root, int v1, int v2, Node expectedNode) {
        // recursive
        assertEquals(expectedNode.data, BinarySearchTreeLowestCommonAncestor.lca(root, v1, v2).data);
        // iterative
        assertEquals(expectedNode.data, BinarySearchTreeLowestCommonAncestor.lcaIterative(root, v1, v2).data);
    }
}
