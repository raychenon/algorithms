#!/bin/python3
from typing import List
from collections import defaultdict


def groupAnagrams(strs: List[str]) -> List[List[str]]:
    """
    https://leetcode.com/problems/group-anagrams/
    time complexity: O(n)
    space complexity: O(1)
    """
    mapping = collections.defaultdict(list)
    for s in strs:
        count = [0] * 26
        for c in s:
            count[ord(c) - ord('a')] += 1
        mapping[tuple(count)].append(s)
    return mapping.values


if __name__ == "__main__":
    assert groupAnagrams(["eat", "tea", "tan", "ate", "nat", "bat"]) == [["ate", "eat", "tea"], ["nat", "tan"], ["bat"]]
