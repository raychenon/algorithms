#!/bin/python3
"""
https://www.hackerrank.com/challenges/ctci-ransom-note/problem
Both arrays can be converted to a Map, iterate through each key of ransom
and check if count of magazine is higher or equal to the word count of ransom.
In run time, it will take O(m+r).

There is a shorter way: iterate throught the words of magazine.
Decrease the word count of ransom and remove the key when the count equals 0.
As soon as the ransom map is empty, return true to exit the loop.
"""


def checkMagazine(magazine, ransom):
    if (len(magazine) < len(ransom)):
        return False

    # transform the ransom array into a dictionary ( word -> count )
    ransomMap = {}
    for w in ransom:
        if w in ransomMap:
            ransomMap[w] = ransomMap.get(w, 1) + 1
        else:
            ransomMap[w] = 1

    for w in magazine:
        if w in ransomMap:
            ransomMap[w] = ransomMap.get(w, 0) - 1
            if ransomMap.get(w) == 0:
                del ransomMap[w]

    return (len(ransomMap) == 0)


def assertEquals(a, b):
    return a == b
def test_ransom_note_is_valid():
    assertEquals(
        checkMagazine(['give', 'me', 'one', 'grand', 'today', 'night'], ['give', 'one', 'grand', 'today']), True)

def test_ransom_note_is_equal_to_magazine():
    assertEquals(checkMagazine(['some'], ['some']), True)

def test_ransom_smaller_than_magazine():
    assertEquals(checkMagazine(['catch', 'me', 'if', 'you', 'can'], ['catch', 'me']), True)

def test_ransom_case_sensitive():
    assertEquals(checkMagazine(['me'], ['Me']), False)

def test_ransom_empty():
    assertEquals(checkMagazine(['me'], []), True)

def test_ransom_1():
    assertEquals(
        checkMagazine(
            ["o", "l", "x", "imjaw", "bee", "khmla", "v", "o", "v", "o", "imjaw", "l", "khmla", "imjaw", "x"],
            ["imjaw", "l", "khmla", "x", "imjaw", "o", "l", "l", "o", "khmla", "v", "bee", "o", "o", "imjaw",
             "imjaw", "o"]),
        False)

def test_ransom_2():
    assertEquals(
        checkMagazine(["two", "times", "three", "is", "not", "four"], ["two", "times", "two", "is", "four"]), False)


def test_ransom_3():
    assertEquals(
        checkMagazine(["ive", "got", "a", "lovely", "bunch", "of", "coconuts"], ["ive", "got", "some", "coconuts"]),
        False)
