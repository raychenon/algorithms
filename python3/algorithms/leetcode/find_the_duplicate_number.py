#!/bin/python3
from typing import List


def findDuplicate(nums: List[int]) -> int:
    numSet = set()
    for num in nums:
        if num in numSet:
            return num
        numSet.add(num)

if __name__ == "__main__":
    2 == findDuplicate([1,3,4,2,2])
    3 == findDuplicate([3,1,3,4,2])