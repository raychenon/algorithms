#!/bin/python3

import unittest2


"""
https://www.hackerrank.com/challenges/a-very-big-sum/problem
"""
def aVeryBigSum(ar):
    sum = 0
    for e in ar:
        sum = sum + e
    return sum


class SumTest(unittest2.TestCase):
    def testSum(self):
        self.assertEquals(aVeryBigSum([4, 5]), 9)

    def testLargerSum(self):
        self.assertEquals(aVeryBigSum([1000000001, 1000000002, 1000000003, 1000000004, 1000000005]), 5000000015)


if __name__ == '__main__':
    unittest2.main()
