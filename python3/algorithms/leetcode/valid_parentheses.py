#!/bin/python3

class ValidParentheses
    def isValid(self, s: str) -> bool:
        stack = []
        mapping = {")": "(", "}": "{", "]": "["}
        opening = {"(", "[", "{"}
        for char in s:
            if char in opening:
                stack.append(char)
            if char in mapping:
                if stack[-1] == char:
                    stack.pop()
                else:
                    return False
        return not stack
