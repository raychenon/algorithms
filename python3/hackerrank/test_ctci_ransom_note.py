#!/bin/python3


import unittest2 as unittest

from ctci_ransom_note import checkMagazine

""""
https://www.hackerrank.com/challenges/ctci-ransom-note/problem
"""


class Test_ransom_note(unittest.TestCase):

    def test_ransom_note_is_valid(self):
        self.assertEquals(
            checkMagazine(['give', 'me', 'one', 'grand', 'today', 'night'], ['give', 'one', 'grand', 'today']), True)

    def test_ransom_note_is_equal_to_magazine(self):
        self.assertEquals(checkMagazine(['some'], ['some']), True)

    def test_ransom_smaller_than_magazine(self):
        self.assertEquals(checkMagazine(['catch', 'me', 'if', 'you', 'can'], ['catch', 'me']), True)

    def test_ransom_case_sensitive(self):
        self.assertEquals(checkMagazine(['me'], ['Me']), False)

    def test_ransom_empty(self):
        self.assertEquals(checkMagazine(['me'], []), True)

    def test_ransom_1(self):
        self.assertEquals(
            checkMagazine(
                ["o", "l", "x", "imjaw", "bee", "khmla", "v", "o", "v", "o", "imjaw", "l", "khmla", "imjaw", "x"],
                ["imjaw", "l", "khmla", "x", "imjaw", "o", "l", "l", "o", "khmla", "v", "bee", "o", "o", "imjaw",
                 "imjaw", "o"]),
            False)

    def test_ransom_2(self):
        self.assertEquals(
            checkMagazine(["two", "times", "three", "is", "not", "four"], ["two", "times", "two", "is", "four"]), False)

    def test_ransom_3(self):
        self.assertEquals(
            checkMagazine(["ive", "got", "a", "lovely", "bunch", "of", "coconuts"], ["ive", "got", "some", "coconuts"]),
            False)


if __name__ == '__main__':
    unittest.main()
