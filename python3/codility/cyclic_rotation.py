#!/bin/python3

"""
https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/
Right rotation
"""
def rotate(arr, k):
    rotations = k % len(arr)
    return arr[-rotations:] + arr[:-rotations]
