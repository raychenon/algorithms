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
    public void assertLCA_testcase_0() {

        Node node = new Node(4);
        node.insert(node, 2);
        node.insert(node, 3);
        node.insert(node, 1);
        node.insert(node, 7);
        node.insert(node, 6);

        assertEquals(node, BinarySearchTreeLowestCommonAncestor.lca(node,1,7));
    }
}
