#!/bin/python3
from typing import List


def countSquares(matrix: List[List[int]]) -> int:
    """
    https://leetcode.com/problems/count-square-submatrices-with-all-ones/
    """
    res = 0
    for r in range(1, len(matrix)):
        for c in range(1, len(matrix[0])):
            if matrix[r][c] > 0 and r > 0 and c > 0:
                matrix[r][c] = min(matrix[r - 1][c - 1], matrix[r - 1][c], matrix[r][c - 1]) + 1
            res += matrix[r][c]
    return sum(map(sum, matrix))


def countSquares2(matrix: List[List[int]]) -> int:
    """
    https://www.youtube.com/watch?v=ojz8xZc8pog
    from "thecodingworld" channel
    :param matrix:
    :return:
    """
    n = len(matrix)
    m = len(matrix[0])
    dpmatrix = [[0] * (m + 1) for _ in range(n + 1)]
    res = 0

    for row in range(1, n + 1):
        for col in range(1, m + 1):
            if matrix[row - 1][col - 1] > 0:
                dpmatrix[row][col] = 1 + min(
                    dpmatrix[row][col - 1],
                    dpmatrix[row - 1][col],
                    dpmatrix[row - 1][col - 1])
                res += dpmatrix[row][col]
    return res


def assertCountSquares(matrix: List[List[int]], expected: int) -> int:
    assert countSquares(matrix) == expected
    assert countSquares2(matrix) == expected


if __name__ == "__main__":
    assertCountSquares([
        [0, 1, 1, 1],
        [1, 1, 1, 1],
        [0, 1, 1, 1]],
        15)
    assertCountSquares([
        [1, 0, 1],
        [1, 1, 0],
        [1, 1, 0]],
        7)
