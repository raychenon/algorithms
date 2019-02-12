package com.raychenon.hackerrank.tree;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 12/2/19
 * https://www.hackerrank.com/challenges/tree-preorder-traversal/problem
 */
public class TreePreOrderTraversalTest {

    @Test
    public void assertEmptyTreePreOrderTraversal() {
        Node nullNode = null;
        assertPreOrderTraversalNode("", nullNode);
    }

    @Test
    public void assertSingleTreePreOrderTraversal() {

        Node node = new Node(1);
        assertPreOrderTraversalNode("1 ", node);
    }

    @Test
    public void assertTreePreOrderTraversal_testcase_0() {

        Node node = new Node(1);
        node.insert(node, 2);
        node.insert(node, 5);
        node.insert(node, 3);
        node.insert(node, 6);
        node.insert(node, 4);

        assertPreOrderTraversalNode("1 2 5 3 4 6 ", node);
    }

    @Test
    public void assertTreePreOrderTraversal_testcase_1() {

        Node node = new Node(1);
        node.insert(node, 14);
        node.insert(node, 3);
        node.insert(node, 7);
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

        assertPreOrderTraversalNode("1 14 3 2 7 4 5 6 13 10 8 9 11 12 15 ", node);
    }
    
    private void assertPreOrderTraversalNode(String expectedValue, Node node) {
        assertEquals(expectedValue, TreePreOrderTraversal.preOrderRecursive(node).toString());
        assertEquals(expectedValue, TreePreOrderTraversal.preOrderIterative(node).toString());
    }
}
