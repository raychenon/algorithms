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

    private void assertLCA(Node root, int v1, int v2, Node expectedNode) {
        // recursive
        assertEquals(expectedNode, BinarySearchTreeLowestCommonAncestor.lca(root, v1, v2));
        // iterative
        assertEquals(expectedNode, BinarySearchTreeLowestCommonAncestor.lcaIterative(root, v1, v2));
    }
}
