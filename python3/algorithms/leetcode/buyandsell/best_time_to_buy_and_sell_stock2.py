#!/bin/python3
from typing import List


def max_profit(prices: List[int]) -> int:
    """
    https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
    """
    profit = 0
    for i in range(0, len(prices) - 1):
        if prices[i + 1] > prices[i]:
            profit += prices[i + 1] - prices[i]

    return profit


def test_max_profit():
    assert max_profit([7, 1, 5, 3, 6, 4]) == 7
    assert max_profit([1, 2, 3, 4, 5]) == 4
    assert max_profit([7, 6, 4, 3, 1]) == 0
    assert max_profit([7, 6, 4, 3, 1, 2]) == 1
    assert max_profit([]) == 0
