#!/bin/python3

"""
https://leetcode.com/problems/group-anagrams/
"""

class GroupAnagrams:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        map = dict()
        for s in strs:
            map[tuple(sorted(s))].append(s)
        return map.values
