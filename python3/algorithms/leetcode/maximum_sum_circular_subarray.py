from typing import List
import sys


def maxSubarraySumCircular(A: List[int]) -> int:
    """
    https://leetcode.com/problems/maximum-sum-circular-subarray/
    :param A:
    :return:  maximum possible sum of a non-empty subarray of C.
    """

    total_sum = 0
    min_sum = sys.maxsize
    max_sum = -sys.maxsize
    acc_min = 0
    acc_max = 0
    for e in A:
        total_sum += e

        acc_max += e
        max_sum = max(max_sum, acc_max)
        acc_max = 0 if acc_max < 0 else acc_max

        acc_min += e
        min_sum = min(min_sum, acc_min)
        acc_min = 0 if acc_min > 0 else acc_min

    return total_sum if total_sum == min_sum else max(max_sum, total_sum - min_sum)


if __name__ == "__main__":
    assert maxSubarraySumCircular([1, -2, 3, -2]) == 3
    assert maxSubarraySumCircular([3, -1, 2, -1]) == 4
    assert maxSubarraySumCircular([3, -2, 2, -3]) == 3
