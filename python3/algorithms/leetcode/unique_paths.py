"""
https://leetcode.com/problems/unique-paths/
"""


def uniquePaths(m: int, n: int) -> int:
    dp = [[1] * n for _ in range(m)]

    for r in range(1, m):
        for c in range(1, n):
            dp[r][c] = dp[r - 1][c] + dp[r][c - 1]

    return dp[m - 1][n - 1]


if __name__ == "__main__":
    assert uniquePaths(3, 2) == 3
    assert uniquePaths(7, 3) == 28
