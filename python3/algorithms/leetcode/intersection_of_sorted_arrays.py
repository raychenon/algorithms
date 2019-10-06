#!/bin/python3
from typing import List


def arraysIntersection(arr1: List[int], arr2: List[int], arr3: List[int]) -> List[int]:
    """
    https://leetcode.com/problems/intersection-of-three-sorted-arrays
    :param arr1:
    :param arr2:
    :param arr3:
    :return:
    """
    res = []
    i1, i2, i3 = 0, 0, 0
    while i1 < len(arr1) and i2 < len(arr2) and i3 < len(arr3):
        minVal = min(arr1[i1], min(arr2[i2], arr3[i3]))
        if (minVal == arr1[i1] and minVal == arr2[i2] and minVal == arr3[i3]):
            res.append(minVal)

        if arr1[i1] == minVal:
            i1 = i1 + 1
        if arr2[i2] == minVal:
            i2 = i2 + 1
        if arr3[i3] == minVal:
            i3 = i3 + 1
    return res


if __name__ == "__main__":
    assert [1, 5] == arraysIntersection([1, 3, 5, 6], [1, 2, 5, 7, 9], [1, 3, 4, 5, 8])
    assert [] == arraysIntersection([1, 3, 5, 6], [2, 7], [8])
