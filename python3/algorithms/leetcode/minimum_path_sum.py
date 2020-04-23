"""
https://leetcode.com/problems/minimum-path-sum/
"""

# O(n) space
def minPathSumNSpace(grid) -> int:
    if not grid:
        return
    r,c = len(grid), len(grid[0])
    cur = [0] * c
    cur[0] = grid[0][0]
    for i in range(1,c):
        cur[i] = cur[i-1] + grid[0][i]
    for j in range(1,r):
        cur[0] += grid[i][0]
        for j in range(1, c):
    cur[j] = min(cur[j-1], cur[j]) + grid[i][j]
    return cur[-1]


def assertMethods(expected, grid):
    assert minPathSumNSpace(grid) == expected


if __name__ == "__main__":
    assertMethods(7,[
        [1,3,1],
        [1,5,1],
        [4,2,1]
    ])
