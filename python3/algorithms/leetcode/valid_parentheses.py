#!/bin/python3


def isValid(s: str) -> bool:
    stack = []
    mapping = {")": "(", "}": "{", "]": "["}
    opening = {"(", "[", "{"}
    for char in s:
        if char in opening:
            stack.append(char)
            print("stack ", stack)
        if char in mapping:
            top_element = stack.pop() if stack else '+'
            if mapping[char] != top_element:
                return False
    return not stack


if __name__ == '__main__':
    assert isValid(["()"]) == True
    assert isValid(["([{}])"]) == True
    assert isValid(["(){}[]"]) == True
    assert isValid(["([{}])"]) == True
    assert isValid(["(])"]) == False
    assert isValid(["][)("]) == False
