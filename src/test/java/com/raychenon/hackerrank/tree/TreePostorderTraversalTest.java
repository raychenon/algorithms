package com.raychenon.hackerrank.tree;

import com.raychenon.hackerrank.AVeryBigSum;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 6/2/19
 * https://www.hackerrank.com/challenges/tree-postorder-traversal/problem
 */
public class TreePostorderTraversalTest {

    @Test
    public void assertSingleTreePostorderTraversal() {

        Node node = new Node(1);

        StringBuilder outContent = TreePostorderTraversal.postOrderStr(node);
        assertEquals("1 ", outContent.toString());
    }

    @Test
    public void assertTreePostorderTraversal() {

        Node node = new Node(1);
        node.insert(node,2);
        node.insert(node,5);
        node.insert(node,3);
        node.insert(node,6);
        node.insert(node,4);

        StringBuilder outContent = TreePostorderTraversal.postOrderStr(node);
        assertEquals("4 3 6 5 2 1 ", outContent.toString());
    }
}
