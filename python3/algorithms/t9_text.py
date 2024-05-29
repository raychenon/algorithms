#!/bin/python3

from typing import List


def filter_words(combination: int, dictionary):
    return dictionary.get(combination, "")


def build_dictionary(words: List[str]):
    dictionary = dict()
    for word in words:
        key = 0
        for c in word:
            key = key * 10 + key_combination(c)
        print(word)
        if word not in dictionary:
            se = [word]
            dictionary[key] = se
        else:
            se = dictionary.get(key)
            se.append(word)
            dictionary[key] = se

    return dictionary


def key_combination(c):
    return {
        'a': 2,
        'b': 2,
        'c': 2,
        'd': 3,
        'e': 3,
        'f': 3,
        'g': 4,
        'h': 4,
        'i': 4,
        'j': 5,
        'k': 5,
        'l': 5,
        'm': 6,
        'n': 6,
        'o': 6,
        'p': 7,
        'q': 7,
        'r': 7,
        's': 7,
        't': 8,
        'u': 8,
        'v': 8,
        'w': 9,
        'x': 9,
        'y': 9,
        'z': 9
    }.get(c, 0)


def test_t9_text():
    dico = build_dictionary(["the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog", "eox"])
    # "eox" has the same combination as "fox"
    print(dico)
    assert filter_words(27696,dico) == ['brown']
    assert filter_words(1,dico) == ""

    assert filter_words(369, dico) == ['eox'] # should be ['fox','eox']
