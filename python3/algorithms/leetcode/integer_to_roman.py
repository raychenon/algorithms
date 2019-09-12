#!/bin/python3

def int_to_roman(num: int) -> str:
    """
    https://leetcode.com/problems/integer-to-roman
    :param num: integer
    :return: Roman representation
    """
    tupleList = [(1, "I"), (4, "IV"), (5, "V"), (9, "IX"), (10, "X"), (40, "XL"), (50, "L"), (90, "XC"), (100, "C"),
                 (400, "CD"), (500, "D"), (900, "CM"), (1000, "M")]
    res = ""
    index = len(tupleList) - 1
    while num != 0:
        if num >= tupleList[index][0]:
            num = num - tupleList[index][0]
            res = res + tupleList[index][1]
        else:
            index = index - 1
    return res


if __name__ == "__main__":
    assert int_to_roman(1) == "I"
    assert int_to_roman(3) == "III"
    assert int_to_roman(3999) == "MMMCMXCIX"
