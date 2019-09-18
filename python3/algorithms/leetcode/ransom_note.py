#!/bin/python3

def can_construct(ransomNote: str, magazine: str) -> bool:
    """
    https://leetcode.com/problems/ransom-note/
    time complexity: O(n)
    space complexity: O(M+R)
    :param ransomNote:
    :param magazine:
    :return: boolean
    """
    mapMagazine = dict()
    for c in magazine:
        mapMagazine[c] = mapMagazine.get(c, 0) + 1

    for c in ransomNote:
        if c not in mapMagazine:
            return False
        else:
            mapMagazine[c] = mapMagazine.get(c, 0) - 1
            if mapMagazine.get(c) <= 0:
                del mapMagazine[c]

    return True


if __name__ == "__main__":
    assert can_construct("a", "b") == False
    assert can_construct("aa", "ab") == False
    assert can_construct("aa", "aab") == True