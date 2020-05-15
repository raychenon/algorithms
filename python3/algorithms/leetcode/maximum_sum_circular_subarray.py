from typing import List

def maxSubarraySumCircular(A: List[int]) -> int:
    """
    https://leetcode.com/problems/maximum-sum-circular-subarray/
    :param A:
    :return:  maximum possible sum of a non-empty subarray of C.
    """

    total_sum = 0
    for e in A:
        total_sum += e
    return total_sum

if __name__ == "__main__":
    assert maxSubarraySumCircular([1,-2,3,-2]) == 3