package com.raychenon.hackerrank.tree;

/**
 * User: raychenon
 * Date: 6/2/19
 * https://www.hackerrank.com/challenges/tree-postorder-traversal/problem
 */
public class TreePostorderTraversal {

    public static void postOrder(Node root) {
        if(root == null){
            return;
        }

        //   1. Traverse the left subtree, i.e., call Postorder(left-subtree)
        if (root.left != null){
            postOrder(root.left);
        }
        //   2. Traverse the right subtree, i.e., call Postorder(right-subtree)
        if(root.right != null){
            postOrder(root.right);
        }
        //   3. Visit the root.

        System.out.print(String.format("%d ",root.data));
    }

    public static Node insert(Node root, int data){
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
