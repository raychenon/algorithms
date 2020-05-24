from typing import List


def maximalSquare(matrix: List[List[str]]) -> int:
    """
    https://leetcode.com/problems/maximal-square/

    Nice explanation https://leetcode.com/problems/maximal-square/discuss/600149/Python-Thinking-Process-Diagrams-DP-Approach
    :param matrix:
    :return:
    """
    rows = len(matrix)
    cols = len(matrix[0])
    dp = [[0] * (cols + 1) for _ in range(rows + 1)]
    max_len = 0

    for r in range(1, rows):
        for c in range(1, cols):
            if matrix[r - 1][c - 1] == '1':
                dp[r][c] = min(dp[r - 1][c - 1], dp[r - 1][c], dp[r][c - 1]) + 1
                max_len = max(max_len, dp[r][c])

    print(f" max = {max_len}")
    return max_len * max_len


if __name__ == "__main__":
    assert 4 == maximalSquare([[1, 0, 1, 0, 0], [1, 0, 1, 1, 1], [1, 1, 1, 1, 1], [1, 0, 0, 1, 0]])
