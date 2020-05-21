#!/bin/python3
from typing import List

def countSquares(self, matrix: List[List[int]]) -> int:
    """
    https://leetcode.com/problems/count-square-submatrices-with-all-ones/
    """
    res = 0
    for r in range(1, len(matrix)):
        for c in range(1, len(matrix[0])):
            if matrix[r][c] > 0 and r > 0 and c > 0:
                matrix[r][c] = min(matrix[r-1][c-1],matrix[r-1][c],matrix[r][c-1])+1

            res += matrix[r][c]

    return res


if __name__ == "__main__":
    assert countSquares([
        [0,1,1,1],
        [1,1,1,1],
        [0,1,1,1]]) == 15
    assert countSquares([
        [1,0,1],
        [1,1,0],
        [1,1,0]
    ]) == 7