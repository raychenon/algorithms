#!/bin/python3
from typing import List

"""
Given a range [m, n] where 0 <= m <= n <= 2147483647, return the bitwise AND of all numbers in this range, inclusive.
Reformulation: the problem as "given two integer numbers, we are asked to find the common prefix of their binary strings.

https://leetcode.com/problems/bitwise-and-of-numbers-range/

"""


def rangeBitwiseAndBitShift(m: int, n: int) -> int:
    shift = 0
    # find common 1-bits
    while m < n:
        m = m >> 1
        n = n >> 1
        shift = shift + 1
    return m << shift


def assertRangeBitwiseMethods(arr: List[int], expected: int) -> None:
    assert rangeBitwiseAndBitShift(arr[0], arr[1]) == expected


if __name__ == "__main__":
    assertRangeBitwiseMethods([5, 7], 4)
    assertRangeBitwiseMethods([0, 1], 0)
    assertRangeBitwiseMethods([8, 12], 8)
    assertRangeBitwiseMethods([0, 2147483647], 0)
    assertRangeBitwiseMethods([2147483646, 2147483647], 2147483646)
