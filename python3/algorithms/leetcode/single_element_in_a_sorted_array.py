#!/bin/python3
from typing import List
"""
https://leetcode.com/problems/single-element-in-a-sorted-array/
"""


def single_non_duplicate_bruteforce(nums: List[int]) -> int:
    """
    brute force
    The single number will be on an EVEN index
    """
    size = len(nums)
    i = 0
    while (i < size - 1):
        if nums[i] != nums[i + 1]:
            return nums[i]
        i = i + 2
    return nums[size - 1]


def assert_methods(nums: List[int], expected: int) -> None:
    assert single_non_duplicate_bruteforce(nums) == expected


if __name__ == "__main__":
    assert_methods([1, 1, 2, 3, 3, 4, 4, 8, 8], 2)
    assert_methods([3, 3, 7, 7, 10, 11, 11], 10)
    assert_methods([3, 3, 7, 7, 11, 11, 12], 12)
