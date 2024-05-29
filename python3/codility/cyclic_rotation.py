#!/bin/python3

"""
https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/
Right rotation
"""


def rotate(arr, k):
    rotations = k % len(arr)
    return arr[-rotations:] + arr[:-rotations]


def test_rotation_1d_array():
    assert rotate([1], 3) == [1]


def test_rotation_right_2():
    assert rotate([1, 2, 3, 4, 5], 2) == [4, 5, 1, 2, 3]


def test_identity_rotation():
    assert rotate([1, 2, 3, 4, 5], 0) == [1, 2, 3, 4, 5]
