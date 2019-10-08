#!/bin/python3
from typing import List


def longestSubsequence(arr: List[int], difference: int) -> int:
    """
    https://leetcode.com/problems/longest-arithmetic-subsequence-of-given-difference/
    :param arr:
    :param difference:
    :return:
    """
    map = dict()
    longest = 0
    for a in arr:
        map[a] = map.get(a - difference, 0) + 1
        longest = max(longest, map.get(a, 0))
    return longest


if __name__ == "__main__":
    assert longestSubsequence([1, 2, 3, 4], 1) == 4
    assert longestSubsequence([1, 3, 5, 7], 1) == 1
    assert longestSubsequence([1, 5, 7, 8, 5, 3, 4, 2, 1], -2) == 4
