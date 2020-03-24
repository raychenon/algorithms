#!/bin/python3
from typing import List

"""
Given an array of integers, find if the array contains any duplicates.
https://leetcode.com/problems/contains-duplicate/
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

if __name__ == "__main__":
    assert True == containsDuplicate([1, 2, 3, 1])
    assert False == containsDuplicate([1, 2, 3, 4])
    assert True == containsDuplicate([1, 1, 1, 3, 3, 4, 3, 2, 4, 2])

    assert True == containsDuplicateOneLine([1, 2, 3, 1])
    assert False == containsDuplicateOneLine([1, 2, 3, 4])
    assert True == containsDuplicateOneLine([1, 1, 1, 3, 3, 4, 3, 2, 4, 2])
