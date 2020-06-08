#!/bin/python3
from typing import List

"""
https://leetcode.com/problems/coin-change-2/
"""


def change(amount: int, coins: List[int]) -> int:
    """
    Explanation https://www.youtube.com/watch?v=ruMqWViJ2_U&feature=youtu.be&t=512
    until 18:45
    recursion formula: dp[coin][amount] = dp[c][a] = dp[c][a-ci] + dp[c-1][a] => 2D array

    Time complexity: O(nb coins * amount)
    Space complexity: O(amount)
    :param amount:
    :param coins:
    :return:
    """
    dp = [0] * (amount + 1)
    dp[0] = 1
    for coin in coins:
        for i in range(1, len(dp)):
            if i >= coin:
                dp[i] += dp[i - coin]
    return dp[amount]


if __name__ == "__main__":
    assert change(5, [1, 2, 5]) == 4
    assert change(5, [5, 2, 1]) == 4  # change of coins
    assert change(12, [1, 2, 5]) == 13
    assert change(3, [2]) == 0
    assert change(10, [1]) == 1
