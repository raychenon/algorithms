#!/bin/python3


def longestCommonSubsequence(text1: str, text2: str) -> int:
    """
    https://leetcode.com/problems/longest-common-subsequence/
    """
    # If text1 doesn't reference the shortest string, swap them.
    if len(text2) < len(text1):
        text1, text = text2, text1

    previous = [0] * (len(text1) + 1)

    for col in reversed(range(len(text2))):
        # Create a new array to represent the current column.
        current = [0] * (len(text1) + 1)
        for row in reversed(range(len(text1))):
            if text2[col] == text1[row]:
                current[row] = 1 + previous[row + 1]
            else:
                current[row] = max(previous[row], current[row + 1])
        # The current column becomes the previous one.
        previous = current

    # The original problem's answer is in previous[0]. Return it.
    return previous[0]


def assert_longest_common_subsequence(text1: str, text2: str, expected: int) -> None:
    assert longestCommonSubsequence(text1, text2) == expected


if __name__ == "__main__":
    assert_longest_common_subsequence("abcde", "ace", 3)
    assert_longest_common_subsequence("abc", "abc", 3)
    assert_longest_common_subsequence("abc", "def", 0)
