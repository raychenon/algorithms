from typing import List

def findMaxLength(nums: List[int]) -> int:
    index = {0: -1}
    balance = 0
    maxlen = 0
    for i, num in enumerate(nums):
        balance += num - 0.5
        maxlen = max(maxlen, i - index.setdefault(balance, i))
    return maxlen


def assert_methods(expected_result: int, nums: List[int]) -> None:
    assert findMaxLength(nums) == expected_result


def test_findMaxLength():
    assert_methods(2, [0, 1])
    assert_methods(2, [0, 1, 0])
