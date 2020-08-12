#!/bin/python3
from typing import List

"""
https://leetcode.com/problems/h-index/
"""


def hIndex(citations: List[int]) -> int:
    """
    Time complexity: O(n*log(n)) = 0(n*log(n)) + O(n)
    Space complexity: O(1)
    :param citations:
    :return:
    """
    citations.sort()
    n = len(citations)
    i = 1
    while i <= n and citations[n - i] >= i:
        i = i + 1
    return i - 1


def evalHIndex(expected: int, citations: List[int]):
    assert expected == hIndex(citations)


if __name__ == "__main__":
    evalHIndex(3, [3, 0, 6, 1, 5])
    evalHIndex(6, [12, 7, 8, 9, 10, 11])
    evalHIndex(5, [12, 7, 8, 9, 10, 3])
