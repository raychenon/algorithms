package com.raychenon.hackerrank.tree;

import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 29/3/19
 * https://www.hackerrank.com/challenges/is-binary-search-tree/problem
 */
public class BinarySearchTreeTest {

    private static BinarySearchTree binarySearchTree;

    @BeforeClass
    public static void setUp() {
        binarySearchTree = new BinarySearchTree();
    }


    @Test
    public void assertBinarySearchSimpleTreeIsCorrect() {
        Node root = new Node(3);
        Node nodeLeft2 = new Node(1);
        Node nodeRight2 = new Node(5);
        root.left = nodeLeft2;
        root.right = nodeRight2;

        //        3
        //      /    \
        //     1      5
        assertEquals(binarySearchTree.checkBST(root), true);
    }


    @Test
    public void assertBinarySearchTreeIsCorrect() {
        Node root = new Node(3);
        Node nodeLeft2 = new Node(2);
        Node nodeRight2 = new Node(5);
        root.left = nodeLeft2;
        root.right = nodeRight2;

        Node nodeLeft3 = new Node(1);
        nodeLeft2.left = nodeLeft3;
        
        nodeRight2.left = new Node(4);
        nodeRight2.right = new Node(7);

        //        3
        //      /    \
        //     2      5
        //    /      / \
        //   1       4  7
        assertEquals(binarySearchTree.checkBST(root), true);
    }

    @Test
    public void assertNotBinarySearchTree() {
        Node root = new Node(3);
        Node nodeLeft2 = new Node(5);
        Node nodeRight2 = new Node(2);
        root.left = nodeLeft2;
        root.right = nodeRight2;

        //        3
        //      /    \
        //     5      2
        //    / \    / \
        //   1   4   6
        assertEquals(binarySearchTree.checkBST(root), false);
    }

}
