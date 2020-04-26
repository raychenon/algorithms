#!/bin/python3
from typing import List

"""
Given a range [m, n] where 0 <= m <= n <= 2147483647, return the bitwise AND of all numbers in this range, inclusive.
Reformulation: the problem as "given two integer numbers, we are asked to find the common prefix of their binary strings.

https://leetcode.com/problems/bitwise-and-of-numbers-range/

"""


def rangeBitwiseAndBitShift(m: int, n: int) -> int:
    """
    1 right shift both numbers to the right to get their common prefix (most significant bit)
    2 left shift by the number of common prefix

    Time Complexity: O(1), the number of iterations is bounded by the number of bits that an integer has, which is fixed
    Space Complexity: O(1)
    :param m:
    :param n:
    :return: the bitwise AND of all numbers in this range, inclusive
    """
    shift = 0
    # find common 1-bits
    while m < n:
        m = m >> 1
        n = n >> 1
        shift = shift + 1
    return m << shift


def rangeBitwiseAndBK(m: int, n: int) -> int:
    """
    Brian Kernighan's Algorithm : n AND (n-1), the rightmost bit is 0
    Time Complexity: O(1), the number of iterations is bounded by the number of bits that an integer has, which is fixed
    Space Complexity: O(1)

    :param m:
    :param n: m < n
    :return: the bitwise AND of all numbers in this range, inclusive
    """
    while m < n:
        n = n & (n - 1)
    return m & n


def assertRangeBitwiseMethods(arr: List[int], expected: int) -> None:
    assert rangeBitwiseAndBitShift(arr[0], arr[1]) == expected
    assert rangeBitwiseAndBK(arr[0], arr[1]) == expected


if __name__ == "__main__":
    assertRangeBitwiseMethods([5, 7], 4)
    assertRangeBitwiseMethods([0, 1], 0)
    assertRangeBitwiseMethods([8, 12], 8)
    assertRangeBitwiseMethods([0, 2147483647], 0)
    assertRangeBitwiseMethods([2147483646, 2147483647], 2147483646)
