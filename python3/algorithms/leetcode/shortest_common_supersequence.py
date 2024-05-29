"""
https://leetcode.com/problems/shortest-common-supersequence/

Given two strings str1 and str2, return the shortest string that has both str1 and str2 as subsequences.  If multiple answers exist, you may return any of them.

(A string S is a subsequence of string T if deleting some number of characters from T (possibly 0, and the characters are chosen anywhere from T) results in the string S.)
"""


def shortestCommonSupersequence(str1: str, str2: str) -> str:
    len1, len2 = len(str1), len(str2)
    dp = [['' for _ in range(len1 + 1)] for _ in range(2)]
    for i1 in range(1, len1 + 1): dp[0][i1] = str1[:i1]  # base cases derived from str1
    for i1 in range(1, len2 + 1):
        dp[1][0] = str2[:i1]  # base cases derived from str2
        for i2 in range(1, len1 + 1):
            if str2[i1 - 1] == str1[i2 - 1]:
                dp[1][i2] = dp[0][i2 - 1] + str1[i2 - 1]
            else:
                dp[1][i2] = min(dp[0][i2] + str2[i1 - 1], dp[1][i2 - 1] + str1[i2 - 1], key=len)
        dp[0] = dp[1][:]
        dp[1] = [""] * len(dp[1])
    return dp[0][-1]


def test_shortest_common_supersequence():
    """
    str1 = "abac" is a subsequence of "cabac" because we can delete the first "c".
    str2 = "cab" is a subsequence of "cabac" because we can delete the last "ac".
    The answer provided is the shortest such string that satisfies these properties.
    """
    assert shortestCommonSupersequence("abac", "abac") == "abac"
