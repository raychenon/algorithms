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
        assertEquals(true, binarySearchTree.checkBST(root));
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
        assertEquals(true, binarySearchTree.checkBST(root));
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
        assertEquals(false, binarySearchTree.checkBST(root));
    }

//    Input (stdin) Download
//    2
//    1 2 3 5 4 6 7

//    Expected Output Download
//    No

    @Test
    public void assertIsBinarySearchTree() {

        Node node = new Node(1);
        node.insert(node, 2);
        node.insert(node, 3);
        node.insert(node, 5);
        node.insert(node, 4);
        node.insert(node, 6);
        node.insert(node, 7);

        assertEquals(true, binarySearchTree.checkBST(node));
    }

    @Test
    public void assertBinarySearchTreeOnRightBranch() {

        Node node = new Node(3);

        Node nodeRight = new Node(5);
        nodeRight.right = new Node(2);

        node.left = new Node(1);
        node.right = nodeRight;
        //        3
        //       /  \
        //      1    5
        //          / \
        //             2

        assertEquals(false, binarySearchTree.checkBST(node));
    }
}
