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


def find_duplicate_floyd(nums: List[int]) -> int:
    """
    Floyd's Tortoise and Hare

    constraints of the problem: `nums` contain integer ranged from 1 to n
    Each number in `nums` will point to an index that exists.
    The list can eb traversed infinitely => cycle.

    Time complexity : O(n)
    Space complexity : O(1)
    """
    tortoise = nums[0]
    hare = nums[0]
    # do while loop Pythonic way , if condition then break
    while True:
        tortoise = nums[tortoise]
        hare = nums[nums[hare]]
        if tortoise == hare:
            break

    # find the entrance to the cycle
    slow = nums[0]
    fast = tortoise
    while slow != fast:
        slow = nums[slow]
        fast = nums[fast]

    return slow


def assert_methods(expected_result: int, nums: List[int]) -> None:
    assert findDuplicate(nums) == expected_result
    assert find_duplicate_floyd(nums) == expected_result


def test_find_duplicate():
    assert_methods(2, [1, 3, 4, 2, 2])
    assert_methods(3, [3, 1, 3, 4, 2])
    assert_methods(3, [3, 3, 3, 3, 3])
