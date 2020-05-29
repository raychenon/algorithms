#!/bin/python3
from typing import List
import collections

"""
Best explanation: https://leetcode.com/problems/possible-bipartition/
"""

def possibleBipartition(N: int, dislikes: List[List[int]]) -> bool:
    """
    https://leetcode.com/problems/possible-bipartition/solution/
    :param self:
    :param N:
    :param dislikes:
    :return:

    Time Complexity: O(V + E) where E is the length of dislikes. V for vertices coloring
    Space Complexity: O(V + E).
    """
    graph = collections.defaultdict(list)
    for u, v in dislikes:
        graph[u].append(v)
        graph[v].append(u)

    color = {}

    def dfs(node, c=0):
        if node in color:
            return color[node] == c
        color[node] = c
        return all(dfs(nei, c ^ 1) for nei in graph[node])

    return all(dfs(node)
               for node in range(1, N + 1)
               if node not in color)


def possibleBipartitionDFS(N: int, dislikes: List[List[int]]) -> bool:
    """
    https://www.youtube.com/watch?v=NKPh60YawTE
    """

    d = collections.defaultdict(list)
    for a, b in dislikes:
        d[a].append(b)
        d[b].append(a)

    group = {i: None for i in range(1, N + 1)}

    def dfs(node, g):
        if not group[node]:
            group[node] = g
        else:
            return group[node] == g

        for peeps in d[node]:
            if not dfs(peeps, 2 if g == 1 else 1):
                return False
        return True

    for n in range(1, N + 1):
        if not group[n] and not dfs(n, 1):
            return False
    return True


def assertPossibleBipartition(N: int, dislikes: List[List[int]], expected: bool) -> None:
    assert possibleBipartition(N, dislikes) == expected
    assert possibleBipartitionDFS(N, dislikes) == expected


if __name__ == "__main__":
    assertPossibleBipartition(4, [[1, 2], [1, 3], [2, 4]], True)
    assertPossibleBipartition(3, [[1, 2], [1, 3], [2, 3]], False)
    assertPossibleBipartition(5, [[1, 2], [2, 3], [3, 4], [4, 5], [1, 5]], False)
