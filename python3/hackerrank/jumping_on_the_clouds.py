#!/bin/python3

"""
https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem
Jump 1 or 2 steps on the cloud ( marked by 0).
The thunder clouds (marked by 1) have to be avoided.
"""


def jumpingOnClouds(c):
    i = 0
    nbJump = 0
    while (i < len(c) - 1):
        if (c[i] == 0):
            i += 1
        nbJump += 1
        i += 1
    return nbJump


def assertEquals(a, b):
    return a == b


def test_case_0():
    assertEquals(jumpingOnClouds([0, 0, 1, 0, 0, 1, 0]), 4)


def test_case_1():
    assertEquals(jumpingOnClouds([0, 0, 0, 1, 0, 0]), 3)


def test_case_contain_only_0():
    assertEquals(jumpingOnClouds([0, 0, 0, 0, 0, 0]), 3)
