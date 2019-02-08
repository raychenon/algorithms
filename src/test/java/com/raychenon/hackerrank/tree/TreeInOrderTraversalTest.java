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

    @Test
    public void assertSingleTreeInOrderTraversal() {

        Node node = new Node(1);
        assertInOrderTraversalNode("1 ", node);
    }

    @Test
    public void assertTreeInOrderTraversal_testcase_0() {

        Node node = new Node(1);
        node.insert(node, 2);
        node.insert(node, 5);
        node.insert(node, 3);
        node.insert(node, 6);
        node.insert(node, 4);

        assertInOrderTraversalNode("4 3 6 5 2 1 ", node);
    }

    public void assertTreeInOrderTraversal_testcase_2() {

        Node node = new Node(1);
        node.insert(node, 2);
        node.insert(node, 5);
        node.insert(node, 3);
        node.insert(node, 6);
        node.insert(node, 4);
        node.insert(node, 5);
        node.insert(node, 15);
        node.insert(node, 6);
        node.insert(node, 13);
        node.insert(node, 10);
        node.insert(node, 11);
        node.insert(node, 2);
        node.insert(node, 12);
        node.insert(node, 8);
        node.insert(node, 9);

        assertInOrderTraversalNode("1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 ", node);
    }


    private void assertInOrderTraversalNode(String expectedValue, Node node) {
        assertEquals(expectedValue, TreeInOrderTraversal.inOrderRecursive(node).toString());
    }
}
