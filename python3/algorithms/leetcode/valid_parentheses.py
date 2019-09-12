#!/bin/python3
# import unittest2 as unittest

def is_valid(s: str) -> bool:
    """
    https://leetcode.com/problems/valid-parentheses/
    Time complexity : O(n) because we simply traverse the given string one character at a time and push and pop operations on a stack take O(1) time.
    Space complexity : O(n) as we push all opening brackets onto the stack and in the worst case, we will end up pushing all the brackets onto the stack. e.g. ((((((((((
    """
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



# class ValidParenthsesTest(unittest.TestCase):
#     def test_prent(self):
#         self.assertEquals(is_valid(["()"]), True)
#
# if __name__ == '__main__':
#     unittest.main()


if __name__ == '__main__':
    assert is_valid(["()"]) == True
    assert is_valid(["([{}])"]) == True
    assert is_valid(["(){}[]"]) == True
    assert is_valid(["([{}])"]) == True
    assert is_valid(["(((((((()"]) == False
    assert is_valid(["][)("]) == False
