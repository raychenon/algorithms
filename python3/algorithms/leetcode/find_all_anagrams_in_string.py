#!/bin/python3
from typing import List


def find_anagrams(s: str, p: str) -> List[int]:
    """
    https://leetcode.com/problems/find-all-anagrams-in-a-string/
    :param s:
    :param p:
    :return:
    """
    lenP = len(p)
    res: List[int] = []
    signature = count_letters(p)
    for i in range(len(s) - lenP + 1):
        subSeq = s[i:i + lenP]
        if (count_letters(subSeq) == signature):
            res.append(i)
    return res


def count_letters(s: str) -> List[int]:
    """
    create a signature for a string based on frequency of letters, whatever the order of letters.
    :param s: string contains only lower case letter
    :return: a List of frequency. Index = 0 -> 'a', index=25 -> 'z'
    """
    count = [0] * 26
    for c in s:
        count[ord(c) - ord('a')] += 1
    return count


if __name__ == '__main__':
    assert find_anagrams("cbaebabacd", "abc") == [0, 6]
    assert find_anagrams("abab", "ab") == [0, 1, 2]
