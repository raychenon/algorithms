from typing import List


def maxUncrossedLines(A: List[int], B: List[int]) -> int:
    """
    https://leetcode.com/problems/uncrossed-lines/

    Best explanations: https://www.youtube.com/watch?v=duCx_62nMOA

    Time complexity: O(len_A * len_B)
    Space complexity: O(len_A * len_B)
    """
    lenA = len(A)
    lenB = len(B)

    dp = [[0] * (lenB + 1) for _ in range(lenA + 1)]
    for r in range(lenA):
        for c in range(lenB):
            if A[r] == B[c]:
                dp[r + 1][c + 1] = 1 + dp[r][c]
            else:
                dp[r + 1][c + 1] = max(dp[r][c + 1], dp[r + 1][c])
    # print(f"matrix {dp}")
    return dp[lenA][lenB]


if __name__ == "__main__":
    assert maxUncrossedLines([1, 4, 2], [1, 2, 4]) == 2
    assert maxUncrossedLines([2, 5, 1, 2, 5], [10, 5, 2, 1, 5, 2]) == 3
    assert maxUncrossedLines([1, 3, 7, 1, 7, 5], [1, 9, 2, 5, 1]) == 2
