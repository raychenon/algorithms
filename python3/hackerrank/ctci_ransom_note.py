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
            if len(ransomMap) == 0:
                return True

    return False

