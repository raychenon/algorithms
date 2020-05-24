from typing import List


def maximalSquare(matrix: List[List[int]]) -> int:
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

    # print(f" matrix = {matrix}")

    for r in range(rows):
        for c in range(cols):
            if matrix[r][c] == 1:
                # Careful of the indexing since dp grid has additional row and column
                dp[r + 1][c + 1] = min(dp[r][c], dp[r + 1][c], dp[r][c + 1]) + 1
                max_len = max(max_len, dp[r + 1][c + 1])

    # print(f" dp = {dp}")
    # print(f" max = {max_len}")
    return max_len * max_len


if __name__ == "__main__":
    assert 4 == maximalSquare([[1, 0, 1, 0, 0],
                               [1, 0, 1, 1, 1],
                               [1, 1, 1, 1, 1],
                               [1, 0, 0, 1, 0]])
