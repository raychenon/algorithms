package com.raychenon.hackerrank.tree;

/**
 * User: raychenon
 * Date: 6/2/19
 */
public class TreePostorderTraversal {

    public static void postOrder(Node root) {

    }

    public static Node insert(Node root, int data) {
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


class Node {
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data = data;
    }
}
