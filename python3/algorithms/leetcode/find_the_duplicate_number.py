#!/bin/python3
from typing import List


def findDuplicate(nums: List[int]) -> int:
    """
    https://leetcode.com/problems/find-the-duplicate-number

    time complexity: O(n)
    space complexity: O(n)
    """
    numSet = set()
    for num in nums:
        if num in numSet:
            return num
        numSet.add(num)



def assert_methods(expected_result: int, nums: List[int]):
    assert findDuplicate(nums) == expected_result


if __name__ == "__main__":
    assert_methods(2, [1, 3, 4, 2, 2])
    assert_methods(3, [3, 1, 3, 4, 2])
