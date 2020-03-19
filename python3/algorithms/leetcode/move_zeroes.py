#!/bin/python3
import collections
from typing import List
import re

"""
https://leetcode.com/problems/move-zeroes/
"""
def moveZeroes(nums: List[int]) -> None:
    last_non_zeroes = 0
    for i in range(len(nums)):
        if nums[i] != 0:
            nums[i], nums[last_non_zeroes] = nums[last_non_zeroes], nums[i]
            last_non_zeroes += 1

if __name__ == "__main__":
    input = [0,1,0,3,12]
    moveZeroes(input)
    assert input == [1,3,12,0,0]