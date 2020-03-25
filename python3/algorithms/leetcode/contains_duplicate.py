#!/bin/python3
from typing import List

"""
Given an array of integers, find if the array contains any duplicates.
https://leetcode.com/problems/contains-duplicate/

The Tortoise and Hare method won't work to find whether an array contains a duplicate => infinite loop.
If there is at least a duplicate,  Floyd's Tortoise and Hare will find the duplicate 
https://leetcode.com/problems/find-the-duplicate-number/
"""


def containsDuplicate(nums: List[int]) -> bool:
    collection = set()
    for num in nums:
        if num in collection:
            return True
        else:
            collection.add(num)
    return False


def containsDuplicateOneLine(nums: List[int]) -> bool:
    return len(set(nums)) != len(nums)


def assertDuplicateMethods(expected: bool, nums: List[int]) -> None:
    assert expected == containsDuplicate(nums)
    assert expected == containsDuplicateOneLine(nums)


if __name__ == "__main__":
    assertDuplicateMethods(True, [1, 2, 3, 1])
    assertDuplicateMethods(False, [1, 2, 3, 4])
    assertDuplicateMethods(True, [1, 1, 1, 3, 3, 4, 3, 2, 4, 2])
