#!/bin/python3
import collections
from typing import List
import re

"""
https://leetcode.com/problems/move-zeroes/
"""
def moveZeroes(nums: List[int]) -> None:
    acc_zeroes_count = 0
    for i in range(len(nums)):
        if nums[i] == 0:
            acc_zeroes_count += 1
        elif acc_zeroes_count > 0:
            temp = nums[i]
            nums[i] = 0
            nums[i-acc_zeroes_count] = temp

if __name__ == "__main__":
    input = [0,1,0,3,12]
    moveZeroes(input)
    assert input == [1,3,12,0,0]