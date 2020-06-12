from functools import lru_cache
"""
https://leetcode.com/problems/shortest-common-supersequence/

Given two strings str1 and str2, return the shortest string that has both str1 and str2 as subsequences.  If multiple answers exist, you may return any of them.

(A string S is a subsequence of string T if deleting some number of characters from T (possibly 0, and the characters are chosen anywhere from T) results in the string S.)
"""


def shortestCommonSupersequence(str1: str, str2: str) -> str:
    @lru_cache(maxsize=100000)
    def solve(i: int, j: int):
        if i == len(str1): return str2[j:]
        if j == len(str2): return str1[i:]
        if str1[i] == str2[j]: return str1[i] + solve(i + 1, j + 1)
        return min(str1[i] + solve(i + 1, j), str2[j] + solve(i, j + 1), key=len)
    return solve(0,0)

if __name__ == "__main__":
    """
    str1 = "abac" is a subsequence of "cabac" because we can delete the first "c".
    str2 = "cab" is a subsequence of "cabac" because we can delete the last "ac".
    The answer provided is the shortest such string that satisfies these properties.
    """
    assert shortestCommonSupersequence("abac", "abac") == "abac"
