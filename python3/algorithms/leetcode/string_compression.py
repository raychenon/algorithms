#!/bin/python3
from typing import List

"""
https://leetcode.com/problems/string-compression/
"""


def compress(chars: List[str]) -> int:
    left = i = 0
    while i < len(chars):
        char, length = chars[i], 1
        while (i + 1) < len(chars) and char == chars[i + 1]:
            length, i = length + 1, i + 1
        chars[left] = char
        if length > 1:
            len_str = str(length)
            chars[left + 1: left + 1 + len(len_str)] = len_str
            left += len(len_str)
        left, i = left + 1, i + 1
    return left


def test_compress():
    assert compress(["a", "a", "b", "b", "c", "c", "c"]) == 6
    assert compress(["a"]) == 1
    assert compress([]) == 0
