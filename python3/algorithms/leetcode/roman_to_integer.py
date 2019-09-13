#!/bin/python3


def roman_to_int(s: str) -> int:
    """
    https://leetcode.com/problems/roman-to-integer
    time complexity: O(n) where n is the length of the String
    space complexity: 0(1) constant
    :param s:
    :return:
    """
    map = {'I': 1, 'V': 5, 'X': 10, 'L': 50, 'C': 100, 'D': 500, 'M': 1000}
    sum = 0
    for i in range(len(s)):
        # Trick: if the next Char has a bigger value then the current int value is negative
        # ex: IV = 4 = -1 + 5
        # IX = -1 + 10 = 9
        if (i + 1 < len(s)) and map[s[i]] < map[s[i + 1]]:
            sum = sum - map[s[i]]
        else:
            sum = sum + map[s[i]]
        # can also be written as ternary operator
        # signed = -map[s[i]] if ((i + 1 < len(s)) and map[s[i]] < map[s[i + 1]]) else map[s[i]]
    return sum


if __name__ == "__main__":
    assert roman_to_int("III") == 3
    assert roman_to_int("LVIII") == 58
    assert roman_to_int("MCMXCIV") == 1994
    assert roman_to_int("MMMCMXCIX") == 3999
