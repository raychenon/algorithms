#!/bin/python3
from typing import List

"""
https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
Time complexity: O(log2(n))
Space complexity: O(1)
"""


def findMin(nums: List[int]) -> int:
    left = 0
    right = len(nums) - 1
    while left < right:
        mid = left + (right - left) // 2
        if nums[mid] < nums[right]:
            right = mid
        else:
            left = mid + 1
    return nums[left]


def test_find_min():
    assert findMin([3, 4, 5, 1, 2]) == 1
    assert findMin([4, 5, 6, 7, 0, 1, 2]) == 0
