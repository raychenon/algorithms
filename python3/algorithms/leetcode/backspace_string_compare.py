#!/bin/python3
from typing import List

def backspace_compare(S: str, T: str) -> bool:
    """
    https://leetcode.com/problems/backspace-string-compare/
    """
    def backspaced( s: str) -> str:
        ans = []
        for c in s:
            if c != '#':
                ans.append(c)
            elif ans:
                ans.pop()
        return "".join(ans)

    return backspaced(S) == backspaced(T)


if __name__ == '__main__':
    assert backspace_compare("ab#c", "ad#c") == True
    assert backspace_compare("a#c", "b") ==  False
    assert backspace_compare("ab##", "c#d#") == True