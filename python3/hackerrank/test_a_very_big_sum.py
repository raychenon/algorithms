#!/bin/python3

import unittest2

from a_very_big_sum import aVeryBigSum

"""
https://www.hackerrank.com/challenges/a-very-big-sum/problem
"""


class Test_Sum(unittest2.TestCase):

    def test_sum_single_element(self):
        self.assertEquals(aVeryBigSum([1]), 1)

    def test_sum(self):
        self.assertEquals(aVeryBigSum([4, 5]), 9)

    def test_larger_sum(self):
        self.assertEquals(aVeryBigSum([1000000001, 1000000002, 1000000003, 1000000004, 1000000005]), 5000000015)


if __name__ == '__main__':
    unittest2.main()
