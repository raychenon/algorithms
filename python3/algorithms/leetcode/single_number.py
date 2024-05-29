#!/bin/python3
from typing import List


def singleNumber(nums: List[int]) -> int:
    """
    https://leetcode.com/problems/single-number/
    Given a non-empty array of integers, every element appears twice except for one. Find that single one.

    bit manipulation with XOR operator
    """
    a = 0
    for i in nums:
        a ^= i
    return a


def test_single_number():
    assert singleNumber([2, 2, 1]) == 1
    assert singleNumber([4, 1, 2, 1, 2]) == 4
