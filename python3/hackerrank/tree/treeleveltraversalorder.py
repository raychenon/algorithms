from node import Node
from node import BinarySearchTree

"""
Node is defined as
self.left (the left child of the node)
self.right (the right child of the node)
self.info (the value of the node)
https://www.hackerrank.com/challenges/tree-level-order-traversal/problem
"""
def levelOrder(root):
    if root is None:
        return

    q = [root]
    while(len(q) > 0):
        n = q.pop(0)
        print(n.info,end=" ")
        if n.left:
            q.append(n.left)
        if n.right:
            q.append(n.right)