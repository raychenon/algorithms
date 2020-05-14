#!/bin/python3
from typing import List

"""
https://leetcode.com/problems/single-element-in-a-sorted-array/
"""


def single_non_duplicate_bruteforce(nums: List[int]) -> int:
    """
    brute force
    The single number will be on an EVEN index

    Time complexity: O(n)
    Space complexity: O(1)

    """
    size = len(nums)
    i = 0
    while (i < size - 1):
        if nums[i] != nums[i + 1]:
            return nums[i]
        i = i + 2
    return nums[size - 1]


def single_non_duplicate_binary_search(nums: List[int]) -> int:
    """
     The single element is at the first even index not followed by its pair
     Before the unique number, the pair starts with EVEN index.
     After the unique number, the pair starts with ODD index.

     Time complexity: O(log2(n))
     Space complexity: O(1)

    :param nums:
    :return:
    """
    left = 0
    right = len(nums) - 1
    while (left < right):
        mid = left + (right - left) // 2
        if mid % 2 == 1:  # make "mid" start at even index
            mid = mid - 1

        if nums[mid] == nums[mid + 1]:
            left = mid + 2
        else:
            right = mid
    return nums[left]


def assert_methods(nums: List[int], expected: int) -> None:
    assert single_non_duplicate_bruteforce(nums) == expected
    assert single_non_duplicate_binary_search(nums) == expected


if __name__ == "__main__":
    assert_methods([1, 1, 2, 3, 3, 4, 4, 8, 8], 2)
    assert_methods([3, 3, 7, 7, 10, 11, 11], 10)
    assert_methods([3, 3, 7, 7, 11, 11, 12], 12)
