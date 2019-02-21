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

        assertEquals(node, BinarySearchTreeLowestCommonAncestor.lca(node,1,1));
    }

    @Test
    public void assertLCA_testcase_0() {

        Node node = new Node(4);
        node.insert(node, 2);
        node.insert(node, 3);
        node.insert(node, 1);
        node.insert(node, 7);
        node.insert(node, 6);

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

        Node node1 = new Node(2);

        assertLCA(node, 2, 3, node1);
    }

    private void assertLCA(Node root, int v1, int v2, Node expectedNode) {
        // recursive
        assertEquals(expectedNode.data, BinarySearchTreeLowestCommonAncestor.lca(root, v1, v2).data);
        // iterative
        assertEquals(expectedNode.data, BinarySearchTreeLowestCommonAncestor.lcaIterative(root, v1, v2).data);
    }
}
