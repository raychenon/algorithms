#!/bin/python3
from collections import defaultdict
from typing import List

"""
https://leetcode.com/problems/count-unreachable-pairs-of-nodes-in-an-undirected-graph/
"""


def countPairs(n: int, edges: List[List[int]]) -> int:
    def dfs(node, seen):
        if node in seen:
            return 0

        seen.add(node)
        size = 1
        for neighbor in adj[node]:
            size += dfs(neighbor, seen)

        return size

    adj = defaultdict(list)
    for a, b in edges:
        adj[a].append(b)
        adj[b].append(a)

    seen = set()
    result = 0
    sum_ = dfs(0, seen)
    for node in range(n):
        if node not in seen:
            size = dfs(node, seen)
            result += size * sum_
            sum_ += size

    return result


if __name__ == "__main__":
    assert countPairs(3, [[0, 1], [0, 2], [1, 2]]) == 0
    assert countPairs(7, [[0, 2], [0, 5], [2, 4], [1, 6], [5, 4]]) == 14
