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
    public void assertEmptyTreePostorderTraversal() {

        Node nullNode = null;
        StringBuilder outContent = TreePostorderTraversal.postOrderStr(nullNode);
        assertEquals("", outContent.toString());
    }


    @Test
    public void assertSingleTreePostorderTraversal() {

        Node node = new Node(1);

        StringBuilder outContent = TreePostorderTraversal.postOrderStr(node);
        assertEquals("1 ", outContent.toString());
    }

    @Test
    public void assertTreePostorderTraversal_testcase_0() {

        Node node = new Node(1);
        node.insert(node,2);
        node.insert(node,5);
        node.insert(node,3);
        node.insert(node,6);
        node.insert(node,4);

        StringBuilder outContent = TreePostorderTraversal.postOrderStr(node);
        assertEquals("4 3 6 5 2 1 ", outContent.toString());
    }

    @Test
    public void assertTreePostorderTraversal_testcase_1() {

        Node node = new Node(1);
        node.insert(node,14);
        node.insert(node,3);
        node.insert(node,7);
        node.insert(node,4);
        node.insert(node,5);
        node.insert(node,15);
        node.insert(node,6);
        node.insert(node,13);
        node.insert(node,10);
        node.insert(node,11);
        node.insert(node,2);
        node.insert(node,12);
        node.insert(node,8);
        node.insert(node,9);

        StringBuilder outContent = TreePostorderTraversal.postOrderStr(node);
        assertEquals("2 6 5 4 9 8 12 11 10 13 7 3 15 14 1 ", outContent.toString());
    }



}
