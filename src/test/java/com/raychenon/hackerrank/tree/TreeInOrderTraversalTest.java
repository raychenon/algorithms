package com.raychenon.hackerrank.tree;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 8/2/19
 * https://www.hackerrank.com/challenges/tree-inorder-traversal/problem
 */
public class TreeInOrderTraversalTest {

    @Test
    public void assertEmptyTreeInOrderTraversal() {
        Node nullNode = null;
        assertInOrderTraversalNode("", nullNode);
    }


    private void assertInOrderTraversalNode(String expectedValue, Node node) {
        assertEquals(expectedValue, TreeInOrderTraversal.inOrderRecursive(node).toString());
    }
}
