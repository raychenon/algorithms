#!/bin/python3
import collections
from typing import List
import re

"""
https://leetcode.com/problems/most-common-word/
"""
def mostCommonWord(paragraph: str, banned: List[str]) -> str:
    banSet = set(banned)
    words = re.findall(r'\w+',paragraph.lower())
    return collections.Counter(w for w in words if w not in banSet).most_common(1)[0][0]


if __name__ == "__main__":
    assert mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.",["hit"]) == "ball"
