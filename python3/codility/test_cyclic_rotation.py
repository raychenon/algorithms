#!/bin/python3

import unittest2

from cyclic_rotation import rotate

"""
https://www.hackerrank.com/challenges/a-very-big-sum/problem
"""


class Test_Sum(unittest2.TestCase):


    def test_rotation_1d_array(self):
        self.assertEquals(rotate([1],3), [1])

    def test_rotation_right_2(self):
        self.assertEquals(rotate([1,2,3,4,5],2), [4,5,1,2,3])

    def test_identity_rotation(self):
        self.assertEquals(rotate([1,2,3,4,5],0), [1,2,3,4,5])


if __name__ == '__main__':
    unittest2.main()