#!/usr/bin/env python3

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