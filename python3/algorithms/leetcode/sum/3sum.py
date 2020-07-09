#!/bin/python3
from typing import List

"""
https://leetcode.com/problems/3sum/solution/
"""


def threeSum(nums: List[int]) -> List[List[int]]:
    """
    Time Complexity: O(n^2)
    Space Complexity: O(n^2)
    """
    res = []
    found = set()
    for i, val1 in enumerate(nums):
        seen = set()
        for j, val2 in enumerate(nums[i + 1:]):
            complement = -val1 - val2
            if complement in seen:
                min_val = min((val1, val2, complement))
                max_val = max((val1, val2, complement))
                if (min_val, max_val) not in found:
                    found.add((min_val, max_val))
                    res.append([val1, val2, complement])
            seen.add(val2)
            
    return res


if __name__ == '__main__':
    assert threeSum([-1, 0, 1, 2, -1, -4]) == [[-1, 1, 0], [-1, -1, 2]]
