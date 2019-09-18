#!/bin/python3
from typing import List


def rotate(matrix: List[List[int]]) -> None:
    """
    https://leetcode.com/problems/rotate-image
        Time  complexity: O(n^2)
        Space complexity: O(1)
    :param matrix:
    :return:
    """
    n = len(matrix[0])
    # in Python // is floor division to divide then round down
    for i in range(n // 2 + n % 2):
        for j in range(n // 2):
            temp = matrix[n - 1 - j][i]
            matrix[n - 1 - j][i] = matrix[n - i - 1][n - j - 1]  #
            matrix[n - 1 - i][n - j - 1] = matrix[j][n - 1 - i]
            matrix[j][n - 1 - i] = matrix[i][j]
            matrix[i][j] = temp


if __name__ == "__main__":
    assert rotate([[1, 2, 3], [4, 5, 6], [7, 8, 9]]) == [[7, 4, 1], [8, 5, 2], [9, 6, 3]]
