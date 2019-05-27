#!/bin/python3


import unittest2 as unittest

from jumping_on_the_clouds import jumpingOnClouds

"""
https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem
Jump 1 or 2 steps on the cloud ( marked by 0).
The thunder clouds (marked by 1) have to be avoided.
"""


class Test_jumping_on_clouds(unittest.TestCase):

    def test_case_0(self):
        self.assertEquals(jumpingOnClouds([0, 0, 1, 0, 0, 1, 0]), 4)

    def test_case_1(self):
        self.assertEquals(jumpingOnClouds([0, 0, 0, 1, 0, 0]), 3)

    def test_case_contain_only_0(self):
        self.assertEquals(jumpingOnClouds([0, 0, 0, 0, 0, 0]), 3)


if __name__ == '__main__':
    unittest.main()
