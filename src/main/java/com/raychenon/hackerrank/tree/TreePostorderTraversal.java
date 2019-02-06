package com.raychenon.hackerrank.tree;

import java.util.List;

/**
 * User: raychenon
 * Date: 6/2/19
 * https://www.hackerrank.com/challenges/tree-postorder-traversal/problem
 */
public class TreePostorderTraversal {

    // IGNORE for codecov.io
//    public static void postOrder(Node root) {
//        System.out.print(postOrderStr(root).toString());
//    }

    // easier to test with a String out with Junit
    public static StringBuilder postOrderStr(Node root) {
        StringBuilder str = new StringBuilder();
        postOrderStr(root,str);
        return str;
    }

    /**
     * time complexity : O(n)
     * space complexity : O(1)
     * @param root
     */
    private static StringBuilder postOrderStr(Node root, StringBuilder str) {
        if(root == null){
            return str.append("/");
        }

        //   1. Traverse the left subtree, i.e., call Postorder(left-subtree)
        if (root.left != null){
            postOrderStr(root.left,str);
        }
        //   2. Traverse the right subtree, i.e., call Postorder(right-subtree)
        if(root.right != null){
            postOrderStr(root.right,str);
        }
        //   3. Visit the root.

        return str.append(String.format("%d ",root.data));
    }


}


class Node {
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data = data;
    }

    public Node insert(Node root, int data){
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }
}
