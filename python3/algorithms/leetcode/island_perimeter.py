from typing import List

"""
https://leetcode.com/problems/island-perimeter/
"""


def islandPerimeter(grid: List[List[int]]) -> int:
    """
    Time complexity: O(nrows * ncol)
    Space complexity: O(1)
    """
    if not grid:
        return 0

    result = 0
    nrow = len(grid)
    ncol = len(grid[0])
    for r in range(nrow):
        for c in range(ncol):
            if grid[r][c] == 0:
                continue

            # check if top or bottom side is not a 1 (land) then add this side
            if r == 0 or grid[r - 1][c] == 0:
                result += 1
            if r == nrow - 1 or grid[r + 1][c] == 0:
                result += 1
            # check if left or right side is 0 (water) then add this side
            if c == 0 or grid[r][c - 1] == 0:
                result += 1
            if c + 1 == ncol or grid[r][c + 1] == 0:
                result += 1

    return result


def test_island_perimeter():
    assert 16 == islandPerimeter([[0, 1, 0, 0],
                                   [1, 1, 1, 0],
                                   [0, 1, 0, 0],
                                   [1, 1, 0, 0]])
