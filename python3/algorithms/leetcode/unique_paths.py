"""
https://leetcode.com/problems/unique-paths/
"""
from math import factorial


def uniquePaths(m: int, n: int) -> int:
    dp = [[1] * n for _ in range(m)]

    for r in range(1, m):
        for c in range(1, n):
            dp[r][c] = dp[r - 1][c] + dp[r][c - 1]

    return dp[m - 1][n - 1]


def uniquePathsCombinatorial(m: int, n: int) -> int:
    """
    factorial function computed by Peter Borwein
    k! = O(k(log(k)log log(k))^2)

    Time complexity: O( (M + N)(log(M + N) log log (M + N))^2)
    Space complexity: O(1)
    """
    return factorial(m + n - 2) // factorial(n - 1) // factorial(m - 1)


def assert_unique_paths(m, n, expected):
    assert uniquePaths(m, n) == expected
    assert uniquePathsCombinatorial(m, n) == expected


def test_unique_paths():
    assert_unique_paths(3, 2, 3)
    assert_unique_paths(7, 3, 28)
    assert_unique_paths(8, 8, 3432)
