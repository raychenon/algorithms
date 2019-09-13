#!/bin/python3


def roman_to_int(s: str) -> int:
    """
    https://leetcode.com/problems/roman-to-integer
    :param s:
    :return:
    """
    map = {'I': 1, 'V': 5, 'X': 10, 'L': 50, 'C': 100, 'D': 500, 'M': 1000}
    sum = 0
    for i in range(len(s)):
        if (i + 1 < len(s)-1) and map[s[i]] < map[s[i+i]]:
            sum = sum - map[s[i]]
        else:
            sum = sum + map[s[i]]
    return sum

if __name__ == "__main__":
    assert roman_to_int("III") == 1
    assert roman_to_int("MCMXCIV") == 1994