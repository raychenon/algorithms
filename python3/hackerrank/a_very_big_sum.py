#!/bin/python3

"""
https://www.hackerrank.com/challenges/a-very-big-sum/problem
"""


def aVeryBigSum(ar):
    sum = 0
    for e in ar:
        sum = sum + e
    return sum


def test_sum_single_element():
    assert aVeryBigSum([1]) == 1


def test_sum():
    assert aVeryBigSum([4, 5]) == 9


def test_larger_sum():
    assert aVeryBigSum([1000000001, 1000000002, 1000000003, 1000000004, 1000000005]) == 5000000015
